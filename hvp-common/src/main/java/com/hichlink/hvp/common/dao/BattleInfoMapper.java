/*** Auto generator by codegenerator 2015-12-20 22:13:35*/
package com.hichlink.hvp.common.dao;

import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import com.hichlink.hvp.common.entity.BattleInfo;
import com.hichlink.hvp.common.entity.BattleInfoExample;
import java.util.List;

public interface BattleInfoMapper {
    int deleteByPrimaryKey(Long infoId);

    int insert(BattleInfo record);

    int insertSelective(BattleInfo record);

    List<BattleInfo> selectByExampleWithBLOBs(BattleInfoExample example);

    List<BattleInfo> pageQuery(Page<BattleInfo> page);

    BattleInfo selectByPrimaryKey(Long infoId);

    int updateByPrimaryKeySelective(BattleInfo record);

    int updateByPrimaryKeyWithBLOBs(BattleInfo record);

    int updateByPrimaryKey(BattleInfo record);
}
