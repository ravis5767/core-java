package javaprograms;

import java.util.Scanner;

class PrimeInRange 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower range :");
		int num1=sc.nextInt();
		System.out.println("Enter the higher range :");
		int num2=sc.nextInt();
		System.out.println("The prime numbers within range are :");
		
		for(int i=num1;i<=num2;i++)  //series ie range..
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
	}

	private static boolean isPrime(int num) 
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0) 
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
