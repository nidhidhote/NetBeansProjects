
import java.util.*;

class demoCollections {
	public static void main (String[] args) {
	//ArrayList
	List<String>l1=new ArrayList<String>();
	l1.add("1");
	l1.add("2");
	l1.add("3");
	l1.add("4");
	l1.add("5");
	l1.add("6");
	System.out.println("Original List: "+l1);
	
	Collections.swap(l1,1,3);
	
	System.out.println("List After swapping: "+l1);
	
	
	}
}
/*Original List: [1, 2, 3, 4, 5, 6]
List After swapping: [1, 4, 3, 2, 5, 6]*/
