/*** Auto generator by codegenerator 2015-12-19 23:55:14*/
package com.hichlink.hvp.common.dao;

import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import com.hichlink.hvp.common.entity.StepManage;
import java.util.List;

public interface StepManageMapper {
    int deleteByPrimaryKey(Long stepId);

    int insert(StepManage record);

    int insertSelective(StepManage record);

    List<StepManage> pageQuery(Page<StepManage> page);

    StepManage selectByPrimaryKey(Long stepId);

    int updateByPrimaryKeySelective(StepManage record);

    int updateByPrimaryKey(StepManage record);
}
