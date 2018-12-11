package com.zju.sms.common.shiro;


import com.zju.sms.manager.mapper.AdminPermissionMapper;
import com.zju.sms.manager.mapper.PermissionMapper;
import com.zju.sms.manager.service.IAdminService;
import com.zju.sms.manager.domain.Admin;
import com.zju.sms.manager.domain.AdminPermission;
import com.zju.sms.manager.domain.Permission;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AdminRealm extends AuthorizingRealm {
    @Autowired
    private IAdminService adminService;
    @Autowired
    private AdminPermissionMapper adminPermissionMapper;
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public String getName() {
        return "AdminRealm";
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("AdminRealm授权.......");
        List<String> permissions= new ArrayList<>();
//        取当前登陆的管理员账户
        Subject currentAdmin = SecurityUtils.getSubject();
        Admin admin = (Admin) currentAdmin.getPrincipal();
//        从数据库查询当前账户的权限
        List<AdminPermission> aps = adminPermissionMapper.selectByAdminId(admin.getId());
        for(AdminPermission ap:aps){
            Permission permission = permissionMapper.selectByPrimaryKey(ap.getPermissionId());
            permissions.add(permission.getResource());
        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permissions);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordTypeToken token = (UsernamePasswordTypeToken) authenticationToken;
        String username = token.getUsername();
        Admin admin = adminService.getByUsername(username);
        if(admin==null) return null;
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(admin, admin.getPassword(), getName());
        return info;
    }
}
