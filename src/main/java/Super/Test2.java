package Super;

public class Test2 extends Test1
{
	int y=50;
	
	public Test2()
	{
		super();										//1
		System.out.println("test2 constructer");
		super.morning();								//2
		//super(10)				Constructor call must be the first statement in a constructor,error yete
	}
	
	public Test2(int a)
	{
		super(a);
		System.out.println(super.x);
		System.out.println(y);
		System.out.println("Test2");
	}
	
	public void evening()
	{
		super.morning();
		System.out.println("eve");
		super.night();
	}
	
	public void afternoon()
	{
		super.night();
		System.out.println("afternoon");
	}
}


//1-constructer madhe first stmnt should be super()..by default te stmnt asta..apan explicitly naahi dila tari pan
//2-baaki tya nantr parat super use karun variable n method call kela tari chalta
//super baaki kasa pan use kela tari chaalto..jasa morning n ni8 sobat use kelaay or with variable..it does not matter whether 1st stmnt asel ka naahi..only with constructer 1st stmnt should be super()
//but constructor chya veles jar super use karaycha asel..tar super must be the first statement
//1-if u want to call parent class constructer then super should be first stmnt in childclass constructer