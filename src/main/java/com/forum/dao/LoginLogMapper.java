package com.forum.dao;

import com.forum.domain.LoginLog;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 14:45 2018/5/27
 * @Modified By:
 */
public interface LoginLogMapper {

    int deleteByPrimaryKey(Long id);

    int insert(LoginLog record);

    int insertSelective(LoginLog record);

    LoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);

}
