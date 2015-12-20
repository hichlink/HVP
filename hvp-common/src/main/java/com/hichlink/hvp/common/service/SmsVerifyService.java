package com.hichlink.hvp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import java.util.List;
import com.hichlink.hvp.common.entity.SmsVerify;
import com.hichlink.hvp.common.dao.SmsVerifyMapper;


/**
 * 
 * <b>Title：</b>SmsVerifyService.java<br/>
 * <b>Description：</b> <br/>
 * <b>@author： </b>oceanzhuang<br/>
 * <b>@date：</b>2015-12-20 22:13:30<br/>
 * <b>Copyright (c) 2015 HichLink Tech.</b>
 * 
 */
@Service("smsVerifyService")
public class SmsVerifyService{
    @Autowired
    private SmsVerifyMapper smsVerifyMapper;
    
    public Page<SmsVerify> pageQuery(Page<SmsVerify> page) {
    	List<SmsVerify> list = smsVerifyMapper.pageQuery(page);
		page.setDatas(list);
        return page;
    }
    public void insert(SmsVerify data) {
        smsVerifyMapper.insert(data);
    }
        public SmsVerify get(Long smsId) {
        return smsVerifyMapper.selectByPrimaryKey(smsId);
    }
    public void saveAndUpdate(SmsVerify data){
    			if (null != data.getSmsId()){//判断有没有传主键，如果传了为更新，否则为新增
					this.update(data);
		}else{
			this.insert(data);
		}
    }
    public void update(SmsVerify data) {
        smsVerifyMapper.updateByPrimaryKey(data);
    }
    public int delete(Long smsId) {
        return smsVerifyMapper.deleteByPrimaryKey(smsId);
    }
    }