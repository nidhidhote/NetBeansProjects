
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
	//remove first occurance of 1
	l1.remove("1");
	
	System.out.println("List after removal without using singleton: "+l1);

    //remove all occurance of 1, by uisng singleton method.
    l1.removeAll(Collections.singleton("1"));
    
    System.out.println("List after Singleton Removal: "+l1);
	}
}
/*Original List: [1, 2, 3, 1, 1, 1]
List after removal without using singleton: [2, 3, 1, 1, 1]
List after Singleton Removal: [2, 3]*/
