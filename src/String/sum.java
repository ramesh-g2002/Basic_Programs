package String;

public class sum {
public static void main(String[] args) {
	String s1="ram1324";
	int s2=sumOfDigits(s1);
	System.out.println(s2);
}

private static int sumOfDigits(String s1) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int i=0;i<s1.length();i++)
	{
		char ch = s1.charAt(i);
		if(ch>='0'&&ch<='9')
		
		sum=sum+ch-48;
		}
	
	return sum;
}
}
