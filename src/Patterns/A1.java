package Patterns;

import java.util.Iterator;
import java.util.Scanner;

public class A1 {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print("*"+" ");
		}
		System.out.println( );
		
	}
}
}
