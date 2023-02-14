package javaprograms;

import java.util.Scanner;

/* sum of factorial of digit= original number  */
class StrongNumber {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number :");
	int num=sc.nextInt();
	if (isStrong(num))
	{
		System.out.println("The number is a strong number .. ");
	}
	else
	{
		System.out.println("The number is not a strong number...");
	}
}
  public static int factorial(int num)  // calculate the factorial
  {
	  if (num==0)
		  return 1;
	  return num*factorial(num-1);
  }

private static boolean isStrong(int num) {
	int temp=num;  // comparing for the further calculation
	int digit=0;
	int sum=0;
	while(temp !=0)
	{
		digit=temp%10;  //individual digits
		sum=sum+factorial(digit);
		temp/=10;
	}
	return sum==num;
}
}
