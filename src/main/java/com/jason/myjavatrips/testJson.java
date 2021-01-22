package com.jason.myjavatrips;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * @author Jason Wang
 * @time   2016年6月23日 下午12:29:30 
 */
public class testJson
{
	public static void main(String[] args) throws ParseException
	{
//		String string = "{\"ids\":[100],\"mapBiSc2id\":{\"1\":\"100\"},\"action\":\"update\",\"tableType\":\"p_bi\"}";
//		JSONObject jsonObject = JSONObject.parseObject(string);
//		System.out.println(jsonObject.get("mapBiSc2id"));
//		System.out.println(jsonObject.get("action"));
//		System.out.println(jsonObject.get("tableType"));
//		System.out.println(jsonObject.get("mapBiSc2id").toString().replace("{", "").replace("}", "").replace("\"", "").split(":")[0]);
		BigDecimal price = BigDecimal.ZERO;
		System.out.println(price.doubleValue());
		
		String string2 = "";
//		JSONObject jsonObject2 = JSONObject.parseObject(string2);
//		JSONArray jsonArray = jsonObject2.getJSONArray("data");
//		for(int i = 0; i < jsonArray.size(); i++){
//			JSONObject newJson = JSONObject.parseObject(jsonArray.get(i).toString().toString());
//			System.out.println(newJson.get("company_id")+",");
//		}
		System.out.println(getIntFromStr("8:08"));
		System.out.println("".equals(null));
		System.out.println("  12  123  ".trim());
		System.out.println(Math.round(-1.5));
		int score = 70;
		switch (score) {
			case 70:
				System.out.println("Great score!");
			case 50:
				System.out.println("Pass score");
			default:
				System.out.println("Unknown score");
		}

		
	}
	
	public static Integer getIntFromStr(String strs) {
		if (strs != null && strs.contains(":")) {
			String[] str = strs.split(":");
			return Integer.valueOf(Integer.parseInt(str[0] + str[1]));
		} else {
			return Integer.valueOf(0);
		}
	}
}
