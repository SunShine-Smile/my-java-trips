package com.jason.myjavatrips;
import java.io.IOException;

/** 
 * @author Jason Wang
 * @time   2016年7月15日 下午1:51:00 
 */
public class testTrycatch
{

	public static void main(String[] args)
	{
		try
		{
			System.out.println("开始");
			test1();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
//				continue;
		}
		catch(Exception e){
			System.out.println("结束");
		}
	}

	private static void test1() throws IOException
	{
		// TODO Auto-generated method stub
//		try{
			int i=0;
			if(i<1){
				throw new IOException("error");
			}
//		}catch(Exception e){
//			e.getMessage();
//		}
	}

}
