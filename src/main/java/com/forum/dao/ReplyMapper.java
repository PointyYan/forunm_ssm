package com.forum.dao;

import com.forum.domain.Reply;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 14:45 2018/5/27
 * @Modified By:
 */
public interface ReplyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Reply record);

    int insertSelective(Reply record);

    Reply selectByPrimaryKey(Long id);

    List<Reply> getRepliesOfTopic(Integer topicId);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKeyWithBLOBs(Reply record);

    int updateByPrimaryKey(Reply record);

    int getRepliesNum(Integer topicId);
}
