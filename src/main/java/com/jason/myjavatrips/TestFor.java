package com.jason.myjavatrips;
import java.util.Enumeration;
import java.util.StringTokenizer;


//import org.apache.catalina.startup.RealmRuleSet;

public class TestFor {
      public static void main(String[] args){
             String[] str = new String[]{"1","1","1","1","1"};
             for(String myStr : str){
                    myStr = "atguigu";
                    System.out.println(myStr);
              }
             for(int i = 0;i < str.length;i++){
                    System.out.println(str[i]);
             }
             Enumeration stringEnum = new StringTokenizer("a-b*c-d-e-g", "-");
         	while(stringEnum.hasMoreElements()){
         		Object obj = stringEnum.nextElement();
         		System.out.println(obj); 
         	}
         	String integer = "6";
         	test123123(integer);
         	System.out.println(integer);
         	System.out.println(String.format("mac:areaCode:%s:areaId:%d:", "a",1,3 ));
       }
      
      private static String test123123(String integer){
    	  integer =  "5";
    	  return integer;
      }
}
