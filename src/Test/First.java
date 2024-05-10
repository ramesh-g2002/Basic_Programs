package Test;

public class First {
public static void main(String[] args) {
	int n=0;
	int j=5;
	int k=-1;
	int sum=0;
	for(int i=0;i<=j;i++)
	{
		sum=sum+n+i;
		System.out.print(sum+", ");
	}
	System.out.println("sum"+sum);
	sum=sum-k;
	System.out.println(sum);
}
}
