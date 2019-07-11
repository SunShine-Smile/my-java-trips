package com.jason.myjavatrips;
import java.util.ArrayList;
import java.util.List;

//import com.ijustyce.xlsx.cellModel;
//import com.ijustyce.xlsx.xlsx;

//你是想读取一个excel内容，然后整合一下里面数据，然后再生成一个新的excel吧。

public class ReadExcelToImporder {

//	private static List<cellModel> list;
	
	public static void main(String[] args) {

//		list = xlsx.readStringFromXlsx("D:\\文档\\开发\\新建 Microsoft Excel 工作表.xlsx", "Sheet1");
//		int size = list.size();
//		int size_value = 0;
//		List<String[]> resultList = new ArrayList<String[]>(); 
//		for (int i = 0; i < size; i++) {
//			cellModel model = list.get(i);
//			String[] tmp = model.getCell();
//			resultList.add(tmp);
//		}
//		
//		for(int i = 0; i<resultList.size() ;i++){
////			System.out.println(i + 1);
//			String[] tempArr = resultList.get(i);
//			String external_order_id = tempArr[0];
//			String receiver = tempArr[1];
//			String address = tempArr[10];
//			String product_infos = tempArr[3];
//			int provinceId = Integer.valueOf(tempArr[15].trim().replace(".0", ""));
//			int cityId = Integer.valueOf(tempArr[16].trim().replace(".0", ""));
//			int districtId = Integer.valueOf(tempArr[17].trim().replace(".0", ""));
//			int status = 0;
//			String mobile = tempArr[2];
//			String shipping_fee = tempArr[5];
//			String order_amount = tempArr[6];
//			String order_desc = tempArr[11];
//			String payment_method_id = "CS-REMITTANCE";//赊销 支付方式
//			String invoice_type = tempArr[12];
//			String invoice_cotent = tempArr[13];
//			String invoice_title = tempArr[14];
//			
//			int order_way = 51;// 淘宝下单：12  楚楚街：54  融e购：76  一号店：10  苏宁下单：51  ！！！此处要注意订单来源 ！！！！
//			size_value++;
//			String sqlStr = "insert import_orders (third_order_id,order_way,receiver,address,product_infos,province_id,city_id,district_id,status,mobile,shipping_fee,order_amount,order_desc,create_at,update_at,payment_method_id,invoice_type,invoice_cotent,invoice_title) values ";
//			sqlStr = sqlStr + "('" + external_order_id + "'," + order_way + ",'" + receiver + "','" + address + "','"
//					+ product_infos + "'," + provinceId + "," + cityId + "," + districtId + "," + status + ",'" + mobile
//					+ "'," + shipping_fee + "," + order_amount + ",'" + order_desc + "',now(),now(),'"
//					+ payment_method_id + "'," + invoice_type + "," + invoice_cotent + ",'" + invoice_title + "');";
//
//			System.out.println(sqlStr);
//		}
//		
//		int value1 = size;
//		System.out.println( "原表条数：" + value1);
//		System.out.println( "实际条数：" + size_value);
	}
}