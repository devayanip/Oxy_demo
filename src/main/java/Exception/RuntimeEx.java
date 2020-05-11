package Exception;

public class RuntimeEx 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("In main");
		RuntimeEx t=new RuntimeEx();
		t.method1();
	}
	
	public void method1() throws InterruptedException
	{
		System.out.println("method1");
		method2();
	}

	public void method2() throws InterruptedException
	{
		System.out.println("method2");
		
		try 							//runtime exceptn handled
		{
			System.out.println(100/0);   
		} 
		catch (Exception e) 
		{
			System.out.println("Something went wrong");
		}   
		
		method3();
	}
	
	public void method3()
	{
		System.out.println("method3");
	}
}
