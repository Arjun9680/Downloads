package com.jsp.stack;

import java.util.Scanner;

class Theatre
{
	private static Theatre t=null;
	int seats =50;
	private Theatre()
	{
	 	
		 
	}
	public static Theatre getInstance()
	{
		if(t = null)
		t=new Theatre();
		return t;
	}
	public void reverseSeats(int seatsNum)
	{
		if(seatsNum>seats)
		{
			System.out.println(seatsNum+"seats are not available");
			System.out.println(seats+"seats are available");
		
		}
		System.out.println(seatsNum+"seats are available");
		System.out.println(seatsNum+"seats are booked");
		seats=seats-seatsNum;
		System.out.println(seats+"seats are available");
	}
}
class BookingApp {
	public void bookTickets()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("how many tickets");
		int seatsNum=scn.nextInt();
		Theatre a=Theatre.getInstance();
		a.reverseSeats(seatsNum);

	}
}
public class SingleTon {

	public static void main(String[] args) 
	{
	BookingApp c=new BookingApp();
     c.bookTickets();
	BookingApp c1=new BookingApp();
	c1.bookTickets();
	BookingApp c2=new BookingApp();
	c2.bookTickets();


	}

}
