package com.jsp.stack;

class R 
{
	int i;
	int j;
	public R(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString() {
		return "R [i=" + this.i + ", j=" + this.j + "]";
	}
	
} 
class V extends R
{
	int i;
	int j;
	
	public V(int i,int j)
	{
	     super(i,j);
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString() {
		return "V [i=" + this.i + ", j=" + this.j + "]";
	}
	
}
public class Demo97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
V v=new V(10,20);
System.out.println(v.i);
System.out.println(v.j);
System.out.println(v);
	}

}
