package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.Deduction;
import java.util.List;

public interface DeductionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Deduction record);

    Deduction selectByPrimaryKey(Integer id);

    List<Deduction> selectAll();

    int updateByPrimaryKey(Deduction record);
}