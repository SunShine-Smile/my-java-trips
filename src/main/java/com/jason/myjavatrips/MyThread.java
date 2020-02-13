package com.jason.myjavatrips;

public class MyThread
{
	public static void main(String args[])
	{
		TestThread tt1=new TestThread();
		TestThread tt2=new TestThread();
		TestThread tt3=new TestThread();
		
		tt1.setName("窗口1");
		tt2.setName("窗口2");
		tt3.setName("窗口3");
		
		tt1.start();
		tt2.start();
		tt3.start();
	}
}

class TestRunable implements Runnable{
	int ticket = 100;
	public void run()
	{
		while(ticket>0){
			System.out.println(Thread.currentThread().getName()+":卖票"+ticket--);
		}
	}
}

class TestThread extends Thread
{
	static int ticket = 100;

	public void run()
	{
		while (ticket > 0)
		{
			System.out.println(Thread.currentThread().getName() + "售票，票号为："
					+ ticket--);
		}
	}
}