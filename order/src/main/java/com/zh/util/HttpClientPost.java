package com.zh.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
//import org.json.JSONObject;
import org.junit.Test;

import com.alibaba.druid.support.json.JSONUtils;

public class HttpClientPost {
	
	@Test
	public void json() throws Exception {
		String url = "http://localhost:7900/order/selectOrder";
		String result = httpPostWithJSON(url);
		System.out.println(result);
	}

	public static String httpPostWithJSON(String url) throws Exception {
		HttpPost httpPost = new HttpPost(url);
		CloseableHttpClient client = HttpClients.createDefault();
		String respContent = null;

		// json方式
		JSONUtils jsonParam = new JSONUtils();
		

		StringEntity entity = new StringEntity(jsonParam.toString(), "utf-8");// 解决中文乱码问题
		entity.setContentEncoding("UTF-8");
		entity.setContentType("application/json");
		httpPost.setEntity(entity);

		HttpResponse resp = client.execute(httpPost);
		if (resp.getStatusLine().getStatusCode() == 200) {
			HttpEntity he = resp.getEntity();
			respContent = EntityUtils.toString(he, "UTF-8");
		}
		return respContent;
	}

}
