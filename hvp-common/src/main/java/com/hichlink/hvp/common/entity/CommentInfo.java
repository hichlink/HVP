/*** Auto generator by codegenerator 2015-12-19 23:54:00*/
package com.hichlink.hvp.common.entity;

import java.util.Date;

public class CommentInfo {
    /**
    评论ID
     */
    private Long commentId;

    /**
    活动ID
     */
    private String actId;

    /**
    评论信息
     */
    private String words;

    /**
    资讯ID
     */
    private Long infoId;

    /**
    微信OpenId
     */
    private String openId;

    /**
    创建时间
     */
    private Date createTime;

    /**
    审核状态 0:审核中 1:审核通过 2:审核失败
     */
    private Integer auditStatus;

    /**
    原因
     */
    private String reason;

    /**
    修改者
     */
    private String updator;

    /**
    修改时间
     */
    private Date updateTime;

    /**
    评论者IP
     */
    private String ip;

    /**
    评论ID
     * @return the value of comment_info.comment_id
     */
    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
    活动ID
     * @return the value of comment_info.act_id
     */
    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }

    /**
    评论信息
     * @return the value of comment_info.words
     */
    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words == null ? null : words.trim();
    }

    /**
    资讯ID
     * @return the value of comment_info.info_id
     */
    public Long getInfoId() {
        return infoId;
    }

    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }

    /**
    微信OpenId
     * @return the value of comment_info.open_id
     */
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
    创建时间
     * @return the value of comment_info.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
    审核状态 0:审核中 1:审核通过 2:审核失败
     * @return the value of comment_info.audit_status
     */
    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
    原因
     * @return the value of comment_info.reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
    修改者
     * @return the value of comment_info.updator
     */
    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
    修改时间
     * @return the value of comment_info.update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
    评论者IP
     * @return the value of comment_info.ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}
