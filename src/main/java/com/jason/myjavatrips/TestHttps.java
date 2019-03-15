package com.jason.myjavatrips;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

/** 
 * @author Jason Wang
 * @time   2016年7月28日 下午1:09:59 
 */
public class TestHttps
{

	public static void main(String[] args) throws Exception
	{
		HttpClient client = new DefaultHttpClient();
		
		HttpPost post = new HttpPost("https://ipay.le.com/pay/querystat");
		HttpResponse response = client.execute(post);
		
		InputStream is=response.getEntity().getContent();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(is,"UTF-8"));
		StringBuilder sb=new StringBuilder();
		for(String temp=br.readLine();temp!=null;sb.append(temp),temp=br.readLine())
		{
			;
		}
		
		String result=sb.toString();
		
		System.out.println(result);


	}

}
