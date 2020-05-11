package Super;

public class MainClass extends Test2
{
	public static void main(String[] args) 
	{
		/*Test2 m=new Test2();
		m.evening();
		m.afternoon();*/
		
		
		Test2 m=new Test2(20);		//arg given
		m.evening();
		m.afternoon();
		
	}
}

//As we know well that default constructor is provided by compiler automatically if there is no constructor. 
//But, it also adds super() as the first statement.