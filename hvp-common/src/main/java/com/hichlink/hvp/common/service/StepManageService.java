package com.hichlink.hvp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import java.util.List;
import com.hichlink.hvp.common.entity.StepManage;
import com.hichlink.hvp.common.dao.StepManageMapper;


/**
 * 
 * <b>Title：</b>StepManageService.java<br/>
 * <b>Description：</b> <br/>
 * <b>@author： </b>oceanzhuang<br/>
 * <b>@date：</b>2015-12-20 22:13:30<br/>
 * <b>Copyright (c) 2015 HichLink Tech.</b>
 * 
 */
@Service("stepManageService")
public class StepManageService{
    @Autowired
    private StepManageMapper stepManageMapper;
    
    public Page<StepManage> pageQuery(Page<StepManage> page) {
    	List<StepManage> list = stepManageMapper.pageQuery(page);
		page.setDatas(list);
        return page;
    }
    public void insert(StepManage data) {
        stepManageMapper.insert(data);
    }
        public StepManage get(Long stepId) {
        return stepManageMapper.selectByPrimaryKey(stepId);
    }
    public void saveAndUpdate(StepManage data){
    			if (null != data.getStepId()){//判断有没有传主键，如果传了为更新，否则为新增
					this.update(data);
		}else{
			this.insert(data);
		}
    }
    public void update(StepManage data) {
        stepManageMapper.updateByPrimaryKey(data);
    }
    public int delete(Long stepId) {
        return stepManageMapper.deleteByPrimaryKey(stepId);
    }
    }