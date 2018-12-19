package com.zju.sms.admin.web.controller;

import com.zju.sms.common.util.UpdateUtil;
import com.zju.sms.manager.domain.Agent;
import com.zju.sms.manager.service.IAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgentController {
    @Autowired
    private IAgentService agentService;

    @RequestMapping(value = "/agents",method = RequestMethod.POST)
    public String saveAgent(@RequestBody Agent agent){
        agentService.save(agent);
        return"success";
    }
    @RequestMapping(value = "/agents",method = RequestMethod.PUT)
    public String updateAgent(@RequestBody Agent agent){
        Agent old = agentService.get(agent.getId());
        UpdateUtil.updateIfNotNull(old,agent);
        agentService.update(old);
        return"success";
    }
    @RequestMapping(value = "/agents/{id}",method = RequestMethod.DELETE)
    public String deleteAgent(@PathVariable("id") Integer id){
        agentService.delete(id);
        return"success";
    }
    @RequestMapping(value = "/agents/{id}",method = RequestMethod.GET)
    public Agent getAgent(@PathVariable("id") Integer id){
        return agentService.get(id);
    }
    @RequestMapping(value = "/agents",method = RequestMethod.GET)
    public List<Agent> getAgent(){
        return agentService.getAll();
    }
//    @RequestMapping(value = "/agents",method = RequestMethod.GET)
//    public Agent getAgentUser(@RequestBody String username){
//        return agentService.getByUsername(username);
//    }
}
