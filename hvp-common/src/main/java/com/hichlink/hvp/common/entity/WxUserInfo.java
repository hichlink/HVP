/*** Auto generator by codegenerator 2015-12-19 22:36:22*/
package com.hichlink.hvp.common.entity;

import java.util.Date;

public class WxUserInfo {
	/**
	 * 微信用户ID
	 */
	private Long userId;

	/**
	 * 是否关注 0:否 1:是
	 */
	private Integer isSubscribe;

	/**
	 * 微信appid
	 */
	private String appId;

	/**
	 * 微信openId
	 */
	private String openId;

	/**
	 * 昵称
	 */
	private String nickname;

	/**
	 * 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
	 */
	private Integer sex;

	/**
	 * 城市
	 */
	private String city;

	/**
	 * 国家
	 */
	private String country;

	/**
	 * 省份
	 */
	private String province;

	/**
	 * 头像
	 */
	private String headimgurl;

	/**
	 * 订阅时间
	 */
	private Long subscribeTime;

	/**
	 * 微信unionid
	 */
	private String unionid;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 用户所在的分组ID
	 */
	private Integer groupid;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 微信用户ID
	 * 
	 * @return the value of wx_user_info.user_id
	 */
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * 是否关注 0:否 1:是
	 * 
	 * @return the value of wx_user_info.is_subscribe
	 */
	public Integer getIsSubscribe() {
		return isSubscribe;
	}

	public void setIsSubscribe(Integer isSubscribe) {
		this.isSubscribe = isSubscribe;
	}

	/**
	 * 微信appid
	 * 
	 * @return the value of wx_user_info.app_id
	 */
	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId == null ? null : appId.trim();
	}

	/**
	 * 微信openId
	 * 
	 * @return the value of wx_user_info.open_id
	 */
	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId == null ? null : openId.trim();
	}

	/**
	 * 昵称
	 * 
	 * @return the value of wx_user_info.nickname
	 */
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}

	/**
	 * 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
	 * 
	 * @return the value of wx_user_info.sex
	 */
	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * 城市
	 * 
	 * @return the value of wx_user_info.city
	 */
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	/**
	 * 国家
	 * 
	 * @return the value of wx_user_info.country
	 */
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country == null ? null : country.trim();
	}

	/**
	 * 省份
	 * 
	 * @return the value of wx_user_info.province
	 */
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province == null ? null : province.trim();
	}

	/**
	 * 头像
	 * 
	 * @return the value of wx_user_info.headimgurl
	 */
	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl == null ? null : headimgurl.trim();
	}

	/**
	 * 订阅时间
	 * 
	 * @return the value of wx_user_info.subscribe_time
	 */
	public Long getSubscribeTime() {
		return subscribeTime;
	}

	public void setSubscribeTime(Long subscribeTime) {
		this.subscribeTime = subscribeTime;
	}

	/**
	 * 微信unionid
	 * 
	 * @return the value of wx_user_info.unionid
	 */
	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid == null ? null : unionid.trim();
	}

	/**
	 * 备注
	 * 
	 * @return the value of wx_user_info.remark
	 */
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	/**
	 * 用户所在的分组ID
	 * 
	 * @return the value of wx_user_info.groupid
	 */
	public Integer getGroupid() {
		return groupid;
	}

	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}

	/**
	 * 创建时间
	 * 
	 * @return the value of wx_user_info.create_time
	 */
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 更新时间
	 * 
	 * @return the value of wx_user_info.update_time
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
