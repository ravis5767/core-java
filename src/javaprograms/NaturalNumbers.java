package javaprograms;

import java.util.Scanner;

class NaturalNumbers 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		sc.close();
		for (int i=1;i<=num;i++)
		{
			System.out.println(i);
		}
	}

}
