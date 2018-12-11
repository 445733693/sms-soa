package com.zju.sms.record.mapper;

import com.zju.sms.record.domain.UserRechargeRecord;
import java.util.List;

public interface UserRechargeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRechargeRecord record);

    UserRechargeRecord selectByPrimaryKey(Integer id);

    List<UserRechargeRecord> selectAll();

    int updateByPrimaryKey(UserRechargeRecord record);
}