package com.jason.myjavatrips;
/** 
 * @author Jason Wang
 * @time   2016年9月5日 下午1:46:36 
 */
public class TestStringBuilder
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		StringBuilder stringBuilder = new StringBuilder();
		System.out.println(stringBuilder.length());
//		System.out.println(stringBuilder.toString().substring(0, stringBuilder.toString().length()-1));
		for(int i=0;i<10;i++){
			stringBuilder.append(i+",");
		}
		System.out.println(stringBuilder.deleteCharAt(stringBuilder.length()-1));
		String[] string=stringBuilder.toString().split(",");
		System.out.println(string.length);
		System.out.println(String.format("newups:area:%d:areacode:%d", 1,2));
		String string1 = "1";
		System.out.println(string1.split(",")[0]);
	}

}
