package Super;

public class Test3 
{
	int a=30;
	
	static int c=50;
	
	Test3()
	{
		super();		//kaahi print honaar naahi run kelyavr but runtime la menas ctrl+hover+click kelyavr it points to object class
		System.out.println("Test3 constr");
	}
	
	public void mymethod()
	{
		System.out.println("Test3 method");
	}
	
	public void testmethod()
	{
		System.out.println(Test3.c);
		Test3.c=60;
		System.out.println("Test3 testmethod");
	}
}
