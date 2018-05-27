package com.forum.domain;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 14:01 2018/5/27
 * @Modified By:
 */
public class BaseDomain implements Serializable {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
