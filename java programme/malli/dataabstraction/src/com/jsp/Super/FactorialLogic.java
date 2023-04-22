package com.jsp.Super;

import java.util.Scanner;

class Factorial
{
	private int  num;
	public int getNum()
	{
		return num;
	}
	public void setNum(int num)
	{
		this.num=num;
	}
	public int factor()
	{
		int fact=1;
		for(int i=1;i<=num;i++)
			fact=fact*i;
		return fact;
	}
}
public class FactorialLogic {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter numbers:");
		int num=a.nextInt();
  Factorial b=new Factorial();
  b.setNum(num);
  if(num<0 )
	  System.out.println("no negatives");
  else
	  System.out.println(b.getNum()+"!="+b.factor());
  
}
}