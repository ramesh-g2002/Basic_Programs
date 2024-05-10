package String;

public class Polindrome {
	public static void main(String[] args) {
		String s="madam";
		boolean f=isPolindrome(s);
		if(f==true)
		System.out.println(f+" is Polindrome");
		else
			System.out.println(f+" is not "
					+ "Polindrome");
	}

	private static boolean isPolindrome(String s) {
		// TODO Auto-generated method stub
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		System.out.println(rev);
		return s.equals(rev);
	}
}
