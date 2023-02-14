package javaprograms;

import java.util.Scanner;

class PallindromeNumber 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num =sc.nextInt();
		int rev=0;
		int temp=num;  //storing the the number in a temporary variable for further comparing
		while(num!=0)
		{
			int rem=num%10;  //fetrching the individiual numbers
			rev=(rev*10)+rem;  //for shifting the plkace values
			num=num/10;
		}
		System.out.println(rev);
		if (temp==rev)
		{
			System.out.println("It is a pallindrome number..");
		}
		else
		{
			System.out.println("it is not a pallindrome number");
		}
	}

}
