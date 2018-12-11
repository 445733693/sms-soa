package com.zju.sms.record.mapper;

import com.zju.sms.record.domain.ReceiveRecord;
import java.util.List;

public interface ReceiveRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReceiveRecord record);

    ReceiveRecord selectByPrimaryKey(Integer id);

    List<ReceiveRecord> selectAll();

    int updateByPrimaryKey(ReceiveRecord record);
}