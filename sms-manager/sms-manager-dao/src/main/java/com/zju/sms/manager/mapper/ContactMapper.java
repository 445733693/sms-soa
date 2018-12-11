package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.Contact;
import java.util.List;

public interface ContactMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Contact record);

    Contact selectByPrimaryKey(Integer id);

    List<Contact> selectAll();

    int updateByPrimaryKey(Contact record);
}