package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.Admin;
import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    Admin selectByPrimaryKey(Integer id);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);

    Admin selectByUsername(String username);
}