package Array;

import java.util.Arrays;

public class zigzag {
	public static void main(String[] args) {
		int[] a= {2,35,4,75};
		int[] b= {39,3,64,5};
		int[] merge=iszigzag(a,b);
		System.out.println(Arrays.toString(merge));
		}

	private static int[] iszigzag(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int[] c=new int[a.length+b.length];
		int i=0,k=0;
		while(i<a.length&&i<b.length)
		{
			c[k]=a[i];
			k++;
			c[k]=b[i];
			i++;
			k++;
		}
		//(i<a.length)
		return c;
	}
}
