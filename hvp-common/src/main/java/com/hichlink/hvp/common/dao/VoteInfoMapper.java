/*** Auto generator by codegenerator 2015-12-20 22:14:12*/
package com.hichlink.hvp.common.dao;

import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import com.hichlink.hvp.common.entity.VoteInfo;
import java.util.List;

public interface VoteInfoMapper {
    int deleteByPrimaryKey(Long voteId);

    int insert(VoteInfo record);

    int insertSelective(VoteInfo record);

    List<VoteInfo> pageQuery(Page<VoteInfo> page);

    VoteInfo selectByPrimaryKey(Long voteId);

    int updateByPrimaryKeySelective(VoteInfo record);

    int updateByPrimaryKey(VoteInfo record);
}
