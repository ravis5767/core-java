package javaprograms;

import java.util.Scanner;

class DoWhileLoopsExSum {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Entrter the starting range of number..:");
	int num1=sc.nextInt();
	System.out.println("enter the ending range of the number..:");
	int num2=sc.nextInt();
	sc.close();
	
	int sum=0;
	do
	{
		sum=sum+num1;
				num1++;
				System.out.println("the sum is ..: "+sum);
	}
	while(num1<=num2);
	System.out.println("the sum is.........: "+sum);
}
}
