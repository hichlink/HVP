package com.hichlink.hvp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import java.util.List;
import com.hichlink.hvp.common.entity.ViewRecord;
import com.hichlink.hvp.common.dao.ViewRecordMapper;


/**
 * 
 * <b>Title：</b>ViewRecordService.java<br/>
 * <b>Description：</b> <br/>
 * <b>@author： </b>oceanzhuang<br/>
 * <b>@date：</b>2015-12-19 22:35:31<br/>
 * <b>Copyright (c) 2015 HichLink Tech.</b>
 * 
 */
@Service("viewRecordService")
public class ViewRecordService{
    @Autowired
    private ViewRecordMapper viewRecordMapper;
    
    public Page<ViewRecord> pageQuery(Page<ViewRecord> page) {
    	List<ViewRecord> list = viewRecordMapper.pageQuery(page);
		page.setDatas(list);
        return page;
    }
    public void insert(ViewRecord data) {
        viewRecordMapper.insert(data);
    }
        public ViewRecord get(Long recordId) {
        return viewRecordMapper.selectByPrimaryKey(recordId);
    }
    public void saveAndUpdate(ViewRecord data){
    			if (null != data.getRecordId()){//判断有没有传主键，如果传了为更新，否则为新增
					this.update(data);
		}else{
			this.insert(data);
		}
    }
    public void update(ViewRecord data) {
        viewRecordMapper.updateByPrimaryKey(data);
    }
    public int delete(Long recordId) {
        return viewRecordMapper.deleteByPrimaryKey(recordId);
    }
    }