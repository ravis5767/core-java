package javaprograms;
//byte type data to double type data
class TypeCasting1 
{
  public static void main(String[] args) {
	byte a=2; // byte type  data stored in byte type variable a..
	System.out.println("the byte type data is :"+a);
	
	double d=a; //widening (implicit)
	System.out.println("gthe converted data is :"+d);
}
}
