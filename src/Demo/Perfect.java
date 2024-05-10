package Demo;

import java.util.Scanner;

public class Perfect {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		boolean rs=isperfect(i);
		if(rs)
		{
			System.out.println(i);
		}
	}
	
	
}

private static boolean isperfect(int n) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int i=1;i<=n/2;i++)
	{
		if(n%i==0)
		{
			sum+=i;
		}
			
		
	}
	return sum==n;
}
}
