/*** Auto generator by codegenerator 2015-12-20 22:13:47*/
package com.hichlink.hvp.common.entity;

import java.util.Date;

public class InfoCate {
    /**
    分类ID
     */
    private Long cateId;

    /**
    活动ID
     */
    private String actId;

    /**
    分类编码
     */
    private String cateCode;

    /**
    分类名称
     */
    private String cateName;

    /**
    备注
     */
    private String remark;

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
    分类ID
     * @return the value of info_cate.cate_id
     */
    public Long getCateId() {
        return cateId;
    }

    public void setCateId(Long cateId) {
        this.cateId = cateId;
    }

    /**
    活动ID
     * @return the value of info_cate.act_id
     */
    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }

    /**
    分类编码
     * @return the value of info_cate.cate_code
     */
    public String getCateCode() {
        return cateCode;
    }

    public void setCateCode(String cateCode) {
        this.cateCode = cateCode == null ? null : cateCode.trim();
    }

    /**
    分类名称
     * @return the value of info_cate.cate_name
     */
    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }

    /**
    备注
     * @return the value of info_cate.remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
    创建者
     * @return the value of info_cate.creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
    创建时间
     * @return the value of info_cate.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
    修改者
     * @return the value of info_cate.updator
     */
    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
    修改时间
     * @return the value of info_cate.update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
