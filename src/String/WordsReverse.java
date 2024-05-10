package String;

import java.util.Arrays;

public class WordsReverse {
public static void main(String[] args) {
	String s="Code is best";
	//String[] s1=s.split(" ");
	String s2="";
	for(int i=0;i<s.length();i++)
	{
		s2=s.charAt(i)+s2;
	}
	s2.trim();
	System.out.println(s2);

}
}
