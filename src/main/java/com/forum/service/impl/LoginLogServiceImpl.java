package com.forum.service.impl;

import com.forum.dao.LoginLogMapper;
import com.forum.domain.LoginLog;
import com.forum.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 16:14 2018/5/27
 * @Modified By:
 */
@Service
public class LoginLogServiceImpl implements LoginLogService {

    @Autowired
    public LoginLogMapper loginLogDao;

    public boolean addLog(LoginLog log) {

        return loginLogDao.insert(log) > 0;
    }
}
