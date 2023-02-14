package javaprograms;

import java.util.Scanner;

class IfElseExample 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numer 1: ");
		int num1=sc.nextInt();
		System.out.println("Enter the number 2 : ");
		int num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("number 1 is greater: ");
		}
		else
		{
			System.out.println("Number 2 is Greater...");
		}
	}

}
