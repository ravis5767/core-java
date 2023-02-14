package javaprograms;

import java.util.Scanner;

class CalculatePercentage 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sub1 markds  : ");
		double s1=sc.nextDouble();
		System.out.println("enter the marks of sub 2 :");
		double s2=sc.nextDouble();
		System.out.println("enter the marks of sub 3  : ");
		double s3=sc.nextDouble();
		
		double securedMarks=s1+s2+s3;
		double total=300;
		
		double avg=securedMarks/total;
		double percentage=avg*100;
		System.out.println("the average is : "+avg);
		System.out.println("the percentage is : "+percentage);
	}

}
