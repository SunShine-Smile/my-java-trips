package com.jason.myjavatrips;
/** 
 * @author Jason Wang
 * @time   2016年7月21日 下午2:48:45 
 */
public class TestIntAndByte
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		byte b = 1;
		int i = b;
		System.out.println(b);
		System.out.println(b==i);
		
		int b1 = 1111;
		byte i1 = (byte)b1;
		System.out.println(b1);
		System.out.println(i1);
		System.out.println(b1==i1);
	}

}
