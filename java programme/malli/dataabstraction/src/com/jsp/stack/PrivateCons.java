package com.jsp.stack;

class N
{
int i=10;
static int count=0;
private N() 
{
	i++;
	count++;
	System.out.println("constructor executed");
}
public static N getInstance()
{
	N n=new N();
	return n;
}
public void display()
{
	System.out.println(i);
}
}
public class PrivateCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	N	n=N.getInstance();
	N	n1=N.getInstance();
	N	n2=N.getInstance();
	System.out.println(n);
	System.out.println(n1);
	System.out.println(n2);
	n.display();
	n1.display();
	n2.display();
	
	}

}
