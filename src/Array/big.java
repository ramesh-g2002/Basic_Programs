package Array;

public class big {
public static void main(String[] args) {
	int[] a= {3,4,2,6};
	int big=isbig(a);
	System.out.println("big:"+big);
}

private static int isbig(int[] a) {
	// TODO Auto-generated method stub
	int big=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>big)
		{
			big=a[i];
		}
	}
	return big;
}
}
