/*** Auto generator by codegenerator 2015-12-20 22:13:43*/
package com.hichlink.hvp.common.dao;

import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import com.hichlink.hvp.common.entity.EnjoyRecord;
import java.util.List;

public interface EnjoyRecordMapper {
    int deleteByPrimaryKey(Long recordId);

    int insert(EnjoyRecord record);

    int insertSelective(EnjoyRecord record);

    List<EnjoyRecord> pageQuery(Page<EnjoyRecord> page);

    EnjoyRecord selectByPrimaryKey(Long recordId);

    int updateByPrimaryKeySelective(EnjoyRecord record);

    int updateByPrimaryKey(EnjoyRecord record);
}
