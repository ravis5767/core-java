package javaprograms;
/* XYLEM==> SUM OF EXTREMES = SUM OF MEANS 
  PHOLEM ==> SUM OF EXTREMES != SUM OF MEANS
     LIKE NUM 1234   1AND 4 ARE EXTREMES AND 2 AND 3 THE MID ONES ARE MEANS 
    THIER SUM 1+4=5 & 3+2=5 THEREFORE ITS A XYLEM NUMBER */

import java.util.Scanner;

class XylemPholemNumber {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");    
		int num=sc.nextInt();
		
		xylem(num);  //method call statement
	}

	public static void xylem(int num) {
		// TODO Auto-generated method stub
		int n=num;
		int exsum=0;
		int meansum=0;
		while(n!=0)
		{
			if(n==num || n<10)
			{
				exsum=exsum+n%10;  //sum of extrems
			}
			else
			{
				meansum=meansum +n%10;  //sum of means
			}
			n=n/10;  //change the positions of the numbers
		}
		if(exsum==meansum)
		{
			System.out.println("The number is xylem number...");
		}
		else
		{
			System.out.println("The number is a pholem number...");
		}
	}

}
