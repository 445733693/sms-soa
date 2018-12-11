package com.zju.sms.message.service.impl;

import com.zju.sms.message.dto.MessageInfo;
import com.zju.sms.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.*;

@Service("messageServiceImpl")
public class MessageServiceImpl implements MessageService{
    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    @Qualifier("topicDestination")//xml文件里配置的话题的id
    private Destination destination;

    @Override
    public String send(MessageInfo messageInfo) {
        String message = "content:" + messageInfo.getContent() + ";phone:" + messageInfo.getPhone();
//        使用spring提供的模板发送消息
        jmsTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);
                return textMessage;
            }
        });
        return message;
    }
}


