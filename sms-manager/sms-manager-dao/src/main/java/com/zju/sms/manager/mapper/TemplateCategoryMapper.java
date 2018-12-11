package com.zju.sms.manager.mapper;

import com.zju.sms.manager.domain.TemplateCategory;
import java.util.List;

public interface TemplateCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TemplateCategory record);

    TemplateCategory selectByPrimaryKey(Integer id);

    List<TemplateCategory> selectAll();

    int updateByPrimaryKey(TemplateCategory record);
}