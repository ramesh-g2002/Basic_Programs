package Two;

import java.util.Scanner;

public class sum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the matrix....");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int[][] mat=new int[row][col];
	System.out.println("enter"+row*col+"elements....");
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
			mat[i][j]=sc.nextInt();
			
		}
	}
	System.out.println("user enter the matrix....");
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
			System.out.print(mat[i][j]+" ");
			
		}
		System.out.println();
	}
	int sum=issum(mat);
	System.out.println("sum:"+sum);
}

private static int issum(int[][] mat) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
			sum+=mat[i][j];
		}
	}
	return sum;
}


}
