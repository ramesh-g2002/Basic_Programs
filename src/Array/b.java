package Array;

public class b {
public static void main(String[] args) {
	int[] a= {0,1,2,3,4,5};
	int[] b= {0,4,7};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
}
