package javaprograms;

import java.util.Scanner;

class ForSumEx {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the start range..: " );
	int start =sc.nextInt();
	System.out.println("enter the end range..: ");
	int end =sc.nextInt();
	int sum=0;
			for(int i=start; i<=end; i++)
			{
			  	sum=sum+i;
			  	System.out.println("the sum is..:"+sum);
			}
			System.out.println("the sum is....: "+sum);
}
}
