package com.hichlink.hvp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import java.util.List;
import com.hichlink.hvp.common.entity.LeaveWord;
import com.hichlink.hvp.common.dao.LeaveWordMapper;


/**
 * 
 * <b>Title：</b>LeaveWordService.java<br/>
 * <b>Description：</b> <br/>
 * <b>@author： </b>oceanzhuang<br/>
 * <b>@date：</b>2015-12-19 22:35:31<br/>
 * <b>Copyright (c) 2015 HichLink Tech.</b>
 * 
 */
@Service("leaveWordService")
public class LeaveWordService{
    @Autowired
    private LeaveWordMapper leaveWordMapper;
    
    public Page<LeaveWord> pageQuery(Page<LeaveWord> page) {
    	List<LeaveWord> list = leaveWordMapper.pageQuery(page);
		page.setDatas(list);
        return page;
    }
    public void insert(LeaveWord data) {
        leaveWordMapper.insert(data);
    }
        public LeaveWord get(Long wordId) {
        return leaveWordMapper.selectByPrimaryKey(wordId);
    }
    public void saveAndUpdate(LeaveWord data){
    			if (null != data.getWordId()){//判断有没有传主键，如果传了为更新，否则为新增
					this.update(data);
		}else{
			this.insert(data);
		}
    }
    public void update(LeaveWord data) {
        leaveWordMapper.updateByPrimaryKey(data);
    }
    public int delete(Long wordId) {
        return leaveWordMapper.deleteByPrimaryKey(wordId);
    }
    }