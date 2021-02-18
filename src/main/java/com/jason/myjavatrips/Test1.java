package com.jason.myjavatrips;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;

/** 
 * @author Jason Wang
 * @time   2016年7月28日 上午11:08:48 
 */
public class Test1
{

	public static void main(String[] args)
	{
		try {  
			  
            HttpClient httpclient = new DefaultHttpClient();  
                        //Secure Protocol implementation.  
            SSLContext ctx = SSLContext.getInstance("SSL");  
                        //Implementation of a trust manager for X509 certificates  
            X509TrustManager tm = new X509TrustManager() {  
  
                public void checkClientTrusted(X509Certificate[] xcs,  
                        String string) throws CertificateException {  
  
                }  
  
                public void checkServerTrusted(X509Certificate[] xcs,  
                        String string) throws CertificateException {  
                }  
  
                public X509Certificate[] getAcceptedIssuers() {  
                    return null;  
                }  
            };  
            ctx.init(null, new TrustManager[] { tm }, null);  
            SSLSocketFactory ssf = new SSLSocketFactory(ctx);  
  
            ClientConnectionManager ccm = httpclient.getConnectionManager();  
                        //register https protocol in httpclient's scheme registry  
            SchemeRegistry sr = ccm.getSchemeRegistry();  
            sr.register(new Scheme("https", 443, ssf));  
            String uri = "https://ipay.le.com/pay/querystat";
            
            
            HttpGet httpPost = new HttpGet(uri); 
            //  httpPost.setHeader("content-type", contextType);
              // 执行POST请求
              HttpResponse response = httpclient.execute(httpPost); 
              
              HttpEntity entity = response.getEntity();
          	StringBuffer result = new StringBuffer();
          	if (entity != null) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(entity.getContent(), "UTF-8")); 
                  String line="";  
                  for(line=br.readLine();line!=null;line=br.readLine()) {  
                      result.append(line);
                  }
      		}
              System.out.println(result);

            
         /*   HttpGet httpget = new HttpGet(uri); 
            HttpParams params = httpclient.getParams();  
  
            params.setParameter("param1", "paramValue1");  
  
            httpget.setParams(params);  
            System.out.println("REQUEST:" + httpget.getURI());  
            ResponseHandler responseHandler = new BasicResponseHandler();  
            String responseBody;  
  
            responseBody = httpclient.execute(httpget, responseHandler);  */
  
            System.out.println(response.getEntity().getContent().toString());  
  
            // Create a response handler  
  
        } catch (NoSuchAlgorithmException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (ClientProtocolException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (Exception ex) {  
            ex.printStackTrace();  
  
        }  

	}

}
