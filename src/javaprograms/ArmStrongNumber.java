package javaprograms;
// Armstrong num==> sum of digits raised to the power of 3 = number itself

class ArmStrongNumber 
{
   public static void main(String[] args) 
   {
	int i=100;  //Initialisation
	System.out.println("Armstrong number between 100 to 1000 are :  ");
	int arm;
	while(i<1000)  //condition
	{
		arm=armStrongNumber(i);  //method call statement
		if(arm==i)  // condition
		{
			System.out.println(i);
		}
		i++;
	}
}
public static int armStrongNumber(int num) 
{
	int x=0;
	int a=0;
	while (num!=0)
	{
		x=num%10;
		a=a+(x*x*x);
		num=num/10;
	}
	return a;
}
}
