package String;

public class Swap {
	public static void main(String[] args) {
		String s="hello how are you";
		String f=isSwap(s);
		System.out.println(f);
	}

	private static String isSwap(String s) {
		// TODO Auto-generated method stub
		char[] ch=s.toCharArray();
		int f=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				f=i;
			}
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				char t=ch[i];
				ch[i]=ch[f];
				ch[f]=t;
			}
		}
		s=new String(ch);
		return s;
	}
}
