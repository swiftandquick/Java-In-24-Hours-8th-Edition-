package com.java24hours.hour20.p3.Alternative;

import java.io.*;
import java.util.ArrayList;

public class FileInputStreamDemo2 {

	public static void main(String args[]) {
		
		File findID = new File("src/com/java24hours/hour20/p3/Alternative/findNumbers.web");
		
		/** Creates an array list to store the IDs.  */
		ArrayList<Integer> IDs = new ArrayList<Integer>();
		
		try {
			FileInputStream readFile = new FileInputStream(findID);
			
			/** A while loop allows me to read the entire file.  */
			try {
				
				/** Set the currentID with empty String.  */
				String currentID = "";
				
				while(readFile.available() > 0) {

					
					/** Gets the next character (byte) in integer format.  */
					int nextCharInInt = readFile.read();
					
					/** If the nextChar is between 0 (char value of 48) and 9 (char 
					 * value of 57), then I add the current character to currentID.  */
					if (nextCharInInt >= 48 && nextCharInInt <= 57) {
						currentID = currentID + (char) nextCharInInt;
					}
					/** Breaks the while loop if the next char is @ (int value of 64).  */
					else if (nextCharInInt == 64) {
						break;
					}
					/** If the character is anything else.  I can reset the currentID 
					 * String back to empty so I can add 3 new characters (in form of 
					 * 0-9) to the String.  */
					else {
						currentID = "";
					}

					
					/** The following conditional block can replace the previous one.  
					 * I can use the ASCII characters to replace their representative 
					 * integer value, both way works.  */
					/*  if (nextCharInInt >= '0' && nextCharInInt <= '9') {
						currentID = currentID + (char) nextCharInInt;
					}
					else if (nextCharInInt == '@') {
						break;
					}
					else {
						currentID = "";
					} */
						
					/** If the ID is 3 characters long, then I convert it to Integer, 
					 * and add it to the ArrayList.  ID is fixed at length of 3.  */
					if (currentID.length() == 3) {
						IDs.add(Integer.parseInt(currentID));
					}
					
				}

				int index = 0;
				for (Integer ID : IDs) {
					System.out.printf("Employee #%d ID:  %d\n", index + 1, ID);
					index++;
				}
				
				readFile.close();
			} 
			catch (IOException e) {
				System.out.println("I/O error.  ");
			}
			
		}
		catch (FileNotFoundException e) {
			System.out.println("File cannot be located.  ");
		}
		
	}
	
}
