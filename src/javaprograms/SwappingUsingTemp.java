package javaprograms;

import java.util.Scanner;

class SwappingUsingTemp 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num1 : ");
		int num1=sc.nextInt();
		System.out.println("enter the num2");
		int num2=sc.nextInt();
		sc.close();
		
		int empty; //temporary container created to swap the numbers
		System.out.println("the value of num1 is :"+num1);
		System.out.println("the value of num2 is  : "+num2);
		
		empty=num1;
		num1=num2;
		num2=empty;
		System.out.println("*****the values after swapping*****");
		System.out.println("the value  of num1 is : "+num1);
		System.out.println("the value of num2 is : "+num2);
	}

}
