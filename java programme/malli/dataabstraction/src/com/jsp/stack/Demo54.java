package com.jsp.stack;

class Human
{
	String name;
	int age;
	String gender;
	public Human(String name,int age,String gender)
	{
		super();
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
class Doctor extends Human
{
	String specialist;
	public Doctor(String name,int age,String gender,String specialist)
	{
		super(name,age,gender);
		this.specialist=specialist;
	}
	@Override
	public String toString() {
		return "Doctor [specialist=" + specialist + "]";
	}
	 
}
public class Demo54 {

	public static void main(String[] args) {
		
		Doctor a=new Doctor("arjun",23,"male","cardio");
System.out.println(a);
	}

}
