package javaprograms;

class ProgramNonStaticChaining 
{
		public void search() // non static method
		{
			System.out.println("hi heloo from search.....");
		}
		public void temple()
		{
			search();
			System.out.println("hi hello from temple.....");
		}
		public void run()
		{
			temple();
			System.out.println("hii hello from run");
		}
		public void syntax()
		{
			run();
			System.out.println("hii hrello from syntax");
		}
		public void clear()
		{
			syntax();
			System.out.println("hi hello from clear.....");
		}
		public static void main(String[] args) {
			ProgramNonStaticChaining pnsc = new ProgramNonStaticChaining();
			pnsc.clear(); //method call statement
		}
	
}
