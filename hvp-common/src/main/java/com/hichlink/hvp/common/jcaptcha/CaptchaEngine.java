package com.hichlink.hvp.common.jcaptcha;

import java.awt.Color;
import java.awt.Font;

import com.octo.captcha.component.image.backgroundgenerator.BackgroundGenerator;
import com.octo.captcha.component.image.backgroundgenerator.FunkyBackgroundGenerator;
import com.octo.captcha.component.image.fontgenerator.FontGenerator;
import com.octo.captcha.component.image.fontgenerator.RandomFontGenerator;
import com.octo.captcha.component.image.textpaster.RandomTextPaster;
import com.octo.captcha.component.image.textpaster.TextPaster;
import com.octo.captcha.component.image.wordtoimage.ComposedWordToImage;
import com.octo.captcha.component.image.wordtoimage.WordToImage;
import com.octo.captcha.component.word.wordgenerator.RandomWordGenerator;
import com.octo.captcha.component.word.wordgenerator.WordGenerator;
import com.octo.captcha.engine.image.ListImageCaptchaEngine;
import com.octo.captcha.image.gimpy.GimpyFactory;
/**
 * 
 * <b>Title：</b>CaptchaEngine.java<br/>
 * <b>Description：</b> 验证码引擎-->彩色验证码<br/>
 * <b>@author： </b>zhuangruhai<br/>
 * <b>@date：</b>2013-6-14 上午09:31:09<br/>  
 * <b>Copyright (c) 2013 ASPire Tech.</b>   
 *
 */
public class CaptchaEngine extends ListImageCaptchaEngine {

	protected void buildInitialFactories() {
		// 随机生成的字符
		WordGenerator wordGenerator = new RandomWordGenerator("0123456789");
		// 文字显示的个数
		TextPaster textPaster = new RandomTextPaster(4, 4, Color.WHITE);
		// 图片的大小
		BackgroundGenerator backgroundGenerator = new FunkyBackgroundGenerator(
				80, 30);
		// 字体格式
		Font[] fontsList = new Font[] { new Font("Arial", 0, 10),
				new Font("Tahoma", 0, 10), new Font("Verdana", 0, 10) };
		// 文字的大小
		FontGenerator fontGenerator = new RandomFontGenerator(new Integer(16),
				new Integer(20), fontsList);

		WordToImage wordToImage = new ComposedWordToImage(fontGenerator,
				backgroundGenerator, textPaster);
		addFactory(new GimpyFactory(wordGenerator, wordToImage));
	}
}