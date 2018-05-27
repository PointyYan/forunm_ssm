package com.forum.dao;

import com.forum.domain.Topic;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 14:50 2018/5/27
 * @Modified By:
 */
public interface TopicMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Topic record);

    int insertSelective(Topic record);

    Topic selectById(Integer id);

    List<Topic> listTopicsAndUsers();

    List<Topic> listTopicsAndUsersOfTab(Integer tabId);

    List<Topic>  listMostCommentsTopics();

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKeyWithBLOBs(Topic record);

    int updateByPrimaryKey(Topic record);

    List<Topic> getAllTopics();

    int clickAddOne(Integer id);

    //获取主题总数
    int getTopicsNum();

}
