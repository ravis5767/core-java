package javaprograms;

import java.util.Scanner;

class DiamondPattern 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the odd number :");
		int n=sc.nextInt();
		
		int spaces=n/2;
		int stars=1;
		for(int i=1;i<=n;i++)  //rows
		{
			for(int j=1;j<=spaces;j++)  //columns
			{
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2)
			{
				spaces--;
				stars+=2;  //(stars=stars+2)
			}
			else
			{
				spaces++;
				stars-=2;  //(stars=stars-2)
			}
		}
	}

}
