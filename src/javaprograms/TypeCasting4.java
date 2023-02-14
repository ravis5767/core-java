package javaprograms;
//narrowing
class TypeCasting4 
{
   public static void main(String[] args) {
	double d= 123.44;
	System.out.println("the double type data  is :"+d);
	
	// long l=d; //implicitly the narrowing cannot done
	
	long l= (long)d; // widening done explicitly using a typecast operator (long)
	System.out.println("the converted vaalue is :"+l);
}
}
