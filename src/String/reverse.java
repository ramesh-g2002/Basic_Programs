package String;

public class reverse {
	public static void main(String[] args) {
		String s="hello how are you";
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			s2=s.charAt(i)+s2;
		}
		s2.trim();
		System.out.println(s2);
		String[] s1=s.split(" ");
		String s4="";
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
			System.out.println(s1[i].charAt(0));
			s4=s1[i]+" "+s4;
			
		}
		s4.trim();
		System.out.println("reverse:"+s4);
	}
}
