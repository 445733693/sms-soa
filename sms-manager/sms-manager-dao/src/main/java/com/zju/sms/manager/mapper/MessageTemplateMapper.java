package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.MessageTemplate;
import java.util.List;

public interface MessageTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MessageTemplate record);

    MessageTemplate selectByPrimaryKey(Integer id);

    List<MessageTemplate> selectAll();

    int updateByPrimaryKey(MessageTemplate record);
}