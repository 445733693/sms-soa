package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.Keyword;
import java.util.List;

public interface KeywordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Keyword record);

    Keyword selectByPrimaryKey(Integer id);

    List<Keyword> selectAll();

    int updateByPrimaryKey(Keyword record);
}