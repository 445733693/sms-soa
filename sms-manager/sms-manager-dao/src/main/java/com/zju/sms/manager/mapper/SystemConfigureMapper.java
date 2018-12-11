package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.SystemConfigure;
import java.util.List;

public interface SystemConfigureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemConfigure record);

    SystemConfigure selectByPrimaryKey(Integer id);

    List<SystemConfigure> selectAll();

    int updateByPrimaryKey(SystemConfigure record);
}