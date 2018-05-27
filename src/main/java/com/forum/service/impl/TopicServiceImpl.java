package com.forum.service.impl;

import com.forum.dao.TopicMapper;
import com.forum.domain.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 16:17 2018/5/27
 * @Modified By:
 */
@Service
public class TopicServiceImpl {

    @Autowired
    public TopicMapper topicDao;

    //获取全部主题
    public List<Topic> getAllTopics() {
        return topicDao.getAllTopics();
    }

    //获取指定id主题
    public Topic selectById(Integer id) {
        Topic topic=topicDao.selectById(id);
        return topic;
    }

    public List<Topic> listMostCommentsTopics() {
        return topicDao.listMostCommentsTopics();
    }

    public boolean addTopic(Topic topic) {
        return topicDao.insert(topic)>0;
    }

    public boolean clickAddOne(Integer id) {
        return topicDao.clickAddOne(id)>0;
    }

    public int getTopicsNum() {
        return topicDao.getTopicsNum();
    }

    public List<Topic> listTopicsAndUsers() {
        return topicDao.listTopicsAndUsers();
    }

    public List<Topic> listTopicsAndUsersOfTab(Integer tabId) {
        return topicDao.listTopicsAndUsersOfTab(tabId);
    }

}
