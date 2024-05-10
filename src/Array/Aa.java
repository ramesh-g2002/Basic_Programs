package Array;

import java.util.ArrayList;
import java.util.List;

public class Aa {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>() ;
	l.add(2);
	l.add(3);
	l.add(5);
	l.add(7);
	List<Integer> n=new ArrayList<Integer>() ;
	n.add(2);
	n.add(3);
	n.add(5);
	n.add(7);
	l=n;
	l.remove(0);
	System.out.println(l.size());
	System.out.println(n.size());
	
	
	
}
}
