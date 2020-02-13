package com.jason.myjavatrips;
import com.alibaba.fastjson.JSONObject;

/** 
 * @author Jason
 * @time   2017年8月17日 下午8:11:10 
 */
public class TestInteger
{
	public static void main(String[] args)
	{
//		Integer i = 1000003000;
//		Integer j = 1000001;
//		Integer z = i.intValue();
//		System.out.println(i.compareTo(j));
//		System.out.println(i.intValue());
//		System.out.println(z);
//		
//		String string = "100.00";
//		System.out.println(new BigDecimal(string).setScale(0));
		Integer price = 12900000 / 1000 * 100 * 1000 / 1000;
		System.out.println(price);
		TestExtendClass testClass = new TestExtendClass();
		testClass.setName("Jason");
		String classStr = JSONObject.toJSONString(testClass);
		TestExtendClass testClass1 = JSONObject.parseObject(classStr,TestExtendClass.class);
		testClass1.setName("Mike");
		System.out.println(JSONObject.toJSONString(testClass));
		System.out.println(JSONObject.toJSONString(testClass1));
		Integer integer = 1;
		Integer integer2 = null;
		System.out.println(integer2 == integer);
	}
}

class TestClass{
	
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
}
