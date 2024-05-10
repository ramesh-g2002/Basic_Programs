package String;

import java.util.HashSet;
import java.util.Set;

public class Remove {
public static void main(String[] args) {
	String[] s= {"apple","Banana","apple","cat","car","cat"};
	Set<String> s1=new HashSet<String>();
	for(String name:s)
	{
		s1.add(name);
	}
	System.out.println(s1);
}}
