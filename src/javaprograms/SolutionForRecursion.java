package javaprograms;
//Program to print the values from 1 to 10 using recursion
class SolutionForRecursion {
	public static void print(int n,int c)
	{
		System.out.println(n);
		n++;
		c--;
		if(n==11)
		{
			return; //control transfer statement
		}
		print(n,c); // recursion
	}
	public static void main(String[] args) {
		int n=1; // initialise
		print(n,10);
	}

}
