package javaprograms;

import java.util.Scanner;

class GreatestOf3NumConditional 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1 : ");
		int num1=sc.nextInt();
		System.out.println("Enter the number 2 : ");
		int num2=sc.nextInt();
		System.out.println("Enter the number 3 : ");
		int num3=sc.nextInt();
		sc.close();
		
		System.out.println("the largest number is : "+largestNumber(num1,num2,num3));
	}
	public static int largestNumber(int num1,int num2,int num3)
	{
		int temp=num1>num2? num1:num2; //conditional operator
		int res=num3>temp? num3:temp;
		return res;
	}

}
