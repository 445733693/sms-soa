package com.zju.sms.message.service;

import com.zju.sms.message.dto.MessageInfo;

public interface MessageService {
    String send(MessageInfo messageInfo);
}
