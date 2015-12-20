/*** Auto generator by codegenerator 2015-12-20 22:14:08*/
package com.hichlink.hvp.common.dao;

import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import com.hichlink.hvp.common.entity.ViewRecord;
import java.util.List;

public interface ViewRecordMapper {
    int deleteByPrimaryKey(Long recordId);

    int insert(ViewRecord record);

    int insertSelective(ViewRecord record);

    List<ViewRecord> pageQuery(Page<ViewRecord> page);

    ViewRecord selectByPrimaryKey(Long recordId);

    int updateByPrimaryKeySelective(ViewRecord record);

    int updateByPrimaryKey(ViewRecord record);
}
