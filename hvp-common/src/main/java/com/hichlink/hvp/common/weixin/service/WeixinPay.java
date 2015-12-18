package com.hichlink.hvp.common.weixin.service;

import com.hichlink.hvp.common.weixin.entity.WxOrderInfo;
import com.hichlink.hvp.common.weixin.entity.WxOrderInfoResp;
import com.hichlink.hvp.common.weixin.entity.WxRefundReq;
import com.hichlink.hvp.common.weixin.entity.WxRefundResp;

public interface WeixinPay {
	WxOrderInfoResp sendOrder(WxOrderInfo wxOrderInfo, String key);

	WxRefundResp refund(WxRefundReq wxRefundReq, String key,String certPath);
}
