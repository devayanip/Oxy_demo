package NewPract;

public class MainClas 
{
	public static void main(String[] args) 
	{
		/*ParentClas par=new ParentClas();
		par.method();*/
		
		/*ParentClas par=new ParentClas(50,"hey");
		par.method();*/

		ParentClas par1=new ChildClas();
		par1.method();
		
		
		ChildClas c= new ChildClas();			
	}
}
