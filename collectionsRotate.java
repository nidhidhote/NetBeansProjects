
import java.util.*;

class demoCollections {
	public static void main (String[] args) {
	//ArrayList
	List<String>l1=new ArrayList<String>();
	l1.add("1");
	l1.add("2");
	l1.add("3");
	l1.add("1");
	
	System.out.println("Original List: "+l1);
	
	//rotation by 2 unit
    Collections.rotate(l1,2);
    
    //Rotated list
    System.out.println("Rotated List: "+l1);
	}
}
/*op : Original List: [1, 2, 3, 1]
       Rotated List: [3, 1, 1, 2]*/
