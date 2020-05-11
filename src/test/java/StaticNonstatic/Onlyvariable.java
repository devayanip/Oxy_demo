package StaticNonstatic;

public class Onlyvariable 
{
	int a=10;
	
	static int b=20;
	
	public static void main(String[] args) 
	{
		int c=30;
		System.out.println(c);
		
		Onlyvariable ov=new Onlyvariable();
		System.out.println(ov.a);		//10
		ov.a=40;
		System.out.println(ov.a);		//40-val change
		
		Onlyvariable ovnew=new Onlyvariable();		//same class cha new object create kela
		System.out.println(ovnew.a);			// 10-val remains same after creating new object
		//everytime jevhaa new object karnaarn var print karnar tevha each time value default vaali means 10 rahate
		
		
		TestB test=new TestB();
		System.out.println(test.c);
		test.c=100;
		System.out.println(test.c);
		
		System.out.println("-----Static khaalcha-----");
		
		System.out.println(Onlyvariable.b);
		
		Onlyvariable.b=50;
		System.out.println(Onlyvariable.b);       //static-ekdaa var value change kela ki tich val pudhe repeat or continue hote

	}

}
