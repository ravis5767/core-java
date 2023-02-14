package com.java.upcasting;
class Android6
{
	void graphics()
	{
		System.out.println("can't play high graphics gaames..!");
	}
}
class Android9 extends Android6
{
	void space()
	{
		System.out.println("space is more...");
	}
}
class Android10 extends Android9
{
	int ram=8;
	void camera()
	{
		System.out.println("have multiple camera functions...");
	}
}
public class MainClass 
{
	public static void main(String[]args)
	{
		Android9 a10=new Android10();
		a10.graphics();
		a10.space();
		Android9 a9=a10;
		a9.graphics();
		a9.space();
		Android6 a6=a9;
		a6.graphics();
	}
}
//upcasting example
