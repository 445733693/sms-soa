package com.zju.sms.record.service;

import com.zju.sms.record.domain.UserRechargeRecord;

import java.util.List;

public interface IUserRechargeRecordService {
    void save(UserRechargeRecord userRechargeRecord);
    void delete(Integer id);
    void update(UserRechargeRecord userRechargeRecord);
    UserRechargeRecord get(Integer id);
    List<UserRechargeRecord> getAll();
}
