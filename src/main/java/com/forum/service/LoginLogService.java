package com.forum.service;

import com.forum.domain.LoginLog;
import com.forum.domain.User;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 16:03 2018/5/27
 * @Modified By:
 */
public interface LoginLogService {

    /**
     * 插入一条登录日志
     */
    boolean addLog(LoginLog log);

}
