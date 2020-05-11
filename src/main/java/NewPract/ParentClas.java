package NewPract;

public class ParentClas 
{
	int a;
	String s;
	
	public ParentClas()
	{
		System.out.println("Parent constructer");
	}
	
	public void method()
	{
		System.out.println("parent method");
	}
	
	public ParentClas(int b,String p)
	{
		System.out.println("In parameterised constr");
		this.a=b;
		this.s=p;
		
		System.out.println(b);
		System.out.println(p);
	}
}
