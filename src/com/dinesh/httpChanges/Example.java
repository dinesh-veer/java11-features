package com.dinesh.httpChanges;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Example {

	public static void main(String[] args) throws IOException, InterruptedException {

		// in java 9 HttpClient is introduced to connect with Http requst or api
		// in java 11 HttpClient is available in "java.net" package

		// This Http client can be used for Sync and Async communication

		// In sync request it blocks thread until the reponse is
		// available. BodyHandlers will define the expected type of response body (e.g. as
		// string, byte-array or file). 
		//Send() method is synchronous

		var request = HttpRequest.newBuilder()
									.uri(URI.create("https://jsonplaceholder.typicode.com/todos"))
									.GET()// we can comment out get method as it is default method
									.build();
		var client = HttpClient.newHttpClient();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		
		System.out.println("-------------------------------------------------------------------------------");
		Thread.sleep(3000);
		System.out.println("-------------------------------------------------------------------------------");
		//using Calling sendAsync does not block the current thread and instead returns 
		//a CompletableFuture to construct asynchronous operation. Using request and client
		//of above call 
		
			client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
			    .thenApply(HttpResponse::body)
			    .thenAccept(System.out::println);
			//Added sleep to wait and print result on console
			Thread.sleep(10000);
			System.out.println("-------------------------------------------------------------------------------");
	}
}
