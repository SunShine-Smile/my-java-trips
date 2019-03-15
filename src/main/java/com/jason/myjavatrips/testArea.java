package com.jason.myjavatrips;
/** 
 * @author Jason Wang
 * @time   2016年4月28日 上午9:49:13 
 */
public class testArea
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		String uniqueName = "北京北京市宣武区"; 
		uniqueName = uniqueName.equals("北京北京市宣武区") ? "北京北京市西城区"
				: (uniqueName.equals("北京北京市崇文区") ? "北京北京市东城区" : uniqueName);
		System.out.println(uniqueName);
		Integer integer = 1;
		Integer i = 2;
		System.out.println(integer > i);
	}

}
