/*** Auto generator by codegenerator 2015-12-19 22:35:48*/
package com.hichlink.hvp.common.dao;

import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import com.hichlink.hvp.common.entity.InfoCate;
import java.util.List;

public interface InfoCateMapper {
    int deleteByPrimaryKey(Long cateId);

    int insert(InfoCate record);

    int insertSelective(InfoCate record);

    List<InfoCate> pageQuery(Page<InfoCate> page);

    InfoCate selectByPrimaryKey(Long cateId);

    int updateByPrimaryKeySelective(InfoCate record);

    int updateByPrimaryKey(InfoCate record);
}
