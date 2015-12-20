/*** Auto generator by codegenerator 2015-12-20 22:14:08*/
package com.hichlink.hvp.common.entity;

import java.util.Date;

public class ViewRecord {
    /**
    记录ID
     */
    private Long recordId;

    /**
    活动ID
     */
    private String actId;

    /**
    类型 1:选手 2:资读
     */
    private Integer type;

    /**
    来源ID
     */
    private String sourceId;

    /**
    阅读者IP
     */
    private String ip;

    /**
    创建时间
     */
    private Date createTime;

    /**
    记录ID
     * @return the value of view_record.record_id
     */
    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    /**
    活动ID
     * @return the value of view_record.act_id
     */
    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }

    /**
    类型 1:选手 2:资读
     * @return the value of view_record.type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    /**
    来源ID
     * @return the value of view_record.source_id
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    /**
    阅读者IP
     * @return the value of view_record.ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
    创建时间
     * @return the value of view_record.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
