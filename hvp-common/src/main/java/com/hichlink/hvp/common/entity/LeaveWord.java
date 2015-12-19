/*** Auto generator by codegenerator 2015-12-19 23:53:50*/
package com.hichlink.hvp.common.entity;

import java.util.Date;

public class LeaveWord {
    /**
    留言ID
     */
    private Long wordId;

    /**
    活动ID
     */
    private String actId;

    /**
    留言信息
     */
    private String words;

    /**
    微信OpenId
     */
    private String openId;

    /**
    选手ID
     */
    private Long playerId;

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
    留言ID
     * @return the value of leave_word.word_id
     */
    public Long getWordId() {
        return wordId;
    }

    public void setWordId(Long wordId) {
        this.wordId = wordId;
    }

    /**
    活动ID
     * @return the value of leave_word.act_id
     */
    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }

    /**
    留言信息
     * @return the value of leave_word.words
     */
    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words == null ? null : words.trim();
    }

    /**
    微信OpenId
     * @return the value of leave_word.open_id
     */
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
    选手ID
     * @return the value of leave_word.player_id
     */
    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    /**
    创建时间
     * @return the value of leave_word.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
    审核状态 0:审核中 1:审核通过 2:审核失败
     * @return the value of leave_word.audit_status
     */
    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
    原因
     * @return the value of leave_word.reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
    修改者
     * @return the value of leave_word.updator
     */
    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
    修改时间
     * @return the value of leave_word.update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
    评论者IP
     * @return the value of leave_word.ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}
