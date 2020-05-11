package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListClass 
{
	public static void main(String[] args) 
	{
		List<Integer> list1ink=new LinkedList<Integer>();
		list1ink.add(10);
		list1ink.add(20);
		list1ink.add(10);
		list1ink.add(40);
		list1ink.add(10);
		
		System.out.println(list1ink);		//will give all values
		
		System.out.println(list1ink.get(2));	//will give particular index chi value
		
		System.out.println("Length of Linkedlist :"+list1ink.size());
		
		for (int i = 0; i < list1ink.size(); i++) 
		{
			System.out.println(list1ink.get(i));
		}
		
	}	
}
