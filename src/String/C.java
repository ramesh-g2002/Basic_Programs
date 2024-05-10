package String;

public class C {
public static void main(String[] args) {
	String s1="raRq!%142RjFH";
	int uc=0,lc=0,dc=0,spc=0;
	for(int i=0;i<s1.length();i++ )
	{
		char ch=s1.charAt(i);
		if(ch>='A'&&ch<='Z')
			uc++;
		else if(ch>='a'&&ch<='z')
			lc++;
		else if(ch>='0'&&ch<'9')
			dc++;
		else
			spc++;
		
	}
	System.out.println("captital:"+uc);
	System.out.println("small:"+lc);
	System.out.println("digit:"+dc);
	System.out.println("special:"+uc);



}
}
