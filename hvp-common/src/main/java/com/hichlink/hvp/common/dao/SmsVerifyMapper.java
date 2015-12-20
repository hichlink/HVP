/*** Auto generator by codegenerator 2015-12-20 22:14:00*/
package com.hichlink.hvp.common.dao;

import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import com.hichlink.hvp.common.entity.SmsVerify;
import java.util.List;

public interface SmsVerifyMapper {
    int deleteByPrimaryKey(Long smsId);

    int insert(SmsVerify record);

    int insertSelective(SmsVerify record);

    List<SmsVerify> pageQuery(Page<SmsVerify> page);

    SmsVerify selectByPrimaryKey(Long smsId);

    int updateByPrimaryKeySelective(SmsVerify record);

    int updateByPrimaryKey(SmsVerify record);
}
