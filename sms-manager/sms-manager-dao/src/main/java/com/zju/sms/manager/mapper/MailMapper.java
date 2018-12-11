package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.Mail;
import java.util.List;

public interface MailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mail record);

    Mail selectByPrimaryKey(Integer id);

    List<Mail> selectAll();

    int updateByPrimaryKey(Mail record);
}