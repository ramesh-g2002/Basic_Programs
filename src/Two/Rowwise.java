package Two;

public class Rowwise {
public static void main(String[] args) {
	int[][] a= {{1,3,4},{7,3 ,2},{2,8,6}};
	int sum=0;
	/*for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+",");
			sum+=a[i][j];
		}
		System.out.println("sum:"+(i+1)+":"+sum);
		
	}*/
	for(int i=0;i<a[0].length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[i][j]+",");
			sum+=a[j][i];
		}
		System.out.println("sum:"+(i+1)+":"+sum);
	}
}
}
