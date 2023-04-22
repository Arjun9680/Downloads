package com.jsp.stack;
class AAA
{
	int a=40;
	public void m1() 
	{
		System.out.println("m1 method");
	}
	public void m9(int b)
	{
		System.out.println("m9 method");
	}
}
class BBB extends AAA{
	int b=50;
	public void m3()
	{
		System.out.println("m2 method");
	}
	public void m2(int i)
	{
		System.out.println("m8");
	}
}
public class Demo5 {
public static void main(String[] arg)
{
	  AAA a=new BBB();
	  a.m1();
	 a.m9(90);
	 System.out.println(a.a);
	
	 System.out.println("..........");
	 BBB b=(BBB)a;
	 b.m2(67);
	 b.m3();
	 System.out.println(b.b);
}
}
