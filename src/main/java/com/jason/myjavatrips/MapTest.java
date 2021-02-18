package com.jason.myjavatrips;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jason Wang
 * @time 2016年6月30日 下午3:04:44
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("test", null);
        System.out.println(param);
        param.put("uid", 1385);
        param.put("buss_name", "321123123213");
        param.put("buss_second_no", 1);
        param.put("mbd_desc", 123);
        param.put("buss_third_name", "测试");
        param.put("buss_first_type", 1);
        param.put("buss_third_id", "283584051");
        param.put("mutex_bit", "38");
        test1(param);
    }

    public static void test1(Map<String, Object> param) {
        Integer.valueOf(String.valueOf(param.get("MUTEX_BIT")));
        String.valueOf(param.get("BUSS_NAME"));
        Byte.valueOf(String.valueOf(param.get("BUSS_FIRST_TYPE")));
        String.valueOf(param.get("BUSS_SECOND_NO"));
        String.valueOf(param.get("BUSS_THIRD_ID"));
        String.valueOf(param.get("MBD_DESC"));
        Integer.valueOf(String.valueOf(param.get("UID")));
        String.valueOf(param.get("BUSS_THIRD_NAME"));
    }
}
