package collection;

import java.util.HashSet;
import java.util.Iterator;

//(1)It is not fixed in size it is growable
//
//(2)It will both homogeneous and heterogeneous elements
//
//(3)Lots of utility methods.

//Set :-
//
//(4)Duplicates are not allowed 
//
//(5)insertion order is not preserved - Random Order

public class HashSetEx {

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add(2323);

		hs.add("Akhila");

		hs.add(3.14f);

		hs.add(true);

		hs.add('c');

		
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}
