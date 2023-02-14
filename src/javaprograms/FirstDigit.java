package javaprograms;

import java.util.Scanner;

class FirstDigit {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=sc.nextInt();
	
	int result=firstNo(num);  //method calling statement
	System.out.println("The First digit of the number is :"+result);
}
  public static int firstNo(int num)
  {
	  int temp=num;
	  while (temp>=10)
	  {
		  temp=temp/10; //access the first digit
	  }
	return temp;
  }
}
