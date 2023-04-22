package com.jsp.stack;
class A{
	static void m1()
	{
		System.out.println("hi");
	}
}
class B extends A
{
	static void m1()
	{
		System.out.println("hello");
	}
}
public class Demo0 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//B b=new B();
//b.m1(); // hello
	A a=new B();
	a.m1();//hi
		// A a=new A();
		 // a.m1();//hi
		
	}

}
