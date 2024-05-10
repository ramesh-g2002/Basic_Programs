package Zoho;

public class Character {
public static void main(String[] args) {
	String input="b3c615";
	String output="";
	for(int i=0;i<input.length();i++)
	{
		char length=input.charAt(i);
		 String count = String.valueOf(input.charAt(i+1));
		for(int j=0;j<count;j++)
		{
			output+=length;
		}
		
	}
	System.out.println(output);
	
}
}
