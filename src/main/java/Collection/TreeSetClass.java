package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass 
{
	public static void main(String[] args) 
	{
		Set<Integer> tset1=new TreeSet<Integer>();
		tset1.add(10);
		tset1.add(30);
		tset1.add(40);
		tset1.add(5);
		tset1.add(90);
		
		System.out.println(tset1);
		
		System.out.println(tset1.size());	//5
		
		for (Integer xyz : tset1) 
		{
			System.out.println(xyz);
		}
	}
}

//ascending order madhe insert hotat  :-  [5, 10, 30, 40, 90]
