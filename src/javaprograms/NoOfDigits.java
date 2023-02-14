package javaprograms;

import java.util.Scanner;

class NoOfDigits {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=sc.nextInt();
	
	int result=countNo(num);
	System.out.println("the number of digits in a number is :"+result);
}

public static int countNo(int num)  //static parameterised method 
{ 
	int temp=num;
	int count =0;
	while(temp!=0)
	{
		temp=temp/10;
		count++; //to calculate the number of digits
	}
	return count;
}
  
}
