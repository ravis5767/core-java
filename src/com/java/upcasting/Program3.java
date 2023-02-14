package com.java.upcasting;
class Demo1
{
	char ch='t';
	void character()
	{
		System.out.println("character is displayed");
	}
}
class Demo2 extends Demo1
{
	int num=6985;
	void number()
	{
		System.out.println("count the number");
	}
}
class Demo3 extends Demo2
{
	void task()
	{
		System.out.println("this is task method..");
	}
}
class Demo4 extends Demo3
{
	void upcasting()
	{
		System.out.println("upcasting is done here");
	}
}
public class Program3 
{
	public static void main(String[] args) {
		Demo3 a1=new Demo4();
		System.out.println(a1.ch);
		a1.character();
		a1.number();
		System.out.println(a1.num);
		a1.task();
		Demo3 a2=a1;
		System.out.println(a2.ch);
		a2.character();
		a2.number();
		System.out.println(a2.num);
		a2.task();
		Demo2 a3=a2;
		a3.character();
		System.out.println(a3.ch);
		System.out.println(a3.num);
		a3.number();
		Demo1 a4=a3;
		System.out.println(a4.ch);
		a4.character();
	}
}
