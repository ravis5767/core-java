package localVariablesAndGlobalVariables;

class LocalStaticVariable 
{
   static int a; //Static variable
   public static void main(String[] args) {
	int a=10; //local variable
	System.out.println("the value of a is :"+a);
	System.out.println(LocalStaticVariable.a);
}
}
