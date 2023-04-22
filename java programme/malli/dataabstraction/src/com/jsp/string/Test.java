package com.jsp.string;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="kattappa@123";
int alphabet=0;
int number=0;
int symbol=0;
for (int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	if(ch>='A'&& ch<='Z'||ch>='a'&& ch<='z')
		alphabet++;
	else if (ch>='0'&& ch<='9')
	number++;
	else 
		symbol++;
}
System.out.println(alphabet);
System.out.println(number);
System.out.println(symbol);
	}

}
