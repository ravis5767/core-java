package javaprograms;

class StringBufferClassEx 
{
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Hello hi");  //string1
		StringBuffer s1=new StringBuffer("Hello hi"); //string 2
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s==s1);  //comparing the references
		System.out.println(s.equals(s1)); //comapre the attributes
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.hashCode()==s1.hashCode());
	}

}
