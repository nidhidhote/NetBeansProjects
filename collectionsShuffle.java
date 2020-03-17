
import java.util.*;

class demoCollections {
	public static void main (String[] args) {
	//ArrayList
	List<String>l1=new ArrayList<String>();
	l1.add("1");
	l1.add("2");
	l1.add("3");
	l1.add("1");
	l1.add("1");
	l1.add("1");
	System.out.println("Original List: "+l1);
	
	Collections.shuffle(l1);
	
	System.out.println("Shuffled List: "+l1);
	
	
	}
}
/*Original List: [1, 2, 3, 1, 1, 1]
Shuffled List: [1, 1, 1, 3, 2, 1]
