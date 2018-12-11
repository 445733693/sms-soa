package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.MessageDraft;
import java.util.List;

public interface MessageDraftMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MessageDraft record);

    MessageDraft selectByPrimaryKey(Integer id);

    List<MessageDraft> selectAll();

    int updateByPrimaryKey(MessageDraft record);
}