/*** Auto generator by codegenerator 2015-12-20 22:14:00*/
package com.hichlink.hvp.common.entity;

import java.util.Date;

public class SmsVerify {
    /**
    短信验证码ID
     */
    private Long smsId;

    /**
    手机号码
     */
    private String mobile;

    /**
    验证码
     */
    private String verifyCode;

    /**
    过期时间
     */
    private Date expTime;

    /**
    是否有效 0:无效 1:有效
     */
    private Integer isValid;

    /**
    类型 1:投票
     */
    private Integer smsType;

    /**
    录入时间
     */
    private Date inputTime;

    /**
    短信验证码ID
     * @return the value of sms_verify.sms_id
     */
    public Long getSmsId() {
        return smsId;
    }

    public void setSmsId(Long smsId) {
        this.smsId = smsId;
    }

    /**
    手机号码
     * @return the value of sms_verify.mobile
     */
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
    验证码
     * @return the value of sms_verify.verify_code
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode == null ? null : verifyCode.trim();
    }

    /**
    过期时间
     * @return the value of sms_verify.exp_time
     */
    public Date getExpTime() {
        return expTime;
    }

    public void setExpTime(Date expTime) {
        this.expTime = expTime;
    }

    /**
    是否有效 0:无效 1:有效
     * @return the value of sms_verify.is_valid
     */
    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
    类型 1:投票
     * @return the value of sms_verify.sms_type
     */
    public Integer getSmsType() {
        return smsType;
    }

    public void setSmsType(Integer smsType) {
        this.smsType = smsType;
    }

    /**
    录入时间
     * @return the value of sms_verify.input_time
     */
    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }
}
