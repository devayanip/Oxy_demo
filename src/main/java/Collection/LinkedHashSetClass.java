package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass 
{
	public static void main(String[] args) 
	{
		Set<Integer> lhashset1=new LinkedHashSet<Integer>();
		lhashset1.add(10);
		lhashset1.add(30);
		lhashset1.add(40);
		lhashset1.add(140);
		lhashset1.add(5);
		lhashset1.add(90);
		
		System.out.println(lhashset1);

		System.out.println(lhashset1.size());		//o/p:-6
		
		for (Integer xyz : lhashset1) 
		{
			System.out.println(xyz);
		}
	}
}


//jasa insert karu tasa o/p yeta  :- [10, 30, 40, 140, 5, 90]