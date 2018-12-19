package com.zju.sms.record.service.impl;

import com.zju.sms.record.domain.AgentRechargeRecord;
import com.zju.sms.record.mapper.AgentRechargeRecordMapper;
import com.zju.sms.record.service.IAgentRechargeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentRechargeRecordServiceImpl implements IAgentRechargeRecordService {
    @Autowired
    private AgentRechargeRecordMapper agentRechargeRecordMapper;

    @Override
    public void save(AgentRechargeRecord agentRechargeRecord) {
        agentRechargeRecordMapper.insert(agentRechargeRecord);
    }

    @Override
    public void delete(Integer id) {
        agentRechargeRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(AgentRechargeRecord agentRechargeRecord) {
        agentRechargeRecordMapper.updateByPrimaryKey(agentRechargeRecord);
    }

    @Override
    public AgentRechargeRecord get(Integer id) {
        return agentRechargeRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<AgentRechargeRecord> getAll() {
        return agentRechargeRecordMapper.selectAll();
    }
}
