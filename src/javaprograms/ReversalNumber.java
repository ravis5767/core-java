package javaprograms;

import java.util.Scanner;

class ReversalNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number :");
		int num=sc.nextInt();
		sc.close();
		System.out.println("**********************************************");
		while(num!=0)
		{
			System.out.print(num%10);
			num=num/10;
		}
	}

}
