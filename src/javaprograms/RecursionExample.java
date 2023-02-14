package javaprograms;

class RecursionExample {
 public static void print(int n) // static parameterised method
 {
	 System.out.println(n);
	 print(n); //method call statement // recursion
 }
 public static void main(String[] args) {
	print(10); //call the parameterized method //method call statement
}
}
