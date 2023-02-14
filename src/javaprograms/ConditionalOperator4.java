package javaprograms;

class ConditionalOperator4
{ 
	public static void main(String[] args) {
		int x=5;
		int y=4;
		int z=7;
		boolean result=(x>y && x>z || y<z);
		System.out.println(result);
		 boolean result1= (x==y || y==z && x<z);
		 System.out.println(result1);
	}
}
