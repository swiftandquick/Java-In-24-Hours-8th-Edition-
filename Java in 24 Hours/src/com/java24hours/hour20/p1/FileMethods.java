package com.java24hours.hour20.p1;

import java.io.*;

public class FileMethods {

	/** For re-testing purposes, I should go to the following address:  
	 * C:\Users\Yong Chen\Desktop\Eclipse Work Space\Java in 24 Hours\Java in 24 Hours\src\com\java24hours\hour20\p1
	 * Delete the non-java files, then observe what happen in the same folder when I run the test again.  
	 * First run generates the data.dat file, which is what's supposed to happen after renaming address.dat.  
	 * Second run generates the address.dat file.  I supposed that's because the data.dat file already 
	 * existed after the first run, so the second generated address.dat file will not be renamed.  
	 * */
	
	public static void main(String args[]) {
		
		/** Relative address of the file address.dat in the same package.  */
		File book = new File("src\\com\\java24hours\\hour20\\p1\\address.dat");
		
		/** Checks if the file exists.  It should be for false now.  */
		boolean existence = book.exists();
		System.out.println("The file exists:  " + existence);
		
		/** Gets the name of the file in form of String.  */
		String fileName = book.getName();
		System.out.println("File name is:  " + fileName);
		
		/** Gets the size of the file in long primitive type.  */
		long fileSize = book.length();
		System.out.println("File size is:  " + fileSize);
		
		/** Creates the file if it doesn't exist already.  A try-catch 
		 * block file because there may be IOException in file creation.  */
		try {
			book.createNewFile();
		} 
		catch (IOException e) {
			System.out.println("Cannot create new file!  ");
		}
		
		/** Checks if the file exists again.  It should be true now.  */
		existence = book.exists();
		System.out.println("The file exists:  " + existence);
		
		/** Creates a new File object (not physical file) named book2, then 
		 * give it the name of data.dat.  Notice how I use "/" to indicate 
		 * the path separator rather than "\\", both works.  */
		File book2 = new File("src/com/java24hours/hour20/p1/data.dat");
		
		/** The following also works, it's just not optimal.  */
		/** File book2 = new File("src" + File.pathSeparator 
				+ "com" + File.pathSeparator
				+ "java24hours" + File.pathSeparator
				+ "hour20" + File.pathSeparator
				+ "p1" + File.pathSeparator + "data.dat"); */
		
		/** Renames the file to data.dat.  */
		book.renameTo(book2);
		
		/** Now check if address.dat still exists, it should be false on first run, true on second run.  */
		existence = book.exists();
		System.out.println("The file exists:  " + existence);
		
		/** Deletes the file.  Uncomment the line below to see its effects.  */
		// book2.delete();
		
	}
	
}
