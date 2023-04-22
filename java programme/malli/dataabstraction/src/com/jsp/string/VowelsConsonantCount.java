package com.jsp.string;

public class VowelsConsonantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Brahmanandam";
int vowelscount=0;
int consonantcount=0;
String vowels="aeiouAEIOU";
for(int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	if(vowels.contains(ch+""))
		vowelscount++;
	else
	consonantcount++;
}
System.out.println(vowelscount);
System.out.println(consonantcount);
	}

}
