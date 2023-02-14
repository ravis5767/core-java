package testprep.programing;

public class Pallindrone {

	public static void main(String[] args) {
		
		int num =234;
		int rev=0;
		int temp=num;  
		while(num!=0)
		{
			int rem=num%10;  
			rev=(rev*10)+rem; 
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
