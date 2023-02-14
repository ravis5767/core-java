package javaprograms;

import java.util.Scanner;

class DivisibilityBetweenRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Engter the lower range : ");
		int lower=sc.nextInt();
		System.out.println("Enter the higher range : ");
		int higher =sc.nextInt();
		sc.close();
		
		System.out.println("the numbers are :");
		for(int i=lower;i<=higher;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
	}

}
