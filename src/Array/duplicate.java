package Array;

import java.util.HashSet;
import java.util.Set;

public class duplicate {
public static void main(String[] args) {
	int[] a= {1,1,2,3,4,2,3,4};
	Set<Integer> s=new HashSet<Integer>();
	for(int num:a)
	{
		s.add(num);
	}
	for(int num:s)
	{
		System.out.print(num+" ");
	}
	
}
}
