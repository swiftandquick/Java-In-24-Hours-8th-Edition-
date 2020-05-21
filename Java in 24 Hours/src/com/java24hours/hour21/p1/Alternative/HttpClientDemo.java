package com.java24hours.hour21.p1.Alternative;

import java.io.*;
import java.util.*;
import java.net.*;
import java.net.http.*;

public class HttpClientDemo {

	String[] websites = {
		"http://openjdk.java.net", 
		"http://stackoverflow.com", 
		"hvp.s@#terskdfs", // Not a URL.   
		"http://comdotfatismelonwater.org", // This website doesn't exist.  
		"http://codecademy.com",
		"http://freecodecamp.org"
	};
	
	HttpClientDemo() {
		
		System.out.println("List of websites:  ");
		
		for (String website : websites) {
			
			System.out.println("\nSite:  " + website);
			
			/** By having the catch block here instead of outside of the for loop, 
			 * I can catch an error and the for loop doesn't end.  */
			try {
				URI url = new URI(website);
				
				HttpClient browser = HttpClient.newHttpClient();
				
				HttpRequest request = HttpRequest.newBuilder(url).build();
				
					HttpResponse<String> response = browser.send(request, HttpResponse.BodyHandlers.ofString());					
					Optional<String> server = response.headers().firstValue("Server");
					
				if (server.isPresent()) {
					System.out.println("Server:  " + server.get());
				}
				/** StackOverFlow doesn't have identifiable server. */
				else {
					System.out.println("Server:  unidentifiable");
				}

			}
			/** Index 2 should invoke this catch block because it's not using the correct http & URI format.  */
			catch (URISyntaxException | IllegalArgumentException e) {
				System.out.println("Invalid URI Format.  ");
			}
			/** Index 3 should have an IOException because it's not a valid website.  */
			catch (IOException | InterruptedException e) {
				System.out.println("Invalid URL");
			}
			
		}
		
	}
	
	public static void main(String args[]) {
		new HttpClientDemo();
	}
	
}