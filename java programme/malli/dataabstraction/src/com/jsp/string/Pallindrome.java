package com.jsp.string;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="malayalam";
for(int i=0;i<s.length()-1;i++)
{
	for(int j=i+1;j<s.length();i++)
	{
		if(isPallindrome(s,i,j)) {
			System.out.println(s.substring(i,j+1));
		}
	}
}

}
static boolean isPallindrome(String s,int start,int end)
{
	int i=start;int j=end;
	while(i<j)
	{
		if(s.charAt(i)!=s.charAt(j)) return false;
		i++;
		j--;
	}
	return true;

	}

}
