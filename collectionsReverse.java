
import java.util.*;

class demoCollections {
	public static void main (String[] args) {
	//ArrayList
	List<String>l1=new ArrayList<String>();
	l1.add("1");
	l1.add("2");
	l1.add("5");
	l1.add("4");
	l1.add("3");
	l1.add("6");
	System.out.println("Original List: "+l1);
	
	Collections.reverse(l1);
	
	System.out.println("Reverdes List: "+l1);
	
	
	}
}
/*Original List: [1, 2, 5, 4, 3, 6]
Reverdes List: [6, 3, 4, 5, 2, 1]
*/
