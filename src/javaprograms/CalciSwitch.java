package javaprograms;

import java.util.Scanner;

class CalciSwitch
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter the operator to perform : \n + \n - \n * \n / \n ^");
		char operators=sc.next().charAt(0);
		System.out.println("enter the number 2 : ");
		int num2=sc.nextInt();
		sc.close();
		switch(operators)
		{
		case '+':
		{
			int sum=num1+num2;
			System.out.println("the sum of 2 numbers is : "+sum);
		}
		break;
		case '-':
		{
			int diff=num1-num2;
			System.out.println("the difference of 2 numbers is: "+diff);
		}
		break;
		case '*':
		{
			int  pro=num1*num2;
			System.out.println("the product of 2 numbers is: "+pro);
		}
		break;
		case '/' :
		{
			double quo=num1/num2;
			System.out.println("the division of 2 numbers is: "+quo);
		}
		
		break;
		default :
		{
			System.out.println("Please enter a valiud operator...........");
		}
		}
	}

}
