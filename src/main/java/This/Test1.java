package This;

public class Test1 
{
	int x=10;
	
	public Test1()
	{
		this(10);			//constructer call
		System.out.println(this.x);		//var call
		this.football();			//method call
		System.out.println("Test1");
	}
	
	public Test1(int a)
	{
		System.out.println("2nd constructer");
	}
	
	public void football()
	{
		System.out.println("football");
		baseball();                    //asa pan call karta yeta..or this.basebal() pan karu shakto
	}
	
	public void baseball()
	{
		System.out.println("baseball");
	}
}
