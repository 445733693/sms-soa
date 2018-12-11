package com.zju.sms.manager.service;



import com.zju.sms.manager.domain.Admin;

import java.util.List;

public interface IAdminService {
    void save(Admin admin);
    void delete(Integer id);
    void update(Admin admin);
    Admin get(Integer id);
    List<Admin> getAll();
    Admin getByUsername(String username);
}
