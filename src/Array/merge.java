package Array;


import java.util.Arrays;

public class merge {
	public static void main(String[] args) {
		int[] a= {2,3,4,5};
		int[] b= {39,3,4,5};
		int[] merge=ismerge(a,b);
		System.out.println(Arrays.toString(merge));
		}

	private static int[] ismerge(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int[] merge=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			merge[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			merge[i+a.length]=b[i];
		}
		return merge;
	}

	
}
