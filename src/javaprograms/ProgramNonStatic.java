package javaprograms;

class ProgramNonStatic 
{
	public void crash() //non static method
	{
		System.out.println("Hi Hello from crash......");
		
	}
	public static void main(String[] args) {
		{
			//crash(); // we cannot call the non static methods without the object reference 
		ProgramNonStatic pns= new ProgramNonStatic(); //instantiation
		pns.crash(); //calling the non static method with the help of object reference
		}
	}

}
