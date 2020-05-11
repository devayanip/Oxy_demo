package com.org.Test1;

public class Mainclas1 extends Abs2
{
	public static void main(String[] args) 
	{
		Mainclas1 m=new Mainclas1();
		m.absmethod();
		m.abs1method();
	}

	@Override
	public void abs1method() 
	{
		System.out.println("abs1");
	}

	@Override
	public void absmethod() 
	{
		System.out.println("abs");
	}
}


//two abstract classes create kele..1st abs class haa 2nd abs class madhe extend kelaa..both are halfly created i.e
//abstract classes..2nd class main class madhe extend kelaa n tyatla methods implement kelya