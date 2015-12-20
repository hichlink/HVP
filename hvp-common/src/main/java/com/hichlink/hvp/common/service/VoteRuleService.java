package com.hichlink.hvp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import java.util.List;
import com.hichlink.hvp.common.entity.VoteRule;
import com.hichlink.hvp.common.dao.VoteRuleMapper;


/**
 * 
 * <b>Title：</b>VoteRuleService.java<br/>
 * <b>Description：</b> <br/>
 * <b>@author： </b>oceanzhuang<br/>
 * <b>@date：</b>2015-12-20 22:13:30<br/>
 * <b>Copyright (c) 2015 HichLink Tech.</b>
 * 
 */
@Service("voteRuleService")
public class VoteRuleService{
    @Autowired
    private VoteRuleMapper voteRuleMapper;
    
    public Page<VoteRule> pageQuery(Page<VoteRule> page) {
    	List<VoteRule> list = voteRuleMapper.pageQuery(page);
		page.setDatas(list);
        return page;
    }
    public void insert(VoteRule data) {
        voteRuleMapper.insert(data);
    }
        public VoteRule get(Long ruleId) {
        return voteRuleMapper.selectByPrimaryKey(ruleId);
    }
    public void saveAndUpdate(VoteRule data){
    			if (null != data.getRuleId()){//判断有没有传主键，如果传了为更新，否则为新增
					this.update(data);
		}else{
			this.insert(data);
		}
    }
    public void update(VoteRule data) {
        voteRuleMapper.updateByPrimaryKey(data);
    }
    public int delete(Long ruleId) {
        return voteRuleMapper.deleteByPrimaryKey(ruleId);
    }
    }