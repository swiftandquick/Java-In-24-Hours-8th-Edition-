package com.java24hours.hour21.p5;

import java.io.IOException;
import java.net.*;
import java.net.http.*;

/** Prints out codes rather than encoded messages.  */
public class RetrieveInfo {

	/** It's a post from a K-pop forums.  */
	String urlString = "https://www.allkpop.com/forum/threads/kpop-song-ur-currently-listening-to.119/";
	
	
	RetrieveInfo() {
		try {
			getInfo(urlString);
		}
		catch (URISyntaxException e) {
			System.out.println("Invalid URI:  " + e.getMessage());
		}
		catch (IOException | InterruptedException e) {
			System.out.println("Error:  " + e.getMessage());
		}
	}
	
	
	public void getInfo(String rUrlString) throws URISyntaxException, IOException, InterruptedException {
		
		URI url = new URI(rUrlString);
		HttpClient browser = HttpClient.newHttpClient();
		
		String name = "Watermelon";
		String id = "42069";
		
		/** I have no idea what to put in there, that's probably why console output is all codes.  */
		HttpRequest.BodyPublisher proc = HttpRequest.BodyPublishers.ofString(
			"name=" + name + "&id=" + id + "&comment" + "demo");
		
		HttpRequest.Builder newBuild = HttpRequest.newBuilder(url)
				.header("Content-Type", "application/rss+xml")
				.header("Accept", "text/css")
				.POST(proc);
		
		HttpRequest request = newBuild.build();
		
		HttpResponse<String> response = browser.send(request, HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Method:  " + request.method());
		System.out.println(response.body());
		
	}
	
	
	public static void main(String args[]) {
		new RetrieveInfo();
	}
	
}
