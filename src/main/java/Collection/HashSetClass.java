package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass 
{

	public static void main(String[] args) 
	{
		Set<Integer> hashset1=new HashSet<Integer>();
		hashset1.add(10);
		hashset1.add(30);
		hashset1.add(140);
		hashset1.add(5);
		hashset1.add(90);
		hashset1.add(20);
		
		System.out.println(hashset1);
		
		System.out.println(hashset1.size());	//6
		
		for (Integer xyz : hashset1) 
		{
			System.out.println(xyz);
		}

	}
}

//random order madhe o/p yetaa  :-  [20, 5, 10, 90, 140, 30]

//for loop work naahi hot aani get method pan naste set madhe..foreach use kelaay so