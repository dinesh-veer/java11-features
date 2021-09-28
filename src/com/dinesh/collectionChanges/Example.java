package com.dinesh.collectionChanges;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Example {

	public static void main(String[] args) {

		// List, Set and Map have been extended with new methods. List.of created a new
		// immutable list from the given arguments. List.copyOf creates an immutable
		// copy of the list.

		// List.of returns unmodifiable List object
		// also List.copyOf returns unmodifiable list of object
		var list = List.of("Test", "the", "java 11");
		System.out.println(list.getClass().getName());
		System.out.println(list);
		var copy = List.copyOf(list);
		System.out.println(copy);
		System.out.println(list == copy);// true both are same as pointing to same object

		// copy a mutable list, copy is indeed a new instance so it's  there's
		// no side-effects when mutating the original list:
		var list1 = new ArrayList<String>();
		var copy1 = List.copyOf(list1);
		System.out.println(list1 == copy1); // false
		
		//create map using of method by passing key value as arguments
		var map = Map.of("test",1,"another",2);
		System.out.println(map);
		System.out.println(map.getClass().getCanonicalName());
		//map.put("exception", 333);//UnsupportedOperation exception thrown as ImmutableCollection 
	}

}
