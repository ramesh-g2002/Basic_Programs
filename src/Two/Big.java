package Two;

import java.util.Scanner;

public class Big {
	
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
		int big=isbig(mat);
		int small=issmall(mat);
		
		System.out.println("big:"+big);
		System.out.println("small:"+small);
	}

	private static int issmall(int[][] mat) {
		// TODO Auto-generated method stub
		int big=mat[0][0];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]<big)
				{
					big=mat[i][j];
				}
			}
		}
		return big;
	}

	private static int isbig(int[][] mat) {
		// TODO Auto-generated method stub
		int small=mat[0][0];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]>small)
				{
					small=mat[i][j];
				}
			}
		}
		return small;
	}




	}

