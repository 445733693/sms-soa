package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.whitelist;
import java.util.List;

public interface whitelistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(whitelist record);

    String selectByPrimaryKey(Integer id);

    List<whitelist> selectAll();

    int updateByPrimaryKey(whitelist record);
}