package com.hichlink.hvp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import java.util.List;
import com.hichlink.hvp.common.entity.EnjoyRecord;
import com.hichlink.hvp.common.dao.EnjoyRecordMapper;


/**
 * 
 * <b>Title：</b>EnjoyRecordService.java<br/>
 * <b>Description：</b> <br/>
 * <b>@author： </b>oceanzhuang<br/>
 * <b>@date：</b>2015-12-19 22:35:31<br/>
 * <b>Copyright (c) 2015 HichLink Tech.</b>
 * 
 */
@Service("enjoyRecordService")
public class EnjoyRecordService{
    @Autowired
    private EnjoyRecordMapper enjoyRecordMapper;
    
    public Page<EnjoyRecord> pageQuery(Page<EnjoyRecord> page) {
    	List<EnjoyRecord> list = enjoyRecordMapper.pageQuery(page);
		page.setDatas(list);
        return page;
    }
    public void insert(EnjoyRecord data) {
        enjoyRecordMapper.insert(data);
    }
        public EnjoyRecord get(Long recordId) {
        return enjoyRecordMapper.selectByPrimaryKey(recordId);
    }
    public void saveAndUpdate(EnjoyRecord data){
    			if (null != data.getRecordId()){//判断有没有传主键，如果传了为更新，否则为新增
					this.update(data);
		}else{
			this.insert(data);
		}
    }
    public void update(EnjoyRecord data) {
        enjoyRecordMapper.updateByPrimaryKey(data);
    }
    public int delete(Long recordId) {
        return enjoyRecordMapper.deleteByPrimaryKey(recordId);
    }
    }