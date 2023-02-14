package javaprograms;

class NestedLoop 
{
	public static void main(String[] args) {
		int weeks=3;
		int days=7;
		for(int i=1; i<=weeks; i++)  //print weeks // outer forLoop
		{
			System.out.println("the week is : "+i);
			for (int j=i;j<=days;j++) //print days // inner for loop
			{
				System.out.println("the day is : "+j);
			}
		}
	}
}  //for each and e very iteration of the outer ForLoop the inner ForLoop will be iterated for
// 7times
