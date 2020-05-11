package NewPract1;

public class ClassB extends ClassA
{
	public void evening() 
	{
		System.out.println("implemented from interface eve");
	}

	@Override
	public void absmethod() 
	{
		System.out.println("abs method");
	}
	
	public void mymethod()
	{
		System.out.println("ClassB mymethod");
	}
}
