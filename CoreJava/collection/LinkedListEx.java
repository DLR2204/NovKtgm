package collection;

import java.util.LinkedList;

//(1)It is not fixed in size it is growable
//
//(2)It will both homogeneous and heterogeneous elements
//
//(3)Lots of utility methods.

//List :-
//
//(4)Duplicates are allowed 
//
//(5)inserting order is storing

public class LinkedListEx {
	
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add("Akhila");

		ll.add(1);

		ll.add(true);
		
		ll.add(1, "apple");

		ll.add(3.14f);

		ll.add('a');
		
		ll.add("Akhila");

		ll.add(1);

		ll.add(true);
		
		ll.add(1, "apple");

		ll.add(3.14f);

		ll.add('a');


		System.out.println(ll);

		ll.add("SteveJobs");

		System.out.println(ll.get(0));

	}
}
