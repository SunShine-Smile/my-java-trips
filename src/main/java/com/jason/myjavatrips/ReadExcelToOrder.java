package com.jason.myjavatrips;

import java.util.ArrayList;
import java.util.List;

import com.ijustyce.xlsx.cellModel;
import com.ijustyce.xlsx.xlsx;

//你是想读取一个excel内容，然后整合一下里面数据，然后再生成一个新的excel吧。

public class ReadExcelToOrder {

	private static List<cellModel> list;
	
	public static void main(String[] args) {

		list = xlsx.readStringFromXlsx("D:\\sapphire\\新建 Microsoft Excel 工作表.xlsx", "Sheet1");
		int size = list.size();
		int size_value = 0;
		List<String[]> resultList = new ArrayList<String[]>(); 
		for (int i = 0; i < size; i++) {
			cellModel model = list.get(i);
			String[] tmp = model.getCell();
			resultList.add(tmp);
		}
		
		for(int i = 0; i<resultList.size() ;i++){
//			System.out.println(i + 1);
			String[] tempArr = resultList.get(i);
			String tele = tempArr[7];
			String address = tempArr[8];
			String card_no = tempArr[14];
			String card_pass = tempArr[15];
			String external_order_id = tempArr[0];
			int provinceId = Integer.valueOf(tempArr[16].trim().replace(".0", ""));
			int cityId = Integer.valueOf(tempArr[17].trim().replace(".0", ""));
			int districtId = Integer.valueOf(tempArr[18].trim().replace(".0", ""));
			String uid = tempArr[5];
			String receiver = tempArr[6];
			if(card_pass.length() == 3){
				card_pass = "000" + card_pass;
			} else if(card_pass.length() == 4){
				card_pass = "00" + card_pass;
			} else if(card_pass.length() == 5){
				card_pass = "0" + card_pass;
			}else if(card_pass.length() == 2){
				card_pass = "0000" + card_pass;
			}
			size_value++;
			String sqlStr = "insert orders_excel_imp (user_id,receiver,mobile,address,card_no,card_pass,province_id,city_id,district_id,is_back_fill_status,card_type,create_at,external_order_id) values ";
			sqlStr = sqlStr + "('" + uid + "','" + receiver + "','"+ tele + "','"+ address + "','"+ card_no + "','"+ card_pass + "',"+ provinceId + "," + cityId + "," + districtId + ",0,3,now(),'"+external_order_id+"');";
			System.out.println(sqlStr);
		}
		
		int value1 = size;
		System.out.println( "原表条数：" + value1);
		System.out.println( "实际条数：" + size_value);
		
		
//		list2 = xlsx.readStringFromXlsx("E:\\huimin_old.xlsx", "Sheet1");
//		int size2 = list2.size();
//		
//		List<String[]> resultList2 = new ArrayList<String[]>(); 
//		for (int i = 0; i < size2; i++) {
//			cellModel model = list2.get(i);
//			String[] tmp = model.getCell();
//			resultList2.add(tmp);
//		}
//		String[][] value2 = new String[resultList2.size()][3];
//		for(int i = 0; i<resultList2.size() ;i++){
//			String[] tempArr = resultList2.get(i);
//			value2[i][0] = tempArr[0];
//			value2[i][1] = tempArr[1];
//			value2[i][2] = tempArr[2];
//			for(int j = 0; j < 3; j++){
////				System.out.print(value2[i][j]);
//			}
////			System.out.println("");
//		}
//		int value3 = size2;
//		System.out.println( "原表条数：" + value3);
//		//新表
//		list = xlsx.readStringFromXlsx("E:\\huimin_new.xls", "SQL Results");
//		int size = list.size();
//		
//		List<String[]> resultList = new ArrayList<String[]>(); 
//		for (int i = 0; i < size; i++) {
//			cellModel model = list.get(i);
//			String[] tmp = model.getCell();
//			resultList.add(tmp);
//		}
//		String[][] value = new String[resultList.size()][6];
//		int flag = 0;
//		for(int i = 0; i<resultList.size() ;i++){
//			String[] tempArr = resultList.get(i);
//			value[i][0] = tempArr[0];
//			value[i][1] = tempArr[1];
//			value[i][2] = tempArr[2];
//			value[i][3] = tempArr[3];
//			value[i][4] = tempArr[4];
//			value[i][5] = tempArr[5];
//			Boolean b = true;
//			for(int j = 0; j<value2.length ;j++){
//				if(tempArr[1].trim().equals(value2[j][0].trim()) && tempArr[3].trim().equals(value2[j][1].trim()) && tempArr[5].trim().equals(value2[j][2].trim())){
//					
//					b = false;
//				}
//			}
//			if(b){
//				flag++;
//				System.out.println(tempArr[5]);
//			}
////			String sqlStr = "update area_relation set third_district_id=" + tempArr[0].trim().replace(".0", "") + " where relation_type=3 and third_city_id=" + tempArr[2].trim().replace(".0", "") + " and third_district_name='"+ tempArr[1] +"';";
////			System.out.println(sqlStr);
////			for(int j = 0; j < 6; j++){
////				System.out.print(value[i][j]);
////			}
////			System.out.println("");
//		}
//		int value1 = size;
//		System.out.println( "表条数：" + flag);
//
	}
	
	
	
//	public static void main(String[] args) {
//
//		list = xlsx.readStringFromXlsx("E:\\111.xlsx", "sheet1");
//		list2 =xlsx.readStringFromXlsx("E:\\222.xlsx", "sheet1");
//		int size = list.size();
//		int size2 = list2.size();
//		
//		List<String[]> resultList = new ArrayList<String[]>(); 
//		for (int i = 0; i < size; i++) {
//			cellModel model = list.get(i);
//			String[] tmp = model.getCell();
//			Boolean bl = true;
//			for(int j = 0; j < size2; j++){
//				cellModel model2 = list2.get(j);
//				String[] tmp2 = model2.getCell();
//				System.out.println(tmp[0]+"  "+tmp[2]+ "---"+tmp2[1]);
//				if(tmp[2].trim().equals(tmp2[1].trim())){
//					bl = false;
//				}	
//			}
//			if(bl){
//				resultList.add(tmp);
//			}
////			for (String string : tmp) {
////				System.out.print(string + "    ");
////			}
////			System.out.println();
//		}
//		String[][] value = new String[resultList.size()][3];
//		for(int i = 0; i<resultList.size() ;i++){
//			String[] tempArr = resultList.get(i);
//			value[i][0] = tempArr[0];
//			value[i][1] = tempArr[1];
//			value[i][2] = tempArr[2];
//		}
//		int value1 = size -1;
//		int value2 = size2 -1;
//		int value3 = value1 - value2;
//		int valueSize = value.length -1;
//		System.out.println( "原表条数：" + value1);
//		System.out.println( "排除条数：" + value2);
//		System.out.println( "原表 - 排除 = ：" + value3);
//		System.out.println( "导出表结果行数：" + valueSize);
//		File xlsxFile = new File("E:\\result.xlsx");
//		xlsx.writeStringToXlsx("sheet1", value, xlsxFile, true, "blank");
//	}
	
	
	
	
//	public static void main(String[] args) {
//		String routerUrl = "http://openapi.yhd.com/app/api/rest/router";
//		//测试环境密钥
//		String secretKey = "566000e575e9aca48772d8b36511a256";
//		Map<String, String> paramMap = new HashMap<String, String>();
//		// 系统级参数设置（必须）
//		Date currentTime = new Date();
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String timestamp = format.format(currentTime);
//		paramMap.put("appKey", "10220014121000002706");
//		paramMap.put("sessionKey", "0c5a5ae585fe80e64224511f0bb7ec1e");
//		paramMap.put("timestamp", timestamp);
//		paramMap.put("format", "json");
//		paramMap.put("method", "yhd.areas.get");
//		paramMap.put("ver", "1.0");
//		
//		paramMap.put("orderStatusList", "id,type,name,parent_id,zip");
//		String response = "";
//		response = PostClient.sendByPost(paramMap, secretKey, routerUrl);
//		JSONObject jasonObject = JSONObject.fromObject(response);
//		Map<String, Object> resultMap = (Map<String, Object>)jasonObject;
//		Map<String, Object> areas_get_response = (Map<String, Object>)resultMap.get("areas_get_response");
//		Map<String, Object> areas = (Map<String, Object>)areas_get_response.get("areas");
//		List<Map<String, Object>> area = (List<Map<String, Object>>)areas.get("area");
//		
//		List<Map<String, String>> finalArea = new ArrayList<Map<String, String>>();
//		for(Map<String, Object> sigleArea: area){
//			Map<String, String> aa = new HashMap<String, String>();
//			if(sigleArea.get("type").toString().equals("4")){
//				aa.put("district", sigleArea.get("name").toString());
//				
//				for(Map<String, Object> sigleArea2: area){
//					if(sigleArea2.get("type").toString().equals("3") && sigleArea.get("parent_id").toString().equals(sigleArea2.get("id").toString())){
//						aa.put("city", sigleArea2.get("name").toString());
//						aa.put("parent_id", sigleArea2.get("parent_id").toString());
//					}
//				}
//				finalArea.add(aa);
//			}
//		}
//		String[][] value = new String[finalArea.size()][3];
//		for(int i = 0; i < finalArea.size(); i++){
//			Map<String, String> fa = finalArea.get(i);
//			for(Map<String, Object> sigleArea3: area){
//				if(sigleArea3.get("type").toString().equals("2") && fa.get("parent_id").toString().equals(sigleArea3.get("id").toString())){
//					fa.put("province", sigleArea3.get("name").toString());
//				}
//			}
//			
//			String [] areaStrArgs = new String[fa.size()-1];
//			areaStrArgs[0] = fa.get("province").toString();
//			areaStrArgs[1] = fa.get("city").toString();
//			areaStrArgs[2] = fa.get("district").toString();
//			value[i] = areaStrArgs;
//		}
//		System.out.println(value);
//		File xlsxFile = new File("E:\\areas.xlsx");
////		String [][] result ={{"11","12","13","14","15"},{"21","22","000","24","25"},{"31","000","33","000","35"}};
//		xlsx.writeStringToXlsx("sheet1" ,value, xlsxFile, true, "blank");
//	}


	// int[][] result =
	// {{11,12,13,14,15},{21,22,000,24,25},{31,000,33,000,35}};
	// xlsx.writeIntToXlsx("sheet1" ,result, xlsxFile, true, 000);
}