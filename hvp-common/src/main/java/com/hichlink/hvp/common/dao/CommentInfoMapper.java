/*** Auto generator by codegenerator 2015-12-20 22:13:39*/
package com.hichlink.hvp.common.dao;

import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import com.hichlink.hvp.common.entity.CommentInfo;
import java.util.List;

public interface CommentInfoMapper {
    int deleteByPrimaryKey(Long commentId);

    int insert(CommentInfo record);

    int insertSelective(CommentInfo record);

    List<CommentInfo> pageQuery(Page<CommentInfo> page);

    CommentInfo selectByPrimaryKey(Long commentId);

    int updateByPrimaryKeySelective(CommentInfo record);

    int updateByPrimaryKey(CommentInfo record);
}
