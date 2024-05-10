package Array;

public class prime {
public static void main(String[] args) {
	int[] a= {1,3,7,9,22,33,272};
	int count=countprimenumber(a);
	System.out.println(count);
}

private static int countprimenumber(int[] a) {
	// TODO Auto-generated method stub
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		boolean rs=isprime(a[i]);
		if(rs==true)
			count++;
	}
	return count;
}

private static boolean isprime(int n) {
	// TODO Auto-generated method stub
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}
}
