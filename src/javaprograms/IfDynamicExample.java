package javaprograms;

import java.util.Scanner;

class IfDynamicExample 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  //creating an object for the scanner class...
		System.out.println("enter the number 1: ");
		int num1=sc.nextInt();
			System.out.println("enter number 2: ");
			int num2=sc.nextInt();
			sc.close();
			if(num1>num2)
			{
				System.out.println("number1 is greater");
			}
			System.out.println("program ends.....");
	}

}
