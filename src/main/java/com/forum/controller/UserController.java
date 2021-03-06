package com.forum.controller;

import com.forum.domain.LoginLog;
import com.forum.domain.User;
import com.forum.service.impl.LoginLogServiceImpl;
import com.forum.service.impl.TopicServiceImpl;
import com.forum.service.impl.UserServiceImpl;
import com.forum.util.ProduceMD5;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.*;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 16:20 2018/5/27
 * @Modified By:
 */
@Controller
public class UserController {

    @Autowired
    public UserServiceImpl userService;

    @Autowired
    public LoginLogServiceImpl loginLogService;

    @Autowired
    public TopicServiceImpl topicService;

    @RequestMapping("/user/add/do")
    public String addUser(HttpServletRequest request) {
        //新建User对象
        User user = new User();
        //处理手机号
        String phoneNum = request.getParameter("tel");
        String areaCode = request.getParameter("areaCode");
        String phone = areaCode + phoneNum;
        //用户类型
        Byte type=new Byte("0");
        String password = ProduceMD5.getMD5(request.getParameter("password"));
        //生成随机数，用于生成头像URL
        Random rand = new Random();
        int randomNum = rand.nextInt(10) + 1;
        String avatarUrl="/img/avatar/avatar-default-"+randomNum+".png";
        //初始化User对象
        user.setUsername(request.getParameter("username"));
        user.setPassword(password);
        user.setEmail(request.getParameter("email"));
        user.setPhoneNum(phone);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setCredit(0);
        user.setType(type);
        user.setAvatar(avatarUrl);

        boolean ifSucc=userService.addUser(user);
        System.out.print(ifSucc);
        return "redirect:/";
    }


    /**
     * 用户登陆
     * @param request
     * @param session
     * @return 0:用户名不存在 1:密码错误 2:登录成功
     */
    @RequestMapping("/api/loginCheck")
    @ResponseBody
    public Object signin(HttpServletRequest request,HttpSession session){
        //处理参数
        String password=ProduceMD5.getMD5(request.getParameter("password"));
        String username=request.getParameter("username");
        //验证用户名密码
        int loginVerify=userService.login(username,password);

        HashMap<String, String> res = new HashMap<String, String>();

        //登录成功
        if(loginVerify == 2){
            User user =userService.getUserByUsername(username);
            Integer userId=user.getId();
            //添加积分
            boolean ifSuccAddCredit=userService.addCredit(1,userId);
            //用户信息写入session
            session.setAttribute("userId",userId);
            session.setAttribute("username",username);
            //获取登录信息
            String ip=getRemortIP(request);
            UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
            //获取用户的浏览器名
            String userbrowser = userAgent.getBrowser().toString();
            //写入登录日志
            LoginLog log=new LoginLog();
            log.setDevice(userbrowser);
            log.setIp(ip);
            log.setUserId(userId);
            log.setLoginTime(new Date());
            boolean ifSuccAddLog=loginLogService.addLog(log);

            res.put("stateCode", "2");
        }
        //密码错误
        else if (loginVerify == 1){
            res.put("stateCode", "1");
        }
        //用户名不存在
        else {
            res.put("stateCode", "0");
        }
        return res;
    }

}
