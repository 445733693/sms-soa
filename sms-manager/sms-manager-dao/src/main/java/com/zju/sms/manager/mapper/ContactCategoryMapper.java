package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.ContactCategory;
import java.util.List;

public interface ContactCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ContactCategory record);

    ContactCategory selectByPrimaryKey(Integer id);

    List<ContactCategory> selectAll();

    int updateByPrimaryKey(ContactCategory record);
}