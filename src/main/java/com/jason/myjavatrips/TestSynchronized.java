package com.jason.myjavatrips;
/** 
 * @author Jason
 * @time   2017年7月18日 下午2:39:02 
 */
public class TestSynchronized extends Thread
{

	
	public static void main(String[] args)
	{
		MySynchronized mThread1 = new MySynchronized();
		MySynchronized mThread2 = new MySynchronized();
		Thread thread1 = new Thread(mThread1);
		Thread thread2 = new Thread(mThread2);
		thread1.start();
		thread2.start();
	}
}

class MySynchronized implements Runnable{
	public int a;
	public void run(){
		synchronized (this)
		{
			a++;
			try
			{
				System.out.println("【当前线程】-------"+Thread.currentThread().getName()+"---------a---------"+a);
				Thread.sleep(5000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}