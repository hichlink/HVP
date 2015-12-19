/*** Auto generator by codegenerator 2015-12-19 22:35:48*/
package com.hichlink.hvp.common.entity;

public class InfoCate {
	/**
	 * 分类ID
	 */
	private Long cateId;

	/**
	 * 活动ID
	 */
	private String actId;

	/**
	 * 分类编码
	 */
	private String cateCode;

	/**
	 * 分类名称
	 */
	private String cateName;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 分类ID
	 * 
	 * @return the value of info_cate.cate_id
	 */
	public Long getCateId() {
		return cateId;
	}

	public void setCateId(Long cateId) {
		this.cateId = cateId;
	}

	/**
	 * 活动ID
	 * 
	 * @return the value of info_cate.act_id
	 */
	public String getActId() {
		return actId;
	}

	public void setActId(String actId) {
		this.actId = actId == null ? null : actId.trim();
	}

	/**
	 * 分类编码
	 * 
	 * @return the value of info_cate.cate_code
	 */
	public String getCateCode() {
		return cateCode;
	}

	public void setCateCode(String cateCode) {
		this.cateCode = cateCode == null ? null : cateCode.trim();
	}

	/**
	 * 分类名称
	 * 
	 * @return the value of info_cate.cate_name
	 */
	public String getCateName() {
		return cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName == null ? null : cateName.trim();
	}

	/**
	 * 备注
	 * 
	 * @return the value of info_cate.remark
	 */
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}
}
