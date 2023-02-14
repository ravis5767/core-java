package javaprograms;

public class StringClassExxx {
	public static void main(String[] args) {
		String s1;
		s1="Hello";  //string1
		String s2;
		s2=new String("Hello");  //string2
		
		System.out.println(s1==s2);  //comparing the refrences
		System.out.println(s1.equals(s2));  //comparing the attributes
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode()==s2.hashCode());
	}

}
