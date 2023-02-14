package javaprograms;

class StringClassEx {
	public static void main(String[] args) {
		String s="Karthik";  //string 1
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(6));
		
		String s1="Java is a programming language..";  //string 2
		System.out.println(s1.charAt(0));
		String st=s1.replace("Java", "Python");
		System.out.println("original String is :"+s1);
		System.out.println("The replaced String is : "+st);
	}

}
