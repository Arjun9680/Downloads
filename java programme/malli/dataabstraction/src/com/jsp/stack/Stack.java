package com.jsp.stack;

import java.util.EmptyStackException;

public class Stack 
{
	private Node top=null;
	private Node temp;
	private int pos=0;
	
	public void push(Object e)
	{
//		if(top==null)
//		{
//			temp=new Node(e,null);
//			temp.next=top;
//			top=temp;
//			pos++;
//			return;
//		}
		temp=new Node(e,null);
		temp.next=top;
		top=temp;
		pos++;
	}
	
	public int size()
	{
		return pos;
	}
	
	public boolean isEmpty()
	{
		return size()==0;
	}
	
	public Object pop()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		Object e=top.ele;
		top=top.next;
		pos--;
		return e;
	}
	
	public Object peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		return top.ele;
		
		
	}
	
	public static void main(String[] args) 
	{
		Stack s1 = new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		
		System.out.println(s1.size());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
	}
}
