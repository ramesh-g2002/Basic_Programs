package Patterns;

import java.util.Scanner;

public class A9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j<=n;j++)
			{
				System.out.print(x+" ");
				x++;
				
			}
			System.out.println( );
			
		}
	}
}
