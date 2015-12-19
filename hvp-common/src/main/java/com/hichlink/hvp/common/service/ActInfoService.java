package com.hichlink.hvp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import java.util.List;
import com.hichlink.hvp.common.entity.ActInfo;
import com.hichlink.hvp.common.dao.ActInfoMapper;

/**
 * 
 * <b>Title：</b>ActInfoService.java<br/>
 * <b>Description：</b> <br/>
 * <b>@author： </b>oceanzhuang<br/>
 * <b>@date：</b>2015-12-19 22:35:31<br/>
 * <b>Copyright (c) 2015 HichLink Tech.</b>
 * 
 */
@Service("actInfoService")
public class ActInfoService {
	@Autowired
	private ActInfoMapper actInfoMapper;

	public Page<ActInfo> pageQuery(Page<ActInfo> page) {
		List<ActInfo> list = actInfoMapper.pageQuery(page);
		page.setDatas(list);
		return page;
	}

	public void insert(ActInfo data) {
		actInfoMapper.insert(data);
	}

	public ActInfo get(Long actSeqId) {
		return actInfoMapper.selectByPrimaryKey(actSeqId);
	}

	public void saveAndUpdate(ActInfo data) {
		if (null != data.getActSeqId()) {// 判断有没有传主键，如果传了为更新，否则为新增
			this.update(data);
		} else {
			this.insert(data);
		}
	}

	public void update(ActInfo data) {
		actInfoMapper.updateByPrimaryKey(data);
	}

	public int delete(Long actSeqId) {
		return actInfoMapper.deleteByPrimaryKey(actSeqId);
	}
}