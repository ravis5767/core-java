package javaprograms;

import java.util.Scanner;

class PerfectNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbver :");
	int num=sc.nextInt();
	
	int sum=1;
	int temp=num; // just for comnp0aring the number with the summation of factor
	              // therefore moving the number into a temporary variable.
	for (int i=2;i<=num/2;i++)
	{
		if(temp%i==0)
		{
			sum=sum+i;  //summing the factors
		}
	}
	if(sum==num)
	{
		System.out.println("The number is prefect number....");
	}
	else
	{
		System.out.println("the number is not perfect number....");
	}
}
}
