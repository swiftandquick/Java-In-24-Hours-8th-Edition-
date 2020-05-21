package com.java24hours.hour21.p1;

import java.io.*;
import java.util.*;
import java.net.*;
import java.net.http.*;

public class HttpClientDemo {

	public static void main(String args[]) {
		
		try {

			URI url = new URI("http://google.com"); 
			
			System.out.println("Site:  " + url);
			
			HttpClient browser = HttpClient.newHttpClient();
			
			/** Requests and build url.  */
			HttpRequest request = HttpRequest.newBuilder(url).build();
			
			/** Gets response from the url that's sent.  This method may cause IOException 
			 * or InterruptedException error, make sure I throw those errors.  */
			HttpResponse<String> response = browser.send(request, HttpResponse.BodyHandlers.ofString());
			
			/** Gets information about the server.  */
			Optional<String> server = response.headers().firstValue("Server");
			
			/** Checks if the server is available.  */
			if (server.isPresent()) {
				System.out.println("Server:  " + server.get());
			}
			else {
				System.out.println("Server unidentifiable");
			}
			
		} 
		catch (URISyntaxException e) {
			System.out.println("Website doesn't exist.  ");
		}
		catch (IOException e) {
			// Do nothing.  
		} 
		catch (InterruptedException e) {
			// Do nothing.  
		}
		
	}
	
}
