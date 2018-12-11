package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.Blacklist;

import java.util.List;

public interface BlacklistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Blacklist record);

    String selectByPrimaryKey(Integer id);

    List<Blacklist> selectAll();

    int updateByPrimaryKey(Blacklist record);
}