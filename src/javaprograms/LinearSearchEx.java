package javaprograms;

class LinearSearchEx 
{
	public static int linearSearch(int[]arr,int x)
	{
		for(int i=0;i<arr.length;i++)  //transversing along an array
		{
			if(x==arr[i])
			{
				return i;  //returning index
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]arr= {3,46,76,4,89,7,27};
		System.out.println(linearSearch(arr, 4 ));
		System.out.println(linearSearch(arr, 79));
	}
}
