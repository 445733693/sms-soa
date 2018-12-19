package com.zju.sms.admin.web.controller;

import com.zju.sms.common.util.IPUtils;
import com.zju.sms.common.util.UpdateUtil;
import com.zju.sms.manager.domain.Admin;
import com.zju.sms.manager.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@RestController
public class AdminController {
    @Autowired
    private IAdminService adminService;

    @RequestMapping(value = "/admins",method = RequestMethod.POST)
    public String saveAdmin(@RequestBody Admin admin, HttpServletRequest request) {
        String ip = IPUtils.getIpAddr(request);
        admin.setLoginIP(ip);
        Timestamp now = new Timestamp((new Date()).getTime());
        admin.setAddDate(now);
        admin.setLoginDate(now);
        adminService.save(admin);
        return"success";
    }

    @RequestMapping(value = "/admins",method = RequestMethod.PUT)
    public String updateAdmin(@RequestBody Admin admin){
        Admin old = adminService.get(admin.getId());
        UpdateUtil.updateIfNotNull(old,admin);
        adminService.update(old);
        return"success";
    }

    @RequestMapping(value = "/admins/{id}",method = RequestMethod.DELETE)
    public String deleteAdmin(@PathVariable("id") Integer id){
        adminService.delete(id);
        return"success";
    }

    @RequestMapping(value = "/admins/{id}",method = RequestMethod.GET)
    public Admin getAdmin(@PathVariable("id") Integer id){
        return adminService.get(id);
    }

    @RequestMapping(value = "/admins",method = RequestMethod.GET)
    public List<Admin> getAdvice(){
        return adminService.getAll();
    }
   /* @RequestMapping(value = "/admins",method = RequestMethod.GET)
    public Admin getAdminUser(@RequestBody String username){
        return adminService.getByUsername(username);
    }*/
}
