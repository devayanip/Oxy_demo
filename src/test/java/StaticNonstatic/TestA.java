package StaticNonstatic;

public class TestA 
{
	int a=10;
	
	static int b=20;
	
	public static void main(String[] args) 
	{
		System.out.println("main");
		
		TestA.method2();       //static method call
		System.out.println(TestA.b);       //static var call
		
		TestA c=new TestA();
		System.out.println(c.a);	   //non-static var
		c.method1();		//non-static method
		
		TestB.method4();
		System.out.println(TestB.d);
		
		TestB t=new TestB();
		t.method3();
		t.method4();
		System.out.println(t.c);
	}
	
	public void method1()
	{
		System.out.println("method1");
	}

	public static void method2()
	{
		System.out.println("method2");
	}


}
