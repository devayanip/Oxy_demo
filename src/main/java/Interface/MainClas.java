package Interface;

public class MainClas extends AbstractClas implements InterfaceA 
{
	public static void main(String[] args) 
	{
		MainClas m=new MainClas();
		m.method1();
		m.mymethod();
		m.abstractmethod();
		m.normalmethod();
		AbstractClas.statmethod();			//static method
		m.method2();
	}

	public void mymethod()						//simple method from MainClas
	{
		System.out.println("class method");
	}
	
	public void method1() 						//method implemented from interface
	{
		System.out.println("method1 from interfaceA implemented in class");	
	}

	@Override
	public void abstractmethod() 				//method extended(implemented) from abstract class
	{
		System.out.println("abstract method implemented");
	}

	public void normalmethod()					//overrided method from abstract class
	{
		System.out.println("overridden full method");
	}
	
	public static void statmethod()
	{
		System.out.println("static in main method");
	}

	public void method2() 
	{
		System.out.println("interfaceB method");
	}
}
