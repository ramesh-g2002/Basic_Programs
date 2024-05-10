package Demo;

public class Distrium {
public static void main(String[] args) {
	/*int n=500;
	
	for(int i=1;i<=n;i++)
	{
		boolean rs=isDis(i);
		if(rs)
			System.out.println(i);
	}
}

private static boolean isDis(int n) {
	// TODO Auto-generated method stub
	int dc=digitcount(n);
	int sum=0,temp=n;
	while(n!=0)
	{
		int d=n%10;
		sum+=pow(d,dc);
		n=n/10;
				dc--;
	}
	return sum==temp;
}

private static int pow(int d, int dc) {
	// TODO Auto-generated method stub
	int prod=1;
	while(dc>0)
	{
		prod=prod*d;
		dc--;
	}
	return prod;
}

private static int digitcount(int n) {
	// TODO Auto-generated method stub
	int count=0;
	do
	{
		n=n/10;
		count++;
	}
	while(n!=0);
	
	return count;

}*/
int n=135;
int s=isDistrum(n);

System.out.println(n);


private int isDistrum(int n2) {
	// TODO Auto-generated method stub
	int dc=digit(n2);
	int sum1=0,temp1=n2;
	while(n2!=0)
	{
		int d=n2%10;
		sum1+=power(d,dc);
		n2=n2/10;
	}
	return sum1;
}

private int power(int d, int dc) {
	// TODO Auto-generated method stub
	int prod=1;
	while(dc>0)
	{
		prod*=d;
		dc--;
	}
	return prod;
}

private int digit(int n2) {
	// TODO Auto-generated method stub
	int count=0;
	do
	{
		n2=n2/10;
		count++;
		
	}
	while(n2!=0);
	return count;
}
}