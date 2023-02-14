package javaprograms;

import java.util.Scanner;

class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		sc.close();
		for(int i=1;i<=10;i++)
		{
			int result=num*i;
			System.out.println(num+" * "+i+" = "+result);
		}
	}

}
