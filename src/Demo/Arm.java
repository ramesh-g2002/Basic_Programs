package Demo;

public class Arm {
public static void main(String[] args) {
	int n=500;
	for(int i=1;i<=n;i++)
	{
		boolean rs=isArm(i);
		if(rs)
			System.out.println(i);
	}
}

private static boolean isArm(int n) {
	// TODO Auto-generated method stub
	int sum=0,temp=n;
	do
	{
		int d=n%10;
		sum+=d*d*d;
		n=n/10;
	}
	while(n!=0);
	if(sum==temp)
		
	return true;
	else
		return false;
}
}
