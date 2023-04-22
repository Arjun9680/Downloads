package com.jsp.string;

public class Capitals {

	public static void main(String[] args) {
		String s="java is very easy";
		String[] arr=s.split(" ");
				
		String temp=" ";
		for(int i=0;i<arr.length;i++)
		{
		temp +=	arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase()+" ";
					
		}
	}

}
