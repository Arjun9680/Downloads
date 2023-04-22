package com.jsp.Super;
class First{
	public First()
	{
		System.out.println("1");
	}
	First(int i)
	{
		System.out.println("first");
	}
}
class Second extends First
{
	public Second()
	{
		System.out.println("2");
	}
	 Second(int i)
	{
		super(10);
		System.out.println("second");
	}
}
class Third extends Second
{
	public Third()
	{
		System.out.println("3");
	}
	 Third(int i)
	{
		super(20);
		System.out.println("three");
	}
}

public class DemoSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
First a=new First(10);
Second b=new Second();
Third c=new Third(30);

	}

}
