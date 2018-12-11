package com.zju.sms.record.mapper;

import com.zju.sms.record.domain.SendRecord;
import java.util.List;

public interface SendRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SendRecord record);

    SendRecord selectByPrimaryKey(Integer id);

    List<SendRecord> selectAll();

    int updateByPrimaryKey(SendRecord record);
}