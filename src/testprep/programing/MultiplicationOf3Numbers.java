package testprep.programing;

import java.util.Scanner;
//program 1
public class MultiplicationOf3Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number :");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd number :");
		int c=sc.nextInt();
		
		int res=a*(b*c);
		System.out.println("The multiplication of three numbers are : "+res);
	}

}
