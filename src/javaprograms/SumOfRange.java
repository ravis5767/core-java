package javaprograms;

import java.util.Scanner;

class SumOfRange 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the lower range : ");
	int lower=sc.nextInt();
	System.out.println("enter the higher number : ");
	int higher=sc.nextInt();
	sc.close();
	int sum = 0;
	
	for(int i=lower;i<=higher;i++)
	{
		sum=sum+i;  //finding the sum
		System.out.println(i+" ");  //print the series
	}
	System.out.println("the sum of the series is : "+sum);  //to print the total sum
}
}
