package com.hichlink.hvp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import java.util.List;
import com.hichlink.hvp.common.entity.BattleInfo;
import com.hichlink.hvp.common.dao.BattleInfoMapper;


/**
 * 
 * <b>Title：</b>BattleInfoService.java<br/>
 * <b>Description：</b> <br/>
 * <b>@author： </b>oceanzhuang<br/>
 * <b>@date：</b>2015-12-20 22:13:30<br/>
 * <b>Copyright (c) 2015 HichLink Tech.</b>
 * 
 */
@Service("battleInfoService")
public class BattleInfoService{
    @Autowired
    private BattleInfoMapper battleInfoMapper;
    
    public Page<BattleInfo> pageQuery(Page<BattleInfo> page) {
    	List<BattleInfo> list = battleInfoMapper.pageQuery(page);
		page.setDatas(list);
        return page;
    }
    public void insert(BattleInfo data) {
        battleInfoMapper.insert(data);
    }
        public BattleInfo get(Long infoId) {
        return battleInfoMapper.selectByPrimaryKey(infoId);
    }
    public void saveAndUpdate(BattleInfo data){
    			if (null != data.getInfoId()){//判断有没有传主键，如果传了为更新，否则为新增
					this.update(data);
		}else{
			this.insert(data);
		}
    }
    public void update(BattleInfo data) {
        battleInfoMapper.updateByPrimaryKey(data);
    }
    public int delete(Long infoId) {
        return battleInfoMapper.deleteByPrimaryKey(infoId);
    }
    }