/*** Auto generator by codegenerator 2015-12-20 22:14:16*/
package com.hichlink.hvp.common.dao;

import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import com.hichlink.hvp.common.entity.VoteRule;
import java.util.List;

public interface VoteRuleMapper {
    int deleteByPrimaryKey(Long ruleId);

    int insert(VoteRule record);

    int insertSelective(VoteRule record);

    List<VoteRule> pageQuery(Page<VoteRule> page);

    VoteRule selectByPrimaryKey(Long ruleId);

    int updateByPrimaryKeySelective(VoteRule record);

    int updateByPrimaryKey(VoteRule record);
}
