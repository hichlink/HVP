/*** Auto generator by codegenerator 2015-12-19 23:55:14*/
package com.hichlink.hvp.common.entity;

import java.util.Date;

public class StepManage {
    /**
    阶段ID
     */
    private Long stepId;

    /**
    活动ID
     */
    private String actId;

    /**
    阶段序号
     */
    private Integer stepNo;

    /**
    阶段名称
     */
    private String stepName;

    /**
    描述信息
     */
    private String stepDesc;

    /**
    阶段标识 0:非当前阶段 1:当前阶段
     */
    private Integer stepSign;

    /**
    开始时间
     */
    private Date startTime;

    /**
    结束时间
     */
    private Date endTime;

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
    阶段ID
     * @return the value of step_manage.step_id
     */
    public Long getStepId() {
        return stepId;
    }

    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }

    /**
    活动ID
     * @return the value of step_manage.act_id
     */
    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }

    /**
    阶段序号
     * @return the value of step_manage.step_no
     */
    public Integer getStepNo() {
        return stepNo;
    }

    public void setStepNo(Integer stepNo) {
        this.stepNo = stepNo;
    }

    /**
    阶段名称
     * @return the value of step_manage.step_name
     */
    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName == null ? null : stepName.trim();
    }

    /**
    描述信息
     * @return the value of step_manage.step_desc
     */
    public String getStepDesc() {
        return stepDesc;
    }

    public void setStepDesc(String stepDesc) {
        this.stepDesc = stepDesc == null ? null : stepDesc.trim();
    }

    /**
    阶段标识 0:非当前阶段 1:当前阶段
     * @return the value of step_manage.step_sign
     */
    public Integer getStepSign() {
        return stepSign;
    }

    public void setStepSign(Integer stepSign) {
        this.stepSign = stepSign;
    }

    /**
    开始时间
     * @return the value of step_manage.start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
    结束时间
     * @return the value of step_manage.end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
    创建者
     * @return the value of step_manage.creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
    创建时间
     * @return the value of step_manage.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
    修改者
     * @return the value of step_manage.updator
     */
    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
    修改时间
     * @return the value of step_manage.update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
