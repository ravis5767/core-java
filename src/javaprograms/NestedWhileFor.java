package javaprograms;

class NestedWhileFor 
{
  public static void main(String[] args)
{
	int weeks=5; //initialisation
	int days=7; 
	int i=1; // initialisation
	while(i<=weeks)// condition//weeks
	{
		System.out.println("the week is ..: "+i);
		for(int k=i; k<=days;k++) //days
		{
			System.out.println("the day is..: "+k);
		}
		i++;  // updation
	}
}
}
