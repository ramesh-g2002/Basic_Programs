package String;

public class count {
public static void main(String[] args) {
	String s="hello how are you";
	int f=isCount(s);
	System.out.println(f);
}

private static int isCount(String s) {
	// TODO Auto-generated method stub
	char[] ch=s.toCharArray();
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			count++;
	}
	return count;
}
}
