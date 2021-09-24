package com.dinesh.fileChanges;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example {

	public static void main(String[] args) {
		try {
			//create a file if it is not present
			Files.writeString(Path.of("text.txt"), "Data to be written in file");
			
			//reads data from file if file not present then NoSuchFileException will thrown		
			System.out.println(Files.readString(Path.of("text.txt")));
			
			//used to locate the path locates the same file or not
			System.out.println("Path is same ot not : "+Files.isSameFile(Path.of("text.txt"), Path.of("text.txt")));
			System.out.println("Path is same ot not : "+Files.isSameFile(Path.of("text.txt"), Path.of("text2.txt")));
			
		}catch(IOException ex) {
			System.err.println("Exception occured --"+ex);
		}
	}
}
