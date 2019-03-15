package com.jason.myjavatrips;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/** 
 * @author Jason Wang
 * @time   2016年7月14日 下午4:37:05 
 */
public class testThread123
{
	static ScheduledExecutorService schExe = Executors.newScheduledThreadPool(4);
	public static void main(String[] args) throws Exception
	{
		
//		testMain1();
//		testMain2();
//		testMain3();
//		testMain4();
		testThread123 testThread123 = new testThread123();  
		for(int i=0;i<1000;i++) {
			System.out.println(testThread123.wrap(()-> "aa")+i);
		}
	}

	
	public String wrap(Callable<String> callable) throws Exception {
		return callable.call();
	}
	
	private static void testMain4()
	{
		// TODO Auto-generated method stub
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {				
					test1();
				} catch (Exception e) {				
					e.printStackTrace();
				}
			}
		};
		
		schExe.scheduleAtFixedRate(task, 1,10*1000,TimeUnit.MILLISECONDS);
	}

	private static void testMain3()
	{
		// TODO Auto-generated method stub
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {				
					test1();
				} catch (Exception e) {				
					e.printStackTrace();
				}
			}
		};
		
		schExe.scheduleAtFixedRate(task, 1,10*1000,TimeUnit.MILLISECONDS);
	}

	private static void testMain2()
	{
		// TODO Auto-generated method stub
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {				
					test1();
				} catch (Exception e) {				
					e.printStackTrace();
				}
			}
		};
		
		schExe.scheduleAtFixedRate(task, 1,10*1000,TimeUnit.MILLISECONDS);
	}

	private static void testMain1()
	{
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {				
					test1();
				} catch (Exception e) {				
					e.printStackTrace();
				}
			}
		};
		
		schExe.scheduleAtFixedRate(task, 1,10*1000,TimeUnit.MILLISECONDS);
	}

	protected static void test1() throws InterruptedException
	{
		int count = 0;
		// TODO Auto-generated method stub
		try
		{
			count = 1;
			System.out.println(Thread.currentThread().getName()+" "+new Date().getMinutes()+":"+new Date().getSeconds()+" 第"+count+"次执行");
			test123();
			System.out.println("执行完毕");
		}
		catch (Exception e)
		{
			count++;
			Thread.currentThread().sleep(5*1000);
			try{
				System.out.println(Thread.currentThread().getName()+" "+new Date().getMinutes()+":"+new Date().getSeconds()+" 第"+count+"次执行");
				test123();
				System.out.println("执行完毕");
			}catch(Exception e1){
//				e1.printStackTrace();
				System.out.println(e1.getMessage());
			}
			// TODO: handle exception
		}
	}

	private static void test123()
	{
//		for(double i=0.0;i<1000000000.0; i++){}
		// TODO Auto-generated method stub
		int j=1/0;
	}
}
