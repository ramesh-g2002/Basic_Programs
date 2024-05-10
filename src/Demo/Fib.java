package Demo;

public class Fib {
public static void main(String[] args) {
	int n=10,a=0,b=1,c=0;
	while(true)
	{
		c=a+b;
		if(c>n)
		
			break;
			System.out.print(" "+c);
			a=b;
			b=c;
		
	}
}
}
