/*** Auto generator by codegenerator 2015-12-19 22:45:59*/
package com.hichlink.hvp.common.entity;

import java.util.Date;

public class PlayerInfo {
    /**
    选手ID
     */
    private Long playerId;

    /**
    活动ID
     */
    private String actId;

    /**
    选手编号
     */
    private String playerCode;

    /**
    选手姓名
     */
    private String playerName;

    /**
    选手头像ID
     */
    private String headImgId;

    /**
    选手头像URL
     */
    private String headImgUrl;

    /**
    选手形象照片ID
     */
    private String picImgId;

    /**
    选手形象照片url
     */
    private String picImgUrl;

    /**
    选手简介
     */
    private String summary;

    /**
    话剧案例
     */
    private String caseInfo;

    /**
    所在大区ID
     */
    private String bigareaId;

    /**
    所在大区
     */
    private String bigareaName;

    /**
    所在办事处ID
     */
    private String officeId;

    /**
    所在办事处
     */
    private String officeName;

    /**
    当前所处阶段
     */
    private Integer stage;

    /**
    是否晋级 0:否 1:是
     */
    private Integer isUpgrade;

    /**
    晋级之路
     */
    private String stageIntro;

    /**
    一阶段总票数
     */
    private Long stage1VoteNum;

    /**
    二阶段总票数
     */
    private Long stage2VoteNum;

    /**
    三阶段总票数
     */
    private Long stage3VoteNum;

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
    视频地址
     */
    private String videoUrl;

    /**
    状态 0:保存 1:有效
     */
    private Integer status;

    /**
    选手ID
     * @return the value of player_info.player_id
     */
    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    /**
    活动ID
     * @return the value of player_info.act_id
     */
    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }

    /**
    选手编号
     * @return the value of player_info.player_code
     */
    public String getPlayerCode() {
        return playerCode;
    }

    public void setPlayerCode(String playerCode) {
        this.playerCode = playerCode == null ? null : playerCode.trim();
    }

    /**
    选手姓名
     * @return the value of player_info.player_name
     */
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName == null ? null : playerName.trim();
    }

    /**
    选手头像ID
     * @return the value of player_info.head_img_id
     */
    public String getHeadImgId() {
        return headImgId;
    }

    public void setHeadImgId(String headImgId) {
        this.headImgId = headImgId == null ? null : headImgId.trim();
    }

    /**
    选手头像URL
     * @return the value of player_info.head_img_url
     */
    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
    }

    /**
    选手形象照片ID
     * @return the value of player_info.pic_img_id
     */
    public String getPicImgId() {
        return picImgId;
    }

    public void setPicImgId(String picImgId) {
        this.picImgId = picImgId == null ? null : picImgId.trim();
    }

    /**
    选手形象照片url
     * @return the value of player_info.pic_img_url
     */
    public String getPicImgUrl() {
        return picImgUrl;
    }

    public void setPicImgUrl(String picImgUrl) {
        this.picImgUrl = picImgUrl == null ? null : picImgUrl.trim();
    }

    /**
    选手简介
     * @return the value of player_info.summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
    话剧案例
     * @return the value of player_info.case_info
     */
    public String getCaseInfo() {
        return caseInfo;
    }

    public void setCaseInfo(String caseInfo) {
        this.caseInfo = caseInfo == null ? null : caseInfo.trim();
    }

    /**
    所在大区ID
     * @return the value of player_info.bigarea_id
     */
    public String getBigareaId() {
        return bigareaId;
    }

    public void setBigareaId(String bigareaId) {
        this.bigareaId = bigareaId == null ? null : bigareaId.trim();
    }

    /**
    所在大区
     * @return the value of player_info.bigarea_name
     */
    public String getBigareaName() {
        return bigareaName;
    }

    public void setBigareaName(String bigareaName) {
        this.bigareaName = bigareaName == null ? null : bigareaName.trim();
    }

    /**
    所在办事处ID
     * @return the value of player_info.office_id
     */
    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId == null ? null : officeId.trim();
    }

    /**
    所在办事处
     * @return the value of player_info.office_name
     */
    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName == null ? null : officeName.trim();
    }

    /**
    当前所处阶段
     * @return the value of player_info.stage
     */
    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    /**
    是否晋级 0:否 1:是
     * @return the value of player_info.is_upgrade
     */
    public Integer getIsUpgrade() {
        return isUpgrade;
    }

    public void setIsUpgrade(Integer isUpgrade) {
        this.isUpgrade = isUpgrade;
    }

    /**
    晋级之路
     * @return the value of player_info.stage_intro
     */
    public String getStageIntro() {
        return stageIntro;
    }

    public void setStageIntro(String stageIntro) {
        this.stageIntro = stageIntro == null ? null : stageIntro.trim();
    }

    /**
    一阶段总票数
     * @return the value of player_info.stage1_vote_num
     */
    public Long getStage1VoteNum() {
        return stage1VoteNum;
    }

    public void setStage1VoteNum(Long stage1VoteNum) {
        this.stage1VoteNum = stage1VoteNum;
    }

    /**
    二阶段总票数
     * @return the value of player_info.stage2_vote_num
     */
    public Long getStage2VoteNum() {
        return stage2VoteNum;
    }

    public void setStage2VoteNum(Long stage2VoteNum) {
        this.stage2VoteNum = stage2VoteNum;
    }

    /**
    三阶段总票数
     * @return the value of player_info.stage3_vote_num
     */
    public Long getStage3VoteNum() {
        return stage3VoteNum;
    }

    public void setStage3VoteNum(Long stage3VoteNum) {
        this.stage3VoteNum = stage3VoteNum;
    }

    /**
    创建者
     * @return the value of player_info.creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
    创建时间
     * @return the value of player_info.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
    修改者
     * @return the value of player_info.updator
     */
    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
    修改时间
     * @return the value of player_info.update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
    备注
     * @return the value of player_info.remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
    视频地址
     * @return the value of player_info.video_url
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    /**
    状态 0:保存 1:有效
     * @return the value of player_info.status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
