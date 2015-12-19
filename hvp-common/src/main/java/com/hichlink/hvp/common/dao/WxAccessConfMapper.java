/*** Auto generator by codegenerator 2015-12-19 22:36:18*/
package com.hichlink.hvp.common.dao;

import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import com.hichlink.hvp.common.entity.WxAccessConf;
import java.util.List;

public interface WxAccessConfMapper {
    int deleteByPrimaryKey(Long seqId);

    int insert(WxAccessConf record);

    int insertSelective(WxAccessConf record);

    List<WxAccessConf> pageQuery(Page<WxAccessConf> page);

    WxAccessConf selectByPrimaryKey(Long seqId);

    int updateByPrimaryKeySelective(WxAccessConf record);

    int updateByPrimaryKey(WxAccessConf record);
}
