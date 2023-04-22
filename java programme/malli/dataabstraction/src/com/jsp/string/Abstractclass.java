package com.jsp.string;
abstract class A{
	
	public A(int i)
	{
	System.out.println(i);
	}
	public void m1()
	{
		System.out.println("m1 method");
	}
	 public abstract void m2();
	 public abstract void m3();
}
class B extends A 
{

	public B(int i)
	{
     super(14);
     System.out.println("4");
	}
	@Override
	public void m2()
	{
		System.out.println("hi");
	}
	@Override 
	public void m3()
	{
		System.out.println("hello");
	}
	public void m4()
	{
		System.out.println("m4");
	}
}
public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 A a=new B(4);
// System.out.println(a.J);
 //System.out.println(a.i);
// System.out.println(A.i);
//-System.out.println(A.J);
 a.m1();
 a.m2();
 a.m3();
 ((B)a).m4();
	}

}
