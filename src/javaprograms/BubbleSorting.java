package javaprograms;

public class BubbleSorting 
{
	public static void sorting(int[] a)
	{
		int n=a.length; // length of an array
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i]; //swapping using temporary variable
					a[i]=a[j];
					a[j]=temp;  //swapped
				}
			}
		}
	}
	public static void main(String[] args) {
		int []a= {5,1,6,9,7,2};
		sorting(a); //method call statement
		for(int x:a)  //for each loop
		{
			System.out.println(x);
		}
	}

}
