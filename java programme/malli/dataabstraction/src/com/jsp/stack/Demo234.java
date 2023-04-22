package com.jsp.stack;

class Bank
{
	public int rateOfInterest()
	{
		return 20;
	}
}
class Sbi extends Bank
{
	public int rateOfInterest()
	{
		//super.rateOfInterest();
		return 3;
	}
}
class Axis extends Sbi
{

	public int rateOfInterest()
	{
		//super.rateOfInterest();
		return 4;
	}
	
}
class Icici extends Axis
{
	public int rateOfInterest()
	{
		//super.rateOfInterest();
		return 9;
	}
}
public class Demo234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Icici a=new Icici();
System.out.println(a.rateOfInterest());
Axis b=new Axis();
System.out.println(b.rateOfInterest());
	}

}
