package javaprograms;

import java.util.Scanner;

class SwappingWithoutTemp 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  value of a :");
		int a=sc.nextInt();
		System.out.println("Enter the valuer of b :");
		int b=sc.nextInt();
		
		System.out.println("The value of a is :"+a);
		System.out.println("the  value of b is "+b);
		
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("!!!!!!!!!!the values after swapping!!!!!!!!!");
		System.out.println("the value of a :"+a);
		System.out.println("the value of b:"+b);
	}

}
