package com.hichlink.hvp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import java.util.List;
import com.hichlink.hvp.common.entity.WxUserInfo;
import com.hichlink.hvp.common.dao.WxUserInfoMapper;

/**
 * 
 * <b>Title：</b>WxUserInfoService.java<br/>
 * <b>Description：</b> <br/>
 * <b>@author： </b>oceanzhuang<br/>
 * <b>@date：</b>2015-12-19 22:35:31<br/>
 * <b>Copyright (c) 2015 HichLink Tech.</b>
 * 
 */
@Service("wxUserInfoService")
public class WxUserInfoService {
	@Autowired
	private WxUserInfoMapper wxUserInfoMapper;

	public Page<WxUserInfo> pageQuery(Page<WxUserInfo> page) {
		List<WxUserInfo> list = wxUserInfoMapper.pageQuery(page);
		page.setDatas(list);
		return page;
	}

	public void insert(WxUserInfo data) {
		wxUserInfoMapper.insert(data);
	}

	public WxUserInfo get(Long userId) {
		return wxUserInfoMapper.selectByPrimaryKey(userId);
	}

	public void saveAndUpdate(WxUserInfo data) {
		if (null != data.getUserId()) {// 判断有没有传主键，如果传了为更新，否则为新增
			this.update(data);
		} else {
			this.insert(data);
		}
	}

	public void update(WxUserInfo data) {
		wxUserInfoMapper.updateByPrimaryKey(data);
	}

	public int delete(Long userId) {
		return wxUserInfoMapper.deleteByPrimaryKey(userId);
	}
}