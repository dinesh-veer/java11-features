package com.dinesh.patternChanges;

import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {

		// asMatchPredicate():- This method is similar to Java 8 method asPredicate().
		// Introduced in JDK 11, this method will create a predicate if pattern matches
		// with input string.
		var string = Pattern.compile("test").asMatchPredicate();

		System.out.println(string.test("test"));
		// Output
		// true

		System.out.println(string.test("test111"));
		// Output
		// false

	}

}
