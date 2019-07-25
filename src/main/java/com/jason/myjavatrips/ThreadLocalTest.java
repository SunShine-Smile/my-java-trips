package com.jason.myjavatrips;

public class ThreadLocalTest extends Thread {
	private ThreadLocalDemo threadLocalDemo;
	public ThreadLocalTest(ThreadLocalDemo threadLocalDemo) {
		this.threadLocalDemo = threadLocalDemo;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "---i:---" + i + "---num:" + threadLocalDemo.getNum());
		}
	}
	
	public static void main(String[] args) {
		ThreadLocalDemo threadLocalDemo = new ThreadLocalDemo();
		ThreadLocalTest threadLocalTest1 = new ThreadLocalTest(threadLocalDemo);
		ThreadLocalTest threadLocalTest2 = new ThreadLocalTest(threadLocalDemo);
		ThreadLocalTest threadLocalTest3 = new ThreadLocalTest(threadLocalDemo);
		threadLocalTest1.start();
		threadLocalTest2.start();
		threadLocalTest3.start();
		
	}
}

class ThreadLocalDemo{
//	public static Integer integer = 0;
	public static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
		protected Integer initialValue() {
			return 0;
		};
	};
	
	public Integer getNum() {
		int count = threadLocal.get() + 1;
		threadLocal.set(count);
		return count;
	}
}
