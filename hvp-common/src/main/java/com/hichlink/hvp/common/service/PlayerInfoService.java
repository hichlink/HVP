package com.hichlink.hvp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import java.util.List;
import com.hichlink.hvp.common.entity.PlayerInfo;
import com.hichlink.hvp.common.dao.PlayerInfoMapper;


/**
 * 
 * <b>Title：</b>PlayerInfoService.java<br/>
 * <b>Description：</b> <br/>
 * <b>@author： </b>oceanzhuang<br/>
 * <b>@date：</b>2015-12-20 22:13:30<br/>
 * <b>Copyright (c) 2015 HichLink Tech.</b>
 * 
 */
@Service("playerInfoService")
public class PlayerInfoService{
    @Autowired
    private PlayerInfoMapper playerInfoMapper;
    
    public Page<PlayerInfo> pageQuery(Page<PlayerInfo> page) {
    	List<PlayerInfo> list = playerInfoMapper.pageQuery(page);
		page.setDatas(list);
        return page;
    }
    public void insert(PlayerInfo data) {
        playerInfoMapper.insert(data);
    }
        public PlayerInfo get(Long playerId) {
        return playerInfoMapper.selectByPrimaryKey(playerId);
    }
    public void saveAndUpdate(PlayerInfo data){
    			if (null != data.getPlayerId()){//判断有没有传主键，如果传了为更新，否则为新增
					this.update(data);
		}else{
			this.insert(data);
		}
    }
    public void update(PlayerInfo data) {
        playerInfoMapper.updateByPrimaryKey(data);
    }
    public int delete(Long playerId) {
        return playerInfoMapper.deleteByPrimaryKey(playerId);
    }
    }