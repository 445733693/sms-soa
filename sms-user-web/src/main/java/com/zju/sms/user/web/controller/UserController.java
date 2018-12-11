package com.zju.sms.user.web.controller;


import com.zju.sms.common.shiro.PermissionName;
import com.zju.sms.common.util.UpdateUtil;
import com.zju.sms.manager.domain.User;
import com.zju.sms.manager.service.IUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @RequiresPermissions("users:save")
    @PermissionName("终端用户账户添加")
    public String saveUser(@RequestBody User user){
        userService.save(user);
        return"success";
    }
    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    @RequiresPermissions("users:edit")
    @PermissionName("终端用户账户修改")
    public String updateUser(@RequestBody User user){
        User old = userService.get(user.getId());
        UpdateUtil.updateIfNotNull(old,user);
        userService.update(old);
        return"success";
    }
    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @RequiresPermissions("users:delete")
    @PermissionName("终端用户账户删除")
    public String deleteUser(@PathVariable("id") Integer id){
        userService.delete(id);
        return"success";
    }
    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @RequiresPermissions("users:get")
    @PermissionName("终端用户账户查询")
    public User getUser(@PathVariable("id") Integer id){
        return userService.get(id);
    }
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @RequiresPermissions("users:list")
    @PermissionName("终端用户账户列表")
    public List<User> getUser(){
        return userService.getAll();
    }
//    @RequestMapping(value = "/admins",method = RequestMethod.GET)
//    public User getUser(@RequestBody String username){
//        return userService.getByUsername(username);
//    }

}
