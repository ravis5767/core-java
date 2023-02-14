package javaprograms;

public class PrePostOperators {
  public static void main(String[] args) {
	int x= 103;
	int res= x-- + --x + ++x + --x + x++ + --x;
	System.out.println(res);
}
}
