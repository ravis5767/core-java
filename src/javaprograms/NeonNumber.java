package javaprograms;

import java.util.Scanner;

class NeonNumber 
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int square=n*n; // calculating the square of the numbers
		int sum=0;
		while(square!=0)
		{
			int digit=square%10; //accessing the digits
			sum=sum+digit;  //for adding thew digits
			square=square/10; // shifting the place values
		}
		if(n==sum)
		{
			System.out.println("It is a neon number....");
		}
		else
		{
			System.out.println("It is not a neon number...");
		}
	}
}
