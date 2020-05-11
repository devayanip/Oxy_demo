package Super;

public class Test4 extends Test3
{
	int b=40;
	
	Test4()
	{
		super();
		System.out.println("Test4 constr");
	}
	
	public void mymethod1()
	{
		super.mymethod();
		System.out.println("Test4 method");
		System.out.println(super.a);
	}
	
	public void testmethod1()
	{
		super.testmethod();
		System.out.println("Test4 testmethod");
	}
}
