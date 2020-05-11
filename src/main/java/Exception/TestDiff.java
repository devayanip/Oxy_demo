package Exception;

import java.io.FileNotFoundException;

public class TestDiff {

	public static void main(String[] args) 
	{
		TestDiff td=new TestDiff();
		td.method1();
	}

	public void method1() 
	{
		System.out.println("method1");
		method2();
	}

	public void method2() 
	{
		System.out.println("method2");
		
		/*try 							
		{
			System.out.println("test");   
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("test");
		}   
		catch(Exception e1)
		{
			System.out.println("test");
		}*/
		
		/*try 
		{
			System.out.println("test");
		} 
		finally 
		{
			System.out.println("test");
		}
		finally 
		{
			System.out.println("test");
		}*/
		
		/*try
		{
			System.out.println("test");
		}*/
		
		/*catch (Exception e) 
		{
			System.out.println("test");
		}*/
		
		/*finally 
		{
			System.out.println("test");
		}*/
		
		/*try 										//runnable try-catch
		{
			System.out.println("test");
		} 
		catch (Exception e) 
		{
			System.out.println("test");
		}*/
		
		/*try 
		{
			System.out.println("test");
		} 
		catch (Exception e) 
		{
			System.out.println("test");
		}
		catch (ArithmeticException ae) 
		{
			System.out.println("test");
		}*/
		
		/*try 										//runnable try-catch
		{
			System.out.println("test");
		} 
		finally 
		{
			try
			{
				System.out.println("test1");
			}
			catch (ArithmeticException ae) 
			{
				System.out.println("test2");
			}
		}*/
		
		/*try 										//runnable try-catch
		{
			System.out.println("test");
		} 
		catch(ArithmeticException ae) 
		{
			try
			{
				System.out.println("test1");
			}
			catch (ArithmeticException ae1) 
			{
				System.out.println("test2");
			}
		}*/
		
		
		
		method3();
	}
	
	public void method3()
	{
		System.out.println("method3");
	}
}
