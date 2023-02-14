package javaprograms;

import java.util.Scanner;

class SpecialCharacter 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch=sc.next().charAt(0);
		sc.close();
		System.out.println("the entered character is : "+ch);
		
		if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z'))
		{
			System.out.println("The entered character is an alphabet...");
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println("The entered character is a number");
		}
		else
		{
			System.out.println("enterd character is a special character");
		}
	}

}
