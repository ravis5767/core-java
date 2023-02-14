package testprep.programing;
interface Program1
{
	boolean res=false;
	final static int b=67;
	void test();
	public abstract void run();
}
class Program2 implements Program1
{
	public void test()
	{
		System.out.println("Test method implemented");
	}
	public void run()
	{
		System.out.println("run metod here");
	}
}

public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Program1.res);
		System.out.println(Program1.b);
		Program2 ref=new Program2();
		ref.run();
		ref.test();

	}

}
