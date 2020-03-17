
import java.util.*;

class demoCollections {
	public static void main (String[] args) {
	//list 1 ArrayList
	List<String>l1=new ArrayList<String>();
	l1.add("1");
	l1.add("2");
	l1.add("3");
	//list2 Stack
	List<String>l2=new Stack<String>();
	l2.add("4");
	l2.add("5");
	l2.add("6");
	//none of the element is common 
	//op will be: Check disjoint: true
	
	System.out.println("Check disjoint: "+Collections.disjoint(l1,l2));
	}
}
