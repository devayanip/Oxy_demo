package NewPract;

public class ChildClas extends ParentClas
{
	public ChildClas()
	{
		//super()  so parent constr la pan call jaato n both constr gets printed
		System.out.println("Child constructer");
	}
	
	public void method2()
	{
		System.out.println("Child method");
	}
	
	public void method()
	{
		System.out.println("child method");
	}
}
