package com.alipay.config;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeOrderSettleRequest;
import com.alipay.api.response.AlipayTradeOrderSettleResponse;

public class Snippet {

	public void alipay() throws AlipayApiException {
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",AlipayConfig.APPID,
				AlipayConfig.RSA_PRIVATE_KEY , AlipayConfig.FORMAT, AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.SIGNTYPE);
		
		AlipayTradeOrderSettleRequest request = new AlipayTradeOrderSettleRequest();
		request.setBizContent(
				"{" + "\"out_request_no\":\"20000727001\"," + "\"trade_no\":\"2014030411011007850000672009\","
						+ "      \"royalty_parameters\":[{" + "        \"trans_out\":\"csjsxi3881@sandbox.com\","
						+ "\"trans_in\":\"2088102177035336\"," + "\"amount\":0.1," + "\"amount_percentage\":100,"
					    + "        }]," + "\"operator_id\":\"A0001\"" + "  }");
		AlipayTradeOrderSettleResponse response = alipayClient.execute(request);
		if (response.isSuccess()) {
			System.out.println("调用成功");
		} else {
			System.out.println("调用失败");
		}
	}
	public static void main(String[] args) {
		Snippet snippet = new Snippet();
		try {
			snippet.alipay();
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
