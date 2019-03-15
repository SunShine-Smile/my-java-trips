package com.jason.myjavatrips;
/**
 * Constants.java
 * @author sam wang
 * @date 2013-10-29
 * @sine 1.0
 * @Copyright http://shop.letv.com
 */


/**
 * 
 *  (描述类的功能) 公共常量
 * 
 * @author sam wang
 * 2013-10-29
 *
 */
public class Constants {
	//商城APP_KEY
	public static final String TMALL_APP_KEY = "21679683";
	//商城app_secret
	public static final String TMALL_APP_SECRET = "855636ffdde9647fa16a9c820e30e205";
	//商城session_key
	public static final String TMALL_SESSION_KEY = "62002009ZZfb1ik0cc5d67f9249338b3c59225e75efc41a2834699414";
	//商城链接地址
	public static final String TMALL_URL = "http://gw.api.taobao.com/router/rest";
	
	public static final String tradeFeild = "seller_nick, buyer_nick, title, type, created, tid, seller_rate,seller_can_rate, buyer_rate,can_rate,status, payment, discount_fee, adjust_fee, post_fee, total_fee, pay_time, end_time, modified, consign_time, buyer_obtain_point_fee, point_fee, real_point_fee, received_payment,pic_path, num_iid, num, price, cod_fee, cod_status, shipping_type, receiver_name, receiver_state, receiver_city, receiver_district, receiver_address, receiver_zip, receiver_mobile, receiver_phone,alipay_id,alipay_no,is_lgtype,is_force_wlb,is_brand_sale,has_buyer_message,credit_card_fee,step_trade_status,step_paid_fee,mark_desc,send_time,,has_yfx,yfx_fee,yfx_id,yfx_type,trade_source,seller_flag,is_daixiao,is_part_consign,area_id " +
			",orders";
	
	//操作成功
	public static final int SUCCESS = 1;
	//操作失败
	public static final int FAILED = 0;
	//日期格式化
	public static final String[] DATE_PATTERN = new String[]{"yyyyMMdd","yyyy-MM-dd","yyyy/MM/dd","yyyyMMddHHmmss", "yyyy-MM-dd HH:mm:ss","yyyy/MM/dd HH:mm:ss"};
	//默认页数
	public static final int DEFAULT_PAGE_SIZE = 30;
	//默认物流名称
	public static final String DEFAULT_EXPRESS_NAME = "乐视TV自有物流";
	//处理订单异常
	public static final int ORDER_CHECK_NOT_PASS =-5;//审核未通过
	public static final int ORDER_NOT_CHECK = -4;//待审核
	public static final int ORDER_VALID_NOT_PASS = -3;//校验不通过
	public static final int ORDER_AREA_EXCEPTION = -2;//抓取天猫数据生成区域代码异常
	public static final int ORDER_PROCESS_EXCEPTION = -1;//生成订单异常
	public static final int ORDER_NO_PROCESS = 0;//订单未处理
	public static final int ORDER_VALID_PASS = 1;//校验通过
	public static final int ORDER_NO_PROCESS_OK = 2;//处理订单正常
	public static final int ORDER_SEND_GOODS = 3;//订单已发货
	public static final int OA_ORDER_SEND_GOODS = 10;//oa订单已发货状态
	public static final String DEFAULT_INVOICE_TITLE = "";//默认开具发票
	
	//由16-天猫圆通改为13圆通速递 20130319
	//由13改为0 默认不填 20150430
	public static final int EXPRESS_COMPANY_ZJS_ID = 0;//默认不填
	public static final int ORDER_WAY_TMALL = 11;//圆通ID，公司的物流公司表 
	//通讯ip
	public static final String socketIp = "127.0.0.1";
	//通讯端口
	public static final int port = 8001;
	
	public static final String tradeFeildDetails = "invoice_name,buyer_message,seller_memo";//发票信息
	//后台注册接口
//	public static final String REGIST4BACKSTAGE_SERVICE_URL = PropertiesHolder.getInstance().getProperty("regist4backstage_service_url");
}
