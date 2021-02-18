package com.jason.myjavatrips;

public abstract class ExtendClassTest {

	abstract void myTest();
	void myTestFather()  {
		System.out.println("father class...");
	}
	
	private void myPrivateTest() {
		System.out.println("TestExtendClass result...");
	}
}

class ChildClass extends ExtendClassTest{
	@Override
	void myTest() {
		System.out.println("children myTest...");
	}
	
	@Override
	void myTestFather() {
		System.out.println("children myTestFather...");
	}
	
	private void myPrivateTest() {
		System.out.println("TestExtendClass result...");
	}
	
	public static void main(String[] args) {
		ExtendClassTest childClass = new ChildClass();
		childClass.myTestFather();
	}
}
