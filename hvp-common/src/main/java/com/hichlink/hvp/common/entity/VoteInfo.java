/*** Auto generator by codegenerator 2015-12-19 23:53:38*/
package com.hichlink.hvp.common.entity;

import java.util.Date;

public class VoteInfo {
    /**
    投票ID
     */
    private Long voteId;

    /**
    活动ID
     */
    private String actId;

    /**
    选手ID
     */
    private Long playerId;

    /**
    微信OpenId
     */
    private String openId;

    /**
    票数
     */
    private Integer voteNum;

    /**
    当前所处阶段
     */
    private Integer stage;

    /**
    阶段名称
     */
    private String stepName;

    /**
    手机号码
     */
    private String mobile;

    /**
    创建时间
     */
    private Date createTime;

    /**
    评论者IP
     */
    private String ip;

    /**
    投票ID
     * @return the value of vote_info.vote_id
     */
    public Long getVoteId() {
        return voteId;
    }

    public void setVoteId(Long voteId) {
        this.voteId = voteId;
    }

    /**
    活动ID
     * @return the value of vote_info.act_id
     */
    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }

    /**
    选手ID
     * @return the value of vote_info.player_id
     */
    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    /**
    微信OpenId
     * @return the value of vote_info.open_id
     */
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
    票数
     * @return the value of vote_info.vote_num
     */
    public Integer getVoteNum() {
        return voteNum;
    }

    public void setVoteNum(Integer voteNum) {
        this.voteNum = voteNum;
    }

    /**
    当前所处阶段
     * @return the value of vote_info.stage
     */
    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    /**
    阶段名称
     * @return the value of vote_info.step_name
     */
    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName == null ? null : stepName.trim();
    }

    /**
    手机号码
     * @return the value of vote_info.mobile
     */
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
    创建时间
     * @return the value of vote_info.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
    评论者IP
     * @return the value of vote_info.ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}
