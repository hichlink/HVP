/*** Auto generator by codegenerator 2015-12-20 22:14:16*/
package com.hichlink.hvp.common.entity;

import java.util.Date;

public class VoteRule {
    /**
    投票规则ID
     */
    private Long ruleId;

    /**
    活动ID
     */
    private String actId;

    /**
    每人投票数
     */
    private Integer perVoteNum;

    /**
    投票数比率
     */
    private Integer voteRatio;

    /**
    是否可重复投 0:否 1:是
     */
    private Integer isRepeateVote;

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
    投票规则ID
     * @return the value of vote_rule.rule_id
     */
    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
    活动ID
     * @return the value of vote_rule.act_id
     */
    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }

    /**
    每人投票数
     * @return the value of vote_rule.per_vote_num
     */
    public Integer getPerVoteNum() {
        return perVoteNum;
    }

    public void setPerVoteNum(Integer perVoteNum) {
        this.perVoteNum = perVoteNum;
    }

    /**
    投票数比率
     * @return the value of vote_rule.vote_ratio
     */
    public Integer getVoteRatio() {
        return voteRatio;
    }

    public void setVoteRatio(Integer voteRatio) {
        this.voteRatio = voteRatio;
    }

    /**
    是否可重复投 0:否 1:是
     * @return the value of vote_rule.is_repeate_vote
     */
    public Integer getIsRepeateVote() {
        return isRepeateVote;
    }

    public void setIsRepeateVote(Integer isRepeateVote) {
        this.isRepeateVote = isRepeateVote;
    }

    /**
    创建者
     * @return the value of vote_rule.creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
    创建时间
     * @return the value of vote_rule.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
    修改者
     * @return the value of vote_rule.updator
     */
    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
    修改时间
     * @return the value of vote_rule.update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
