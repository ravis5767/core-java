package com.java.upcasting;
class SystemUI
{
	void operatingSystem()
	{
		System.out.println("have predefined android operatingSystem");
	}
}
class Oppo extends SystemUI
{
	void operatingSystem()
	{
		System.out.println("have funtouch operatingSystem with android");
	}
}
class Xaiomi extends SystemUI
{
	void operatingSystem()
	{
		System.out.println("using MIUI with android");
	}
}
class Realme extends SystemUI
{
	void operatingSystem()
	{
		System.out.println("using realme ui with android");
	}
}
class GooglePixel extends SystemUI
{
	void operatingSystem()
	{
		System.out.println("using stock android");
	}
}
class Mobile
{
	void handset(SystemUI ref)
	{
		ref.operatingSystem();
	}
}
public class Program4 {
public static void main(String[] args) 
{
	Mobile m1=new Mobile();
	m1.handset(new Oppo());
	m1.handset(new Xaiomi());
	m1.handset(new Realme());
	m1.handset(new GooglePixel());
}
}
//runtime polymorphism example
