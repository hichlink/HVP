/*** Auto generator by codegenerator 2015-12-20 22:13:30*/
package com.hichlink.hvp.common.entity;

import java.util.Date;

public class ActInfo {
    /**
    活动序列
     */
    private Long actSeqId;

    /**
    活动ID
     */
    private String actId;

    /**
    活动名称
     */
    private String actName;

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
    当前所处阶段
     */
    private Integer stage;

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
    备注
     */
    private String remark;

    /**
    是否强制关注,0:否 1:是
     */
    private Integer isForce;

    /**
    关注页面地址
     */
    private String focusUrl;

    /**
    活动序列
     * @return the value of act_info.act_seq_id
     */
    public Long getActSeqId() {
        return actSeqId;
    }

    public void setActSeqId(Long actSeqId) {
        this.actSeqId = actSeqId;
    }

    /**
    活动ID
     * @return the value of act_info.act_id
     */
    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }

    /**
    活动名称
     * @return the value of act_info.act_name
     */
    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    /**
    开始时间
     * @return the value of act_info.start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
    结束时间
     * @return the value of act_info.end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
    是否有效 0:无效 1:有效
     * @return the value of act_info.is_valid
     */
    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
    当前所处阶段
     * @return the value of act_info.stage
     */
    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    /**
    创建者
     * @return the value of act_info.creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
    创建时间
     * @return the value of act_info.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
    修改者
     * @return the value of act_info.updator
     */
    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
    修改时间
     * @return the value of act_info.update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
    备注
     * @return the value of act_info.remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
    是否强制关注,0:否 1:是
     * @return the value of act_info.is_force
     */
    public Integer getIsForce() {
        return isForce;
    }

    public void setIsForce(Integer isForce) {
        this.isForce = isForce;
    }

    /**
    关注页面地址
     * @return the value of act_info.focus_url
     */
    public String getFocusUrl() {
        return focusUrl;
    }

    public void setFocusUrl(String focusUrl) {
        this.focusUrl = focusUrl == null ? null : focusUrl.trim();
    }
}
