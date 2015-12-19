package com.hichlink.hvp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import java.util.List;
import com.hichlink.hvp.common.entity.VoteInfo;
import com.hichlink.hvp.common.dao.VoteInfoMapper;


/**
 * 
 * <b>Title：</b>VoteInfoService.java<br/>
 * <b>Description：</b> <br/>
 * <b>@author： </b>oceanzhuang<br/>
 * <b>@date：</b>2015-12-19 22:35:31<br/>
 * <b>Copyright (c) 2015 HichLink Tech.</b>
 * 
 */
@Service("voteInfoService")
public class VoteInfoService{
    @Autowired
    private VoteInfoMapper voteInfoMapper;
    
    public Page<VoteInfo> pageQuery(Page<VoteInfo> page) {
    	List<VoteInfo> list = voteInfoMapper.pageQuery(page);
		page.setDatas(list);
        return page;
    }
    public void insert(VoteInfo data) {
        voteInfoMapper.insert(data);
    }
        public VoteInfo get(Long voteId) {
        return voteInfoMapper.selectByPrimaryKey(voteId);
    }
    public void saveAndUpdate(VoteInfo data){
    			if (null != data.getVoteId()){//判断有没有传主键，如果传了为更新，否则为新增
					this.update(data);
		}else{
			this.insert(data);
		}
    }
    public void update(VoteInfo data) {
        voteInfoMapper.updateByPrimaryKey(data);
    }
    public int delete(Long voteId) {
        return voteInfoMapper.deleteByPrimaryKey(voteId);
    }
    }