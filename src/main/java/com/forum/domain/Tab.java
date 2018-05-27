package com.forum.domain;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 14:02 2018/5/27
 * @Modified By:
 */
public class Tab extends BaseDomain {
    private Integer id;

    private String tabName;

    private String tabNameEn;

    private List<Topic> topics;

    public String getTabNameEn() {
        return tabNameEn;
    }

    public void setTabNameEn(String tabNameEn) {
        this.tabNameEn = tabNameEn;
    }



    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }
}
