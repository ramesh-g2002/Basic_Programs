package String;

public class LastCaps {
	public static void main(String[] args) {
		String s="hello how are you";
		String f=lcap(s);
		System.out.println(f);
	}

	private static String lcap(String s) {
		// TODO Auto-generated method stub
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==ch.length&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				if(ch[i]<='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
				else if(ch[i]<='A'&&ch[i]<='Z')
				{
					ch[i]=(char)(ch[i]+32);
			}
		}
		s=new String(ch);
		return s;
	}
}
