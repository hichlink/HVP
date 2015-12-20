package com.hichlink.hvp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aspire.webbas.core.pagination.mybatis.pager.Page;
import java.util.List;
import com.hichlink.hvp.common.entity.CommentInfo;
import com.hichlink.hvp.common.dao.CommentInfoMapper;


/**
 * 
 * <b>Title：</b>CommentInfoService.java<br/>
 * <b>Description：</b> <br/>
 * <b>@author： </b>oceanzhuang<br/>
 * <b>@date：</b>2015-12-20 22:13:30<br/>
 * <b>Copyright (c) 2015 HichLink Tech.</b>
 * 
 */
@Service("commentInfoService")
public class CommentInfoService{
    @Autowired
    private CommentInfoMapper commentInfoMapper;
    
    public Page<CommentInfo> pageQuery(Page<CommentInfo> page) {
    	List<CommentInfo> list = commentInfoMapper.pageQuery(page);
		page.setDatas(list);
        return page;
    }
    public void insert(CommentInfo data) {
        commentInfoMapper.insert(data);
    }
        public CommentInfo get(Long commentId) {
        return commentInfoMapper.selectByPrimaryKey(commentId);
    }
    public void saveAndUpdate(CommentInfo data){
    			if (null != data.getCommentId()){//判断有没有传主键，如果传了为更新，否则为新增
					this.update(data);
		}else{
			this.insert(data);
		}
    }
    public void update(CommentInfo data) {
        commentInfoMapper.updateByPrimaryKey(data);
    }
    public int delete(Long commentId) {
        return commentInfoMapper.deleteByPrimaryKey(commentId);
    }
    }