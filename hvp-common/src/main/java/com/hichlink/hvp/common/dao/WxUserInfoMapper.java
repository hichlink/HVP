/*** Auto generator by codegenerator 2015-12-19 22:36:22*/
package com.hichlink.hvp.common.dao;

import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import com.hichlink.hvp.common.entity.WxUserInfo;
import java.util.List;

public interface WxUserInfoMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(WxUserInfo record);

    int insertSelective(WxUserInfo record);

    List<WxUserInfo> pageQuery(Page<WxUserInfo> page);

    WxUserInfo selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(WxUserInfo record);

    int updateByPrimaryKey(WxUserInfo record);
}
