package com.hichlink.hvp.common.weixin.service;

import com.hichlink.hvp.common.weixin.entity.WxMchOrderInfo;
import com.hichlink.hvp.common.weixin.entity.WxMchOrderInfoResp;

public interface WeixinMchPay {
	WxMchOrderInfoResp sendOrder(WxMchOrderInfo wxMchOrderInfo,String key,String certPath);
}
