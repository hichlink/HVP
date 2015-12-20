/*** Auto generator by codegenerator 2015-12-20 22:13:35*/
package com.hichlink.hvp.common.entity;

import java.util.Date;

public class BattleInfo {
    /**
    资讯ID
     */
    private Long infoId;

    /**
    分类ID
     */
    private Long cateId;

    /**
    标题
     */
    private String title;

    /**
    图片ID
     */
    private String picId;

    /**
    图片URL
     */
    private String picUrl;

    /**
    视频地址
     */
    private String videoUrl;

    /**
    发布时间
     */
    private Date publishTime;

    /**
    开始时间
     */
    private Date startTime;

    /**
    结束时间
     */
    private Date endTime;

    /**
    是否有效 0:无效 1:有效
     */
    private Integer isValid;

    /**
    阅读数
     */
    private Long viewNum;

    /**
    点赞数
     */
    private Long enjoyNum;

    /**
    评论数
     */
    private Long commentNum;

    /**
    创建者
     */
    private String creator;

    /**
    创建时间
     */
    private Date createTime;

    /**
    修改者
     */
    private String updator;

    /**
    修改时间
     */
    private Date updateTime;

    /**
    内容
     */
    private String content;

    /**
    资讯ID
     * @return the value of battle_info.info_id
     */
    public Long getInfoId() {
        return infoId;
    }

    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }

    /**
    分类ID
     * @return the value of battle_info.cate_id
     */
    public Long getCateId() {
        return cateId;
    }

    public void setCateId(Long cateId) {
        this.cateId = cateId;
    }

    /**
    标题
     * @return the value of battle_info.title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
    图片ID
     * @return the value of battle_info.pic_id
     */
    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId == null ? null : picId.trim();
    }

    /**
    图片URL
     * @return the value of battle_info.pic_url
     */
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
    视频地址
     * @return the value of battle_info.video_url
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    /**
    发布时间
     * @return the value of battle_info.publish_time
     */
    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
    开始时间
     * @return the value of battle_info.start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
    结束时间
     * @return the value of battle_info.end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
    是否有效 0:无效 1:有效
     * @return the value of battle_info.is_valid
     */
    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
    阅读数
     * @return the value of battle_info.view_num
     */
    public Long getViewNum() {
        return viewNum;
    }

    public void setViewNum(Long viewNum) {
        this.viewNum = viewNum;
    }

    /**
    点赞数
     * @return the value of battle_info.enjoy_num
     */
    public Long getEnjoyNum() {
        return enjoyNum;
    }

    public void setEnjoyNum(Long enjoyNum) {
        this.enjoyNum = enjoyNum;
    }

    /**
    评论数
     * @return the value of battle_info.comment_num
     */
    public Long getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Long commentNum) {
        this.commentNum = commentNum;
    }

    /**
    创建者
     * @return the value of battle_info.creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
    创建时间
     * @return the value of battle_info.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
    修改者
     * @return the value of battle_info.updator
     */
    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
    修改时间
     * @return the value of battle_info.update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
    内容
     * @return the value of battle_info.content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
