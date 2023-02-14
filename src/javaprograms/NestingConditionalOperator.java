package javaprograms;

public class NestingConditionalOperator {
	public static void main(String[] args) {
		int x=59;
		int y=99;
		int z=89;
		int result=(x>y)?((x>y)?x:y):((y>z)?y:z);
		System.out.println(result);
	}

}
