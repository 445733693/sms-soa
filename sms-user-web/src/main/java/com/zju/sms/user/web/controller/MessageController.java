package com.zju.sms.user.web.controller;

import com.zju.sms.message.dto.MessageInfo;
import com.zju.sms.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private MessageService messageService;

    @RequestMapping("/send")
    public String send(@RequestBody MessageInfo messageInfo){
        String ret = messageService.send(messageInfo);
        System.out.println("get send ret="+ret);
        return "success";
    }
}
