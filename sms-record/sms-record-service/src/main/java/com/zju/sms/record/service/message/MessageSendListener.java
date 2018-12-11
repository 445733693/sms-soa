package com.zju.sms.record.service.message;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MessageSendListener implements MessageListener{
    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            String text = textMessage.getText();
            System.out.println("record-service get message:"+text);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
