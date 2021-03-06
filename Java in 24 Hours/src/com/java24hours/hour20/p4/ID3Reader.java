package com.java24hours.hour20.p4;

import java.io.*;

/** Go to Run, Run Configurations, Arguments.  
 * Put the file name with correct path at arguments:  
 * src/com/java24hours/hour20/p4/song.web
 * */
public class ID3Reader {

	/** Main method starts by taking in a String array named args as 
	 * argument.  Arguments are separated by space.  I only put in 
	 * one argument, which is the song.web file's path in String.  */
	public static void main(String args[]) {
		
		/** There is only one index in the String array, and args[0] 
		 * represents the file name with correct path in String.  */
		File song = new File(args[0]);
		
		try {
			FileInputStream readFile = new FileInputStream(song);

			/** Gets the song.web's size in bytes or characters.  The 
			 * size of the file I created has 166 characters / bytes.  */
			int size = (int) song.length();
			
			/** Skips all characters but the last 128.  */
			readFile.skip(size - 128);
			
			/** Creates a byte array to store the last 128 characters.  */
			byte[] last128 = new byte[128];
			
			/** Reads the last 128 characters.  I can read an bytes when 
			 * I pass in an array of bytes of argument.  */
			readFile.read(last128);
			
			/** Convert the 128 bytes from the bytes array to a String.  */
			String id3 = new String(last128);
			
			/** Get the first 3 characters (index 0-2) as the substring, 
			 * then store the substring's value to a new String called tag.  */
			String tag = id3.substring(0, 3);
			
			/** If the first three indices equals to "TAG"...  */
			if (tag.equals("TAG")) {
				/** Index 3 to 31 contains the title information.  */
				System.out.println("Title:  " + id3.substring(3, 32));
				/** Index 33 to 61 contains the artist information.  */
				System.out.println("Artist:  " + id3.substring(33, 62));
				/** Index 63 to 90 contains the album information.  */
				System.out.println("Album:  " + id3.substring(63, 91));
				/** Index 93 to 96 contains year information.  */
				System.out.println("Year:  " + id3.substring(93, 97));
				/** This means index 32, 62, 91, 92, 97-128 contains 
				 * non-related characters.  I am going to use underscore 
				 * '_' to fill those indices.  */
			}
			else {
				System.out.println(args[0] + " does not contain ID3 information.  ");
			}
			
			/** Always close what I no longer use.  */
			readFile.close();
			
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found!  ");
		}
		/** The skip() method may catch error I have to catch this exception as well. The
		 * reason why this exception may occur because the file may have more than 128
		 * characters or bytes, so if size < 128, I am skipping a negative amount of
		 * numbers, which isn't a valid input.  */
		catch (IOException e) {
			System.out.println("I/O error!  ");
		}
		
	}
	
}
