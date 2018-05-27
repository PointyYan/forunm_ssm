package com.forum.service;

import com.forum.domain.Reply;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 16:04 2018/5/27
 * @Modified By:
 */
public interface ReplyService {

    List<Reply> getRepliesOfTopic(Integer topicId);

    boolean addReply(Reply reply);

    int repliesNum(Integer topicId);
}
