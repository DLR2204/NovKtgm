package collection;

import java.util.LinkedHashSet;

//(1)It is not fixed in size it is growable
//
//(2)It will both homogeneous and heterogeneous elements
//
//(3)Lots of utility methods.

//Set :-
//
//(4)Duplicates are not allowed 
//
//(5)insertion order is preserved
public class LinkedHashSetEx {
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(2323);

		lhs.add("Akhila");

		lhs.add(3.14f);

		lhs.add(true);

		lhs.add('c');

		lhs.add(2323);

		lhs.add("Akhila");

		lhs.add(3.14f);

		lhs.add(true);

		lhs.add('c');

		System.out.println(lhs);
	}

}
