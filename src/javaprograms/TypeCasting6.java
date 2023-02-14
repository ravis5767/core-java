package javaprograms;

class TypeCasting6 {
 public static void main(String[] args) {
	byte b=2;
	// widening implicitly
	short s=b;
	int i=b;
	long l=b;
	float f=b;
	double by=b;
	System.out.println("***************************WIDENING************************");
	System.out.println("the converted value to short is :"+s);
	System.out.println("the converted value to interger is :"+i);
	System.out.println("the converted value to long is :"+l);
	System.out.println("the converted value to float is :"+f);
	System.out.println("the converted value to double is :"+by);
	System.out.println("************************************************************");
	
	double x=-100.23;
	//narrowing (ewxplicitly with thne help of type cast operator)
	byte c=(byte)x;
	short sho=(short)x;
	int in=(int)x;
	long lg=(long)x;
	float fl=(float)x;
	System.out.println("************************NARROWING********************************");
	System.out.println("the converted value to BYTE is :"+c);
	System.out.println("the converted value to short is :"+sho);
	System.out.println("the converted value to integer is :"+in);
	System.out.println("the converted value to long is :"+lg);
	System.out.println("the converted value to FLOAT is :"+fl);
	System.out.println("************************************************************");
}
}
