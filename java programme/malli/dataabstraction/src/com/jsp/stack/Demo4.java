package com.jsp.stack;

class Q
{
	public Q()
	{
	System.out.println("1");
	}
	public Q(String i) 
	{
		//super("good morning");
		System.out.println("2");
	}
} 
class F extends Q
{
	public F()
	{
		super("gd");
	System.out.println("3");
	}
	public F(String i) 
	{
		super("good morning");
		System.out.println("4");
	}
}
class G extends F
{
	public G()
	{
	System.out.println("5");
	}
	public G(int i,int j) 
	{
		super();
		System.out.println("6");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		
		G g=new G(14,323);
		

	}

}
