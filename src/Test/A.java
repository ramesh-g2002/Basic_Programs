package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class A {
public static void main(String[] args) {
	/*ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(5);
	a.add(6);
	a.add(2);
	a.add(3);
	a.add(2);
	a.add(4);
	Collections.sort(a);*/
	int[] a= {5,6,2,3,2,4};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	int sum=0;
	for(int i=0;i<a.length-1;i++)
	{
	
		sum+=a[i+1]-a[i];//2[0+1]-2[0]->0//,2[1+1]-2[1]=4-2=2//3[2+1]-3[2]=9-6=3//4[3+1]-4[3]=16-12=4
		System.out.print(sum+", ");
	}
	System.out.println(" ");
	System.out.println(sum);
}
}
