package Array;

public class Char {
public static void main(String[] args) {
	String s="leetcode";
	int[] count=new int[26];
	for(char c:s.toCharArray())
	{
		count[c-'a']++;
	}
	for(int i=0;i<26;i++)
	{
		if(count[i]>0)
		{
			System.out.print((char)(i+'a')+""+count[i]);
		}
	}
	
}
}
