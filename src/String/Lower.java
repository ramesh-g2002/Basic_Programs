package String;

public class Lower {
public static void main(String[] args) {
	String s="hello RAMESH";
	String s1=ToLower(s);
	System.out.println(s1);
}

private static String ToLower(String s) {
	// TODO Auto-generated method stub
	char[] ch=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='a'&&ch[i]<='z')
			ch[i]=(char) (ch[i]-32);
	}
	s=new String(ch);
	return s;
}
}
