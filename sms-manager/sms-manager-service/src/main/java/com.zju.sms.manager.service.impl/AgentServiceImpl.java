package com.zju.sms.manager.service.impl;


import com.zju.sms.manager.mapper.AgentMapper;
import com.zju.sms.manager.service.IAgentService;
import com.zju.sms.manager.domain.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentServiceImpl implements IAgentService {
    @Autowired
    private AgentMapper agentMapper;


    @Override
    public void save(Agent agent) {
        agentMapper.insert(agent);
    }

    @Override
    public void delete(Integer id) {
        agentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Agent agent) {
        agentMapper.updateByPrimaryKey(agent);
    }

    @Override
    public Agent get(Integer id) {
        return agentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Agent> getAll() {
        return agentMapper.selectAll();
    }

    @Override
    public Agent getByUsername(String username) {
        return agentMapper.selectByUsername(username);
    }
}
