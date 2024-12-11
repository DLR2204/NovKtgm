package collection;

import java.util.Comparator;
import java.util.TreeSet;
//(1)It is not fixed in size it is growable
//
//(2)It will both homogeneous and heterogeneous elements
//
//(3)Lots of utility methods.

//Set :-
//
//(4)Duplicates are not allowed 
//
//(5)insertion order is not preserved - alphbetical order
public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new MyOrder());

		ts.add("orange");

		ts.add("grapes");

		ts.add("apple");

		ts.add("kiwi");

		ts.add("sapota");

		ts.add("custard apple");

		ts.add("pisatcho");

		System.out.println(ts);

	}
}

class MyOrder implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		return -((String) o1).compareTo((String) o2);
	}
	
}
