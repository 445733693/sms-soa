package com.zju.sms.record.service.impl;

import com.zju.sms.record.domain.ReceiveRecord;
import com.zju.sms.record.mapper.ReceiveRecordMapper;
import com.zju.sms.record.service.IReceiveRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReceiveRecordServiceImpl implements IReceiveRecordService {
    @Autowired
    private ReceiveRecordMapper receiveRecordMapper;
    @Override
    public void save(ReceiveRecord receiveRecord) {
        receiveRecord.setDate(new Date());
        receiveRecordMapper.insert(receiveRecord);
    }

    @Override
    public void delete(Integer id) {
        receiveRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(ReceiveRecord receiveRecord) {
        receiveRecordMapper.updateByPrimaryKey(receiveRecord);
    }

    @Override
    public ReceiveRecord get(Integer id) {
        return receiveRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ReceiveRecord> getAll() {
        return receiveRecordMapper.selectAll();
    }
}
