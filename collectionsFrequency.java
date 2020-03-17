
import java.util.*;

class demoCollections {
	public static void main (String[] args) {
	//ArrayList
	List<String>l1=new ArrayList<String>();
	l1.add("1");
	l1.add("2");
	l1.add("3");
	l1.add("1");
	//Frequency of required element in list
	//op: Frequency: 2
	System.out.println("Frequency: "+Collections.frequency(l1,"1"));
	}
}
