package com.jason.myjavatrips;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Jason Wang
 * @time 2016年6月27日 上午10:47:32
 */
public class MapTest1 {
    public static void main(String[] args) throws ParseException {
//		Map<String, BigDecimal> returnMap = new HashMap<String, BigDecimal>();
//		returnMap.put("731", new BigDecimal(90.00));
//		for (Map.Entry<String, BigDecimal> entry : returnMap.entrySet()) {
//			System.out.println(Integer.valueOf(entry.getKey()));
//			System.out.println(Long.valueOf("90"));
//			System.out.println(new Date());
//		}
        byte b = 1;
        int i = b;
        System.out.println(b + "");
        System.out.println(b == i);
//		System.out.println(i);
        String str = "2016-06-30 00:00:00";
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str));
        System.out.println(new Date());
    }
}
