package Array;

public class Replace {
public static void main(String[] args) {
	int[] a= {1,2,3,0,8,2,0,4,2,10};
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==0)
		{
			a[i]=5;
		}
	}
	for(int n:a)
	{
		System.out.print(n+" ");
	}
}
}
