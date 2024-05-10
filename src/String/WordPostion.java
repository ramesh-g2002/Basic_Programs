package String;

import java.util.Iterator;

public class WordPostion {
public static void main(String[] args) {
	String s="hello how are you";
	String[] s1=s.split(" ");
	String s2=" ";
	for(int i=0;i<s1.length;i++)
	{
		s2=s1[i]+" "+s2;
	}
	System.out.println(s2);
	
}
}
