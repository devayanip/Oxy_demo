package Exception;

public class CompileEx 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("In main");
		CompileEx t=new CompileEx();
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
		
		Thread.sleep(4000);        //compile time exception which can be handled easily..dista te exception before running program
		
		method3();
	}
	
	public void method3()
	{
		System.out.println("method3");
	}
}
