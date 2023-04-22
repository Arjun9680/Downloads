package com.jsp.stack;
class A2
{
	private A2()
	{
		System.out.println("constructor executed");
	}
	public static A2 getInstance()
	{
		return new  A2();
	}
}
public class Private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A2 a=A2.getInstance();
A2 a1=A2.getInstance();
A2 a2=A2.getInstance();
System.out.println(a);
System.out.println(a1);
	}

}
