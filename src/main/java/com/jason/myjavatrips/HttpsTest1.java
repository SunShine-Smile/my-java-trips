package com.jason.myjavatrips;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;

/** 
 * @author Jason Wang
 * @time   2016年7月28日 下午4:52:17 
 */
public class HttpsTest1
{

	public static void main(String[] args) throws Exception
	{
		HttpClient client = wrapClient(new DefaultHttpClient());
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

	public static org.apache.http.client.HttpClient wrapClient(
			org.apache.http.client.HttpClient base)
	{
		try
		{
			SSLContext ctx = SSLContext.getInstance("TLS");
			X509TrustManager tm = new X509TrustManager()
			{
				@Override
				public java.security.cert.X509Certificate[] getAcceptedIssuers()
				{
					return null;
				}

				public void checkClientTrusted(X509Certificate[] arg0,
						String arg1) throws CertificateException
				{}

				public void checkServerTrusted(X509Certificate[] arg0,
						String arg1) throws CertificateException
				{}

				@Override
				public void checkClientTrusted(
						java.security.cert.X509Certificate[] chain,
						String authType)
						throws java.security.cert.CertificateException
				{
					// TODO Auto-generated method stub

				}

				@Override
				public void checkServerTrusted(
						java.security.cert.X509Certificate[] chain,
						String authType)
						throws java.security.cert.CertificateException
				{
					// TODO Auto-generated method stub

				}
			};
			ctx.init(null, new TrustManager[] { tm }, null);
			SSLSocketFactory ssf = new SSLSocketFactory(ctx,
					SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
			SchemeRegistry registry = new SchemeRegistry();
			registry.register(new Scheme("https", 443, ssf));
			ThreadSafeClientConnManager mgr = new ThreadSafeClientConnManager(
					registry);
			return new DefaultHttpClient(mgr, base.getParams());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
}
