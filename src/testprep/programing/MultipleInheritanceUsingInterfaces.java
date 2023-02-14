package testprep.programing;
interface ManualTesting
{
	void testing();
}
interface Java
{
	void coding();
}
interface SQL
{
	void quries();
}
public class MultipleInheritanceUsingInterfaces implements ManualTesting,Java,SQL
 {
	public void quries() {
		System.out.println("sql implemented");		
	}
	public void coding() {
		System.out.println("JAva implemented");		
	}
	public void testing() {
		System.out.println("Testng also implementd");		
	}
}
