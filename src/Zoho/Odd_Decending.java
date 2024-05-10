package Zoho;

import java.util.Arrays;

public class Odd_Decending {
public static void main(String[] args)
{
	int[] a= {1,2,3,4,5,6,7,8,9};
	for(int i=a.length-1;i>=0;i--)
	{
		
		if(a[i]%2==1)
		{
		
		System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		
		//System.out.println(Arrays.toString(a));
		for(int j=0;j<a.length;j++)
		{
			if(a[j]%2==0)
			{
				System.out.print(a[j]+" ");
			}
		}

	}
	/*Arrays.sort(a);
	
			System.out.println(Arrays.toString(a));
			for(int j=0;j<a.length;j++)
			{
				if(a[j]%2==0)
				{
					System.out.print(a[j]+" ");
				}
			}
	
	*/
}
	
}
