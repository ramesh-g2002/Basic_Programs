package Array;

public class sum {
public static void main(String[] args) {
	int[] a= {3,4,2,6};
	int sum=issum(a);
	System.out.println(sum);
}

private static int issum(int[] a) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum+=a[i];
	}
	return sum;
}
}
