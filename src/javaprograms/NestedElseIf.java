package javaprograms;

import java.util.Scanner;

class NestedElseIf 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks=sc.nextInt();
		sc.close();
		
		if (marks<50 && marks>=0) 
		{
			System.out.println("the student failed...");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("student secured C grade...");
		}
		else if(marks>=60 && marks<70)
		{
			System.out.println("student secured D grade...");
		}
		else if(marks>=70 && marks<80)
		{
			System.out.println("student secured B grade...");
		}
		else if(marks>=80 && marks<90)
		{
			System.out.println("student secured A grade...");
		}
		else if(marks>=90 && marks<=100)
		{
			System.out.println("student secured A+ grade...");
		}
		else
		{
			System.out.println("Please enter the valid marks.........");
		}
	}
	

}
