/*** Auto generator by codegenerator 2015-12-20 22:14:04*/
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
