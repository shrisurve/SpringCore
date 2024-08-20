package com.springcore.constructInject;
//problem on constructor ambiguity problem 
public class Addition 
{
	private int a;
	private int b;
	
	Addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		
		System.out.println("Integer Constructor");
	}
	Addition(double a,double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		
		System.out.println("Double Constructor");
	}
	Addition(String a,String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("String Constructor");
	}
	
	public void doSum()
	{
		System.out.println("Addition: "+(this.a+this.b));
	}
}
