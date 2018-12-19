package com.zju.sms.admin.web.controller;

import com.zju.sms.common.util.UpdateUtil;
import com.zju.sms.record.domain.UserRechargeRecord;
import com.zju.sms.record.service.IUserRechargeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRechargeRecordController {
    @Autowired
    private IUserRechargeRecordService userRechargeRecordService;

    @RequestMapping(value = "/userRechargeRecords",method = RequestMethod.POST)
    public String saveUserRechargeRecord(@RequestBody UserRechargeRecord userRechargeRecord){
        userRechargeRecordService.save(userRechargeRecord);
        return"success";
    }
    @RequestMapping(value = "/userRechargeRecords",method = RequestMethod.PUT)
    public String updateUserRechargeRecord(@RequestBody UserRechargeRecord userRechargeRecord){
        UserRechargeRecord old = userRechargeRecordService.get(userRechargeRecord.getId());
        UpdateUtil.updateIfNotNull(old,userRechargeRecord);
        userRechargeRecordService.update(old);
        return"success";
    }
    @RequestMapping(value = "/userRechargeRecords/{id}",method = RequestMethod.DELETE)
    public String deleteUserRechargeRecord(@PathVariable("id") Integer id){
        userRechargeRecordService.delete(id);
        return"success";
    }
    @RequestMapping(value = "/userRechargeRecords/{id}",method = RequestMethod.GET)
    public UserRechargeRecord getUserRechargeRecord(@PathVariable("id") Integer id){
        return userRechargeRecordService.get(id);
    }
    @RequestMapping(value = "/userRechargeRecords",method = RequestMethod.GET)
    public List<UserRechargeRecord> getAdvice(){
        return userRechargeRecordService.getAll();
    }
}
