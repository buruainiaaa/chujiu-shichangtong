package com.cj.shichangtong.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;

import net.sf.json.JSONObject;

public class HttpClientUtil {

	public static String post(JSONObject json, String URL) {
		InterfaceLogUtil.writeInfo("请求开始！");
		InterfaceLogUtil.writeInfo("*****请求报文*****：" + json.toString());
		InterfaceLogUtil.writeInfo("*****请求地址*****：" + URL);
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(URL);

		post.setHeader("Content-Type", "application/json");
		String result = "";

		try {

			StringEntity s = new StringEntity(json.toString(), "utf-8");
			s.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
			post.setEntity(s);

			// 发送请求
			HttpResponse httpResponse = client.execute(post);

			// 获取响应输入流
			InputStream inStream = httpResponse.getEntity().getContent();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inStream, "utf-8"));
			StringBuilder strber = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null)
				strber.append(line + "\n");
			inStream.close();

			result = strber.toString();
			System.out.println(result);

			if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {

			} else {
				InterfaceLogUtil.writeDebug("********请求服务端失败**********");
				InterfaceLogUtil.writeDebug("*****参考报文*****：" + json.toString());
				InterfaceLogUtil.writeDebug("*****参考地址*****：" + URL);
			}

		} catch (Exception e) {
			InterfaceLogUtil.writeDebug("**********请求异常**********:" + e.getMessage());
			InterfaceLogUtil.writeDebug("*****异常参考报文*****：" + json.toString());
			InterfaceLogUtil.writeDebug("*****异常参考地址*****：" + URL);
		}
		InterfaceLogUtil.writeInfo("********请求完成，响应报文**********:" + result);
		InterfaceLogUtil.writeInfo("请求结束！");
		return result;
	}
}
