package com.jsp.string;

public class SubString {

	public static void main(String[] args) 
	{
		String s="welcome";
		for(int i=0;i<s.length();i++)
		{
			int j=i+3;
			if(j<=s.length())
			{
				System.out.println(s.substring(i, j));
			}
		}

	}

}
