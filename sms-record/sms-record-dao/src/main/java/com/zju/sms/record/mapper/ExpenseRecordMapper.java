package com.zju.sms.record.mapper;

import com.zju.sms.record.domain.ExpenseRecord;
import java.util.List;

public interface ExpenseRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExpenseRecord record);

    ExpenseRecord selectByPrimaryKey(Integer id);

    List<ExpenseRecord> selectAll();

    int updateByPrimaryKey(ExpenseRecord record);
}