/*** Auto generator by codegenerator 2015-12-20 22:13:51*/
package com.hichlink.hvp.common.dao;

import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import com.hichlink.hvp.common.entity.LeaveWord;
import java.util.List;

public interface LeaveWordMapper {
    int deleteByPrimaryKey(Long wordId);

    int insert(LeaveWord record);

    int insertSelective(LeaveWord record);

    List<LeaveWord> pageQuery(Page<LeaveWord> page);

    LeaveWord selectByPrimaryKey(Long wordId);

    int updateByPrimaryKeySelective(LeaveWord record);

    int updateByPrimaryKey(LeaveWord record);
}
