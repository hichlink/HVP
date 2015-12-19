/*** Auto generator by codegenerator 2015-12-19 22:35:31*/
package com.hichlink.hvp.common.dao;

import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import com.hichlink.hvp.common.entity.ActInfo;
import java.util.List;

public interface ActInfoMapper {
    int deleteByPrimaryKey(Long actSeqId);

    int insert(ActInfo record);

    int insertSelective(ActInfo record);

    List<ActInfo> pageQuery(Page<ActInfo> page);

    ActInfo selectByPrimaryKey(Long actSeqId);

    int updateByPrimaryKeySelective(ActInfo record);

    int updateByPrimaryKey(ActInfo record);
}
