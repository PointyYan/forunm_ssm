package com.forum.domain;

import java.util.Date;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 14:01 2018/5/27
 * @Modified By:
 */
public class LoginLog extends BaseDomain {
    private Long id;

    private Integer userId;

    private Date loginTime;

    private String ip;

    private String device;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }
}
