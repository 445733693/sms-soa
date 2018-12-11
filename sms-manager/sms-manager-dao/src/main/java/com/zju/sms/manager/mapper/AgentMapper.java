package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.Agent;
import java.util.List;

public interface AgentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Agent record);

    Agent selectByPrimaryKey(Integer id);

    List<Agent> selectAll();

    int updateByPrimaryKey(Agent record);

    Agent selectByUsername(String username);
}