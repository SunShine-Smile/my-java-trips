package com.jason.myjavatrips;

import java.util.Arrays;

/** 
 * @author Jason Wang
 * @time   2016年9月20日 上午10:31:11 
 */
public class TestTrim
{
	public static void main(String[] args)
	{
		String string = " 123 ,123, ";
		System.out.println(string.trim());
		System.out.println("********" + myTest());
		
		int[] dp = new int[10];
		Arrays.fill(dp, 1);
		System.out.println(dp[6]);
		int i = (int)Math.pow(2, 5);
		System.out.println(i);
	}
	
	public static String myTest() {
		try {
			int i = 1/0;
		} catch (Exception e) {
			return e.getMessage().toString();
		} finally {
			return "false";
		}
	}
}
