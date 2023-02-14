package com.java.upcasting;

class UGC
{
	void course()
	{
		System.out.println("provides rule and cirriculum to session");
	}
}
class PrivateCollege extends UGC
{
	void course()
	{
		System.out.println("have to pay more college fees");
	}
}
class GovermentColleges extends UGC
{
	void course()
	{
		System.out.println("Have less fees");
	}
}
class Student
{
	void studies(UGC u1)
	{
		u1.course();
	}
}
public class MinistryOfEducation 
{
 public static void main(String[] args) {
	Student s1=new Student();
	s1.studies(new PrivateCollege());
	s1.studies(new GovermentColleges());
} 
}

//runtime polymorphism example
