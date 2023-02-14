package javaprograms;

import java.util.Scanner;

class OddNumberRange 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start range :");
		int num1=sc.nextInt();
		System.out.println("Enter the end range :");
		int num2=sc.nextInt();
		sc.close();
		
		System.out.println("***************************");
		int count=0;
		for(int i=num1;i<=num2;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("the count value is: "+count);
	}
}
