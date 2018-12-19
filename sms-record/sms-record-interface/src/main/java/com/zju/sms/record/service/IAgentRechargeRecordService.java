package com.zju.sms.record.service;

import com.zju.sms.record.domain.AgentRechargeRecord;
import java.util.List;

public interface IAgentRechargeRecordService {
    void save(AgentRechargeRecord agentRechargeRecord);
    void delete(Integer id);
    void update(AgentRechargeRecord agentRechargeRecord);
    AgentRechargeRecord get(Integer id);
    List<AgentRechargeRecord> getAll();
}
