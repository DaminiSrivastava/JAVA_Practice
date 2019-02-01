package Simple_program;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayList_LinkedList_VectorList {

	public static void main(String[] args) {
	/*LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Damini");
		list1.add("Srivastava");
		list1.removeFirst();
		//Traversing list through Iterator  
		Iterator Itr = list1.iterator();
		while(Itr.hasNext())
		System.out.println(Itr.next());*/
		
		//Vector
		Vector<String> v = new Vector<String>();
		v.add("Damini");
		v.add("Damini");
		Iterator it = v.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		
	}
	
	
	
}
	
}