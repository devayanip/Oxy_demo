package com.org.Test1;

public class Class1 
{
	int a=10;
	
	static int b=20;
	
	public static void main(String[] args) 
	{
		System.out.println("main");
		
		Class1.method2();       //static method call
		System.out.println(Class1.b);       //static var call
		
		Class1 c=new Class1();
		System.out.println(c.a);	   //non-static var
		c.method1();		//non-static method
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
