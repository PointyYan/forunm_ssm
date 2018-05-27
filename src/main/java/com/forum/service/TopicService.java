package com.forum.service;

import com.forum.domain.Topic;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 16:12 2018/5/27
 * @Modified By:
 */
public interface TopicService {

    /**
     * 获取全部主题
     */
    List<Topic> getAllTopics();

    /**
     * 获取全部主题及用户信息 用于渲染首页
     */
    List<Topic> listTopicsAndUsers();

    /**
     * 获取最多评论主题列表
     * @return
     */
    List<Topic> listMostCommentsTopics();

    /**
     * 获取全部主题及用户信息 用于渲染板块页面
     */
    List<Topic> listTopicsAndUsersOfTab(Integer tabId);

    /**
     * 获取指定ID主题
     */
    Topic selectById(Integer id);

    /**
     * 新建主题
     */
    boolean addTopic(Topic topic);

    /**
     * 点击量加一
     */
    boolean clickAddOne(Integer id);

    /**
     * 获取主题总数
     */
    int getTopicsNum();


}
