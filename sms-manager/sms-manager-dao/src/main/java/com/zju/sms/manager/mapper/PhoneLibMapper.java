package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.PhoneLib;
import java.util.List;

public interface PhoneLibMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PhoneLib record);

    PhoneLib selectByPrimaryKey(Integer id);

    List<PhoneLib> selectAll();

    int updateByPrimaryKey(PhoneLib record);
}