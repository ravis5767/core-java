package javaprograms;

import java.util.Scanner;

class SwitchExample 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int game=sc.nextInt();
		switch(game)
		{
		case 1:
		{
		System.out.println("dance.....");
		}
		break;
		case 2:
		{
			System.out.println("jump.....");
			
		}
		break;
		case 3:
		{
			System.out.println("clap....");
		}
		break;
		case 4:
		{
			System.out.println("sing.....");
			
		}
		break;
		case 5:
		{
			System.out.println("study....");
		}
		break;
		default:
		{
			System.out.println("please enter the valid value of game....");
		}
		}
	}

}
