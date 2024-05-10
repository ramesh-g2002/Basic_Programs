package Demo;

public class Xylem {
public static void main(String[] args) {
	int n=12348;
	String s=isXylem(n);
	System.out.println(s);
}

private static String isXylem(int n) {
	// TODO Auto-generated method stub
	int l=n%10;
	n=n/10;
	int sum=0;
	while(n>9)
	{
		int d=n%10;
		sum+=d;
		n=n/10;
	}
	int es=n+l;
	if(es==sum)
	return "xylem number";
	return "pylem number";
			
}
}
