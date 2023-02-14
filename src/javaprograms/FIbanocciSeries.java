package javaprograms;

import java.util.Scanner;

class FIbanocciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter trhe number :");
		int number=sc.nextInt();
		sc.close();
		int n1=0;
		int n2=1;
		if(number==1)
			System.out.println(n1);
		else if(number==2)
			System.out.println(n1+" "+n2);
		else
			System.out.println(n1);
		System.out.println(n2);
		for(int i=1;i<=number;i++)
		{
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
	}

}
