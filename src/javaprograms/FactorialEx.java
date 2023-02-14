package javaprograms;

import java.util.Scanner;

class FactorialEx 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		sc.close();
		int fact=1;
		for (int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of the number is :"+fact);
	}
}
