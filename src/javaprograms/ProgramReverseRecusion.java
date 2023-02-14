package javaprograms;
//program to print 10-1 using recursion
class ProgramReverseRecusion {
	public static void reverse(int n,int c)
	{
		System.out.println(n);
		n--;
		c++;
		if (n==0)
		{
			return;
			
		}
		reverse(n,c);
		
	}
	public static void main(String[] args) {
		int n =10; //initialization
		reverse(n,0);
	}

}
