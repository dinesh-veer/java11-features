package com.dinesh.optionalChanges;

import java.util.Optional;

public class Example {

	public static void main(String[] args) {

		// orElseThrow-- If a value is present, returns the value, otherwise throws
		// NoSuchElementException.
		System.out.println(Optional.of("test").orElseThrow()); // test

		// stream--If a value is present, returns a sequential Stream containing only
		// that value,
		// otherwise returns an empty Stream
		System.out.println(Optional.of("test").stream().count()); // 1

		// or--If a value is present, returns an Optional describing the value, otherwise
		// returns an Optional produced by the supplying function.

		System.out.println(Optional.ofNullable(null).or(() -> Optional.of("fallback")).get());//fallback
		
		
	}

}
