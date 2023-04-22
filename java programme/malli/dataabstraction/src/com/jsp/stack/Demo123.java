package com.jsp.stack;

class L
{
	private static L t;

	private L()
	{
		
	}
	public static L getInstance()
	{
		if(t==null) { t=new L();}
		return t;
	}
}
public class Demo123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 L n =L.getInstance();
 L n1=L.getInstance();
 L n2=L.getInstance();
 System.out.println(n);
 System.out.println(n1);
 System.out.println(n2);
	}

}
