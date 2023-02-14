package com.java.upcasting;
class Age
{
	void AgeLimit() {
		System.out.println("Attain age of 16");
		System.out.println(" === === === === ===");
	}
}
class Vehicle extends Age
{
	void Drive()
	{
		System.out.println("should know to drive light vehicles");
		System.out.println(" === === === === ===");
	}
}
class Test extends Vehicle
{
	void DrivingTest()
	{
		System.out.println("Apply for driving test");
		System.out.println("get the liscense");
		System.out.println(" === === === === ===");
	}
}
class DrivingLiscense
{
	void age(Age a)
	{
		a.AgeLimit();
	}
	void next(Vehicle car)
	{
		car.AgeLimit();
		car.Drive();
	}
	void getLiscense(Test t)
	{
		t.AgeLimit();
		t.AgeLimit();
		t.DrivingTest();
	}
}
public class Liscense 
{
   public static void main(String[] args) 
   {
	DrivingLiscense dl=new DrivingLiscense();
	dl.age(new Age());
	dl.age(new Vehicle());
	dl.next(new Vehicle());
	dl.age(new Test());
	dl.next(new Test());
	dl.getLiscense(new Test());	
}
}
