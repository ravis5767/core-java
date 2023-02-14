package javaprograms;

import java.util.Scanner;

class PrimeNumbersEx {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number :");
	int num = sc.nextInt();
	
	int count=0;
	for (int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			count ++ ; //counting the numbers of factors..
		}
	}
	if (count ==2)
	{
		System.out.println("The number is prime numbe4r....");
	}
	else
	{
		System.out.println("The number is composite number...");
	}
}
}
