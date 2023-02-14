package javaprograms;

class StringBufferExxxx {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Good Morning");
		s.append(" Guys");   //joining the string
		s.delete(1,3);
		System.out.println(s);
	}

}
