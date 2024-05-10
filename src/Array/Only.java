package Array;

import java.util.HashSet;
import java.util.Set;

public class Only {
public static void main(String[] args) {
	int[] numbers= {1,2,3,1,3,4,5};
	Set<Integer> unique=new HashSet<Integer>();
	Set<Integer> duplicate=new HashSet<Integer>();
	for(int number:numbers)
	{
		if(!unique.add(number))
		{
			duplicate.add(number);
			
		}
	}
	System.out.println(duplicate);
	
}
}
