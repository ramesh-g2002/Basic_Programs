package Demo;

public class Prime {
public static void main(String[] args) {
	int n=100;
	for(int i=1;i<=n;i++)
	{
		boolean rs=isPrime(i);
		if(rs)
		System.out.println(i);
	}
}

private static boolean isPrime(int n) {
	// TODO Auto-generated method stub
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
}
}
