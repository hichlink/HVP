/*** Auto generator by codegenerator 2015-12-20 22:13:55*/
package com.hichlink.hvp.common.dao;

import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import com.hichlink.hvp.common.entity.PlayerInfo;
import java.util.List;

public interface PlayerInfoMapper {
    int deleteByPrimaryKey(Long playerId);

    int insert(PlayerInfo record);

    int insertSelective(PlayerInfo record);

    List<PlayerInfo> pageQuery(Page<PlayerInfo> page);

    PlayerInfo selectByPrimaryKey(Long playerId);

    int updateByPrimaryKeySelective(PlayerInfo record);

    int updateByPrimaryKey(PlayerInfo record);
}
