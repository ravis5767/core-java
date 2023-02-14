package javaprograms;

// narrowing
class TypeCasting5 
{
  public static void main(String[] args) {
	float f=23.4f;
	//byte b=f; //caannot be done
	byte b=(byte)f;// explicit
	System.out.println("the value is :"+f);
	System.out.println("the converted value is :"+b);
}
}
