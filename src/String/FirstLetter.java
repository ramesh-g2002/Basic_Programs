
package String;

public class FirstLetter {
public static void main(String[] args) {
	String s="hello how are you";
	String f=fcap(s);
	System.out.println(f);
}

private static String fcap(String s) {
	char[] ch=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(i==0&ch[i]!=' '||ch[i]!=0&&ch[i-1]==' ')
		{
			if(ch[i]>='a'&&ch[i]<'z')
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		else if(ch[i]>='A'&&ch[i]<'Z')
		{
			ch[i]=(char)(ch[i]+32);
		}
	}
	// TODO Auto-generated method stub
	s=new String(ch);
	return s;
}
}
