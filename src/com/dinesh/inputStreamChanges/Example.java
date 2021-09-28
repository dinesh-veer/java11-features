package com.dinesh.inputStreamChanges;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {

	public static void main(String[] args) throws IOException {

		var classLoader = ClassLoader.getSystemClassLoader();
		// var inputStream = classLoader.getResourceAsStream("./input.txt");
		var inputStream = new FileInputStream("input.txt");
		var tempFile = File.createTempFile("copy", "txt");

		//transferTo-- eads all bytes from this input stream and writes the bytes to the given
		// output stream in the order that they are read. On return, this input stream
		// will be at end of stream
		try (var outputStream = new FileOutputStream(tempFile)) {
			inputStream.transferTo(outputStream);
		}
	}

}
