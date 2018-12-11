package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.PhoneLibCategory;
import java.util.List;

public interface PhoneLibCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PhoneLibCategory record);

    PhoneLibCategory selectByPrimaryKey(Integer id);

    List<PhoneLibCategory> selectAll();

    int updateByPrimaryKey(PhoneLibCategory record);
}