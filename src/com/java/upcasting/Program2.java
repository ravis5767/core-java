package com.java.upcasting;

class CoreJava
{
	void java()
	{
		System.out.println("Learn java basics");
	}
}
class Testing extends CoreJava
{
	void manual()
	{
		System.out.println("learn manual testing concepts..");
	}
}
class Selenium extends Testing
{
	void automation()
	{
		System.out.println("learn uses of selenium tools for testing");
	}
}
class TestEngineer extends Selenium
{
	void testEngineer()
	{
		System.out.println("learn all and become test engineer");
	}
}
public class Program2 
{
	public static void main(String[] args) {
		Selenium se=new TestEngineer();
		se.automation();
		se.manual();
		se.java();
		Testing t=se;
		t.manual();
		t.java();
		CoreJava cj=t;
		cj.java();
		
	}
}
//upcasting example
