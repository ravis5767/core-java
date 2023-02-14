package com.encapsulation.topic;

class Router 
{
	private String password;
	private String userName;
	public Router(String password,String userName)
	{
		this.password=password;
		this.userName=userName;
	}
	public String getPassword()
	{
		System.out.println("give email and phone number");
		System.out.println("Generate otp");
		return password;
	}
	public String getUsername()
	{
		System.out.println("generate otp");
		System.out.println("give otp to the service provider or technician");
		return userName;
	}
	public void setPass(String pass)
	{
		System.out.println("enter otp");
		password=pass;
		System.out.println("password updated");
	}
	public void setUsername(String uname)
	{
		System.out.println("enter old id");
		System.out.println("enter new username");
		userName=uname;
		System.out.println("Username updated sucessfully");
	}
}
public class InternetRouter
{
	public static void main(String[] args) {
		Router r1=new Router("12@12345","AirtelWifi1_5g");
		System.out.println(r1.getPassword());
		System.out.println(r1.getUsername());
		r1.setPass("RAvi@123");
		r1.setUsername("My Wifi");
		System.out.println(r1.getPassword());
		System.out.println(r1.getUsername());
	}
}
// example for encapsulation....
