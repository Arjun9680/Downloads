package com.jsp.stack;

class AA{
	int n=10;
	static final int p=34;
	public void m1()
	{
		System.out.println("methods of A class");
	}
}
class BB extends AA
{
	
	public void m1()
	{
		System.out.println("methods of B class");
		super.m1();
		System.out.println(super.n);
		System.out.println(super.p);
	}
	public void m1(int i)
	{
		super.m1();
		System.out.println("method of c class");
	}
}
public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BB b=new BB();
b.m1();
	}

}
