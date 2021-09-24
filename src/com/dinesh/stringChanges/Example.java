package com.dinesh.stringChanges;

import java.util.stream.Collectors;

/**
 * @author dineshveer
 *
 */
public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// isBlank method
		String string1 = "";
		System.out.println(string1.isBlank());

		String string2 = "Testcontent";
		System.out.println(string2.isBlank());

		// Output:
		// True
		// False

		// lines method to get collection structure to manupulate it
		String lines = "Dinesh\nVeer";
		System.out.println(lines.lines().collect(Collectors.toList()));

		// Output:
		// [Dinesh, Veer]

		// repeat repeats number of times given string

		String sample = "SampleToRepeat";
		System.out.println(sample.repeat(4));

		// output
		// SampleToRepeatSampleToRepeatSampleToRepeatSampleToRepeat

		// stripLeading -- removed leading white spaces
		String str = "   leading spave--";
		System.out.println(str.stripLeading());
		// output:
		// leading spave--

		// stripTraling --removes white spaces from end
		String strTrail = "--trailing space     ";
		System.out.println(strTrail.stripTrailing());
		// output
		// --trailing space

		// strip -- removes white spaces from both end front and back
		String bothFrontBack = "    Frontback white spaces      ";
		System.out.println(bothFrontBack.strip());

		// output
		// Frontback white spaces

		// Note: The existing trim() method provides the same functions as the strip()
		// method with the only difference being the white-space definition. In the
		// trim() method, the white-space is defined as any character whose codepoint is
		// less than or equal to \u0020. In the strip() method, the white-space is
		// defined by the static Character.isWhitespace method.
	}

}
