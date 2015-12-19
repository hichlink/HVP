package com.hichlink.hvp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import java.util.List;
import com.hichlink.hvp.common.entity.InfoCate;
import com.hichlink.hvp.common.dao.InfoCateMapper;

/**
 * 
 * <b>Title：</b>InfoCateService.java<br/>
 * <b>Description：</b> <br/>
 * <b>@author： </b>oceanzhuang<br/>
 * <b>@date：</b>2015-12-19 22:35:31<br/>
 * <b>Copyright (c) 2015 HichLink Tech.</b>
 * 
 */
@Service("infoCateService")
public class InfoCateService {
	@Autowired
	private InfoCateMapper infoCateMapper;

	public Page<InfoCate> pageQuery(Page<InfoCate> page) {
		List<InfoCate> list = infoCateMapper.pageQuery(page);
		page.setDatas(list);
		return page;
	}

	public void insert(InfoCate data) {
		infoCateMapper.insert(data);
	}

	public InfoCate get(Long cateId) {
		return infoCateMapper.selectByPrimaryKey(cateId);
	}

	public void saveAndUpdate(InfoCate data) {
		if (null != data.getCateId()) {// 判断有没有传主键，如果传了为更新，否则为新增
			this.update(data);
		} else {
			this.insert(data);
		}
	}

	public void update(InfoCate data) {
		infoCateMapper.updateByPrimaryKey(data);
	}

	public int delete(Long cateId) {
		return infoCateMapper.deleteByPrimaryKey(cateId);
	}
}