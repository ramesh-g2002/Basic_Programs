package String;

public class a {
public static void main(String[] args) {
	String s1="Ramesh";
	char s2 = s1.charAt(2);
	System.out.println(s2);
	System.out.println("length:"+s1.length());
	System.out.println("index:"+s1.indent(3));
	char[] ch = s1.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		System.out.print(ch[i]+" ");
	}
}
}
