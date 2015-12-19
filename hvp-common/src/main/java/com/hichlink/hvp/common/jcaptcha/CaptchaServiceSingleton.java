package com.hichlink.hvp.common.jcaptcha;

import com.octo.captcha.service.captchastore.FastHashMapCaptchaStore;
import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;
import com.octo.captcha.service.image.ImageCaptchaService;

/**
 * 
 * <b>Title：</b>CaptchaServiceSingleton.java<br/>
 * <b>Description：</b>Captcha验证码操作单实例类<br/>
 * <b>@author： </b>zhuangruhai<br/>
 * <b>@date：</b>2013-6-14 上午09:31:20<br/>  
 * <b>Copyright (c) 2013 ASPire Tech.</b>   
 *
 */
public class CaptchaServiceSingleton {

	private static ImageCaptchaService instance = new DefaultManageableImageCaptchaService(
			new FastHashMapCaptchaStore(), new CaptchaEngine(), 180, 100000,
			75000);

	private CaptchaServiceSingleton() {
	}

	public static ImageCaptchaService getInstance() {
		return instance;
	}

}