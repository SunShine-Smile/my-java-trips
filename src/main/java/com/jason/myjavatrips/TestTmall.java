package com.jason.myjavatrips;
import java.text.SimpleDateFormat;
import java.util.List;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.domain.Trade;
import com.taobao.api.request.TradeFullinfoGetRequest;
import com.taobao.api.request.TradesSoldIncrementGetRequest;
import com.taobao.api.response.TradeFullinfoGetResponse;
import com.taobao.api.response.TradesSoldIncrementGetResponse;

/** 
 * @author Jason Wang
 * @time   2016年5月18日 下午2:18:30 
 */
public class TestTmall
{
	
		public static void main(String[] args) throws ApiException
		{
			Trade trade = queryTradeDetailsByTid(1573513050081681L);
			System.out.println(trade.getPayment());
			
		}
		
		public static void pullTmallOrder(){
			try{
				TaobaoClient client=new DefaultTaobaoClient(Constants.TMALL_URL, Constants.TMALL_APP_KEY, Constants.TMALL_APP_SECRET);
				SimpleDateFormat df=new SimpleDateFormat("yyyyMMddHHmmss");
				TradesSoldIncrementGetRequest req=new TradesSoldIncrementGetRequest();
				req.setFields(Constants.tradeFeild);
				req.setStartModified(df.parse("2016-05-18 00:00:00"));
				req.setEndModified(df.parse("2016-05-18 23:59:59"));
				req.setUseHasNext(true);
				req.setPageNo(Long.parseLong("1"));
				req.setPageSize(Long.parseLong("10"));
				req.setUseHasNext(true);
//				req.setIsAcookie(false);
				req.setStatus("WAIT_BUYER_CONFIRM_GOODS");
				System.out.println("WAIT_SELLER_SEND_GOODS");
				TradesSoldIncrementGetResponse response = client.execute(req , Constants.TMALL_SESSION_KEY);
				List<Trade> trades = response.getTrades();
				
				//特殊处理发票信息
				if(trades!=null&&trades.size()>0){
					for(Trade trade:trades){
						Trade t = queryTradePartDetails(trade.getTid());
						if(t!=null){
							trade.setInvoiceName(t.getInvoiceName());//发票抬头
							trade.setBuyerMessage(t.getBuyerMessage());//买家留言
							trade.setSellerMemo(t.getSellerMemo());//卖家备注
						}else{
							System.out.println("没有取到交易的详细信息tid="+trade.getTid());
						}
					}
				}
				response.setTrades(trades);//处理完成之后回填数据
				System.out.println(trades.get(0));
				System.out.println(response);
				}
				catch(Exception e){
					
				}
		}
		
		public static Trade queryTradePartDetails(Long tid) throws ApiException{
			if(tid==null){
				System.out.println("没有取到交易的详细信息tid="+tid);
				return null;
			}
			System.out.println("获取天猫订单详细信息开始，交易订单号:"+tid);
			TaobaoClient client=new DefaultTaobaoClient(Constants.TMALL_URL, Constants.TMALL_APP_KEY, Constants.TMALL_APP_SECRET);
			TradeFullinfoGetRequest req=new TradeFullinfoGetRequest();
			req.setFields("http://authentication.wangjiu.com/api/web/insert/regist4Backstage.json");
			req.setTid(tid);
			try {
				TradeFullinfoGetResponse response = client.execute(req , Constants.TMALL_SESSION_KEY);
				return response.getTrade();
			} catch (ApiException e) {//捕获天猫API异常重新连接
				// TODO Auto-generated catch block
				TradeFullinfoGetResponse response = client.execute(req , Constants.TMALL_SESSION_KEY);
				return response.getTrade();
			}
		}
		
		public static Trade queryTradeDetailsByTid(Long tid) throws ApiException{
			if(tid==null){
				System.out.println("没有取到交易的详细信息tid="+tid);
				return null;
			}
			System.out.println("获取天猫订单详细信息开始，交易订单号:"+tid);
			TaobaoClient client=new DefaultTaobaoClient(Constants.TMALL_URL, Constants.TMALL_APP_KEY, Constants.TMALL_APP_SECRET);
			TradeFullinfoGetRequest req=new TradeFullinfoGetRequest();
			req.setFields(Constants.tradeFeild+","+Constants.tradeFeildDetails);
			req.setTid(tid);
			try {
				
				TradeFullinfoGetResponse response = client.execute(req , Constants.TMALL_SESSION_KEY);
				return response.getTrade();
			} catch (ApiException e) {//捕获天猫API异常重新连接
				// TODO Auto-generated catch block
				TradeFullinfoGetResponse response = client.execute(req , Constants.TMALL_SESSION_KEY);
				return response.getTrade();
			}
		}
}
