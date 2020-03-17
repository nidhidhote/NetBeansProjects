
import java.util.*;
import java.util.Collections;
class demoCollections {
	public static void main (String[] args) {
	//ArrayList
	List<String>l1=new ArrayList<String>();
	l1.add("1");
	l1.add("2");
	l1.add("3");
	l1.add("4");
	l1.add("5");
	l1.add("10");
	
	int position;
	
	position=Collections.binarySearch(l1,"5");
	
	System.out.println("Element found at index: "+position);
	
	position=Collections.binarySearch(l1,"6");
	//According to the given list 6 will be at position 6 so -6-1 i.e. -7 is the position
	System.out.println("Element found at index: "+position);
	
	
	}
}
/*Element found at index: 4
Element found at index: -7
*/
