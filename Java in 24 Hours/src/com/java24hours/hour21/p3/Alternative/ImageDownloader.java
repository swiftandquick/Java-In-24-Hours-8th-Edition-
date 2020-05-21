package com.java24hours.hour21.p3.Alternative;

import java.io.*;
import java.nio.file.*;
import java.net.*;
import java.net.http.*;

public class ImageDownloader {

	String urlString = "https://upload.wikimedia.org/wikipedia/commons/1/1a/Arthur%2C_the_cat.jpg";
	
	ImageDownloader() {	
		try {
			load(urlString);		
		}
		catch (Exception e) {
			System.out.println("I can't find the cat!");
		}
	}
	
	
	public void load(String rUrlString) throws URISyntaxException, IOException, InterruptedException {
		
		URI url = new URI(rUrlString);
		
		HttpClient browser = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder(url).build();

		/** Instead of using Path to create and store the path of a temporary file, 
		 * I created an actual file with File object and createNewFile() method.  */
		// Path temp = Files.createTempFile("cat", ".jpg");
		File cat = new File("src/com/java24hours/hour21/p3/Alternative/cat.jpg");
		cat.createNewFile();
		
		/** Instead of passing in the Path object, I pass in cat.toPath(), which is 
		 * a File object converted into Path object.  */
		@SuppressWarnings("unused")
		// HttpResponse<Path> response = browser.send(request, HttpResponse.BodyHandlers.ofFile(temp)); 
		HttpResponse<Path> response = browser.send(request, HttpResponse.BodyHandlers.ofFile(cat.toPath()));

		/** Since I never created a path, these codes are not need.  */
		// File perm = new File("src/com/java24hours/hour21/p3/Alternative/cat.jpg");
		
		// temp.renameTo(temp);
		// temp.toFile().renameTo(perm);
		
		System.out.println("The cat is here, he's at " + cat.getAbsolutePath());
		
	}
	
	
	public static void main(String args[]) {
		new ImageDownloader();
	}
	
}
