package com.jsp.string;

public class Sum {
public static void main(String[] args)
{
reverse(12345);
}
static void reverse(int n)
{
	if(n<10) { System.out.println(n);
		return ;
	}
		else 
		{
			System.out.print (n%10);
			 reverse(n/10);
		}
	
}
}
