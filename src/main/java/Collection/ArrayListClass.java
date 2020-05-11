package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass 
{
	public static void main(String[] args) 
	{
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(30);
		list1.add(20);
		list1.add(10);
		
		System.out.println(list1);		//will give all values
		
		System.out.println(list1.get(2));	//will give particular index chi value
		
		System.out.println("Length of Arraylist :"+list1.size());
		
		for (int i = 0; i < list1.size(); i++) 
		{
			System.out.println(list1.get(i));
		}
	}	
}


//List haa ek interface aahe..tyacha object naahi banvu shakat..n ArrayList haa ek class aahe
//jasa Webdriver driver=new Chromedriver() karto tasach List<Integer> list1=new ArrayList<Integer>() aahe

//ArrayList duplicate values gheto
