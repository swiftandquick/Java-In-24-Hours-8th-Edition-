package com.java24hours.hour20.p3.Alternative2;

import java.io.*;
import java.util.ArrayList;

public class FileInputStreamDemo3 {

	public static void main(String args[]) {
		
		File findID = new File("src/com/java24hours/hour20/p3/Alternative2/findNumbers.web");
		
		ArrayList<Integer> IDs = new ArrayList<Integer>();
		
		try {
			FileInputStream readFile = new FileInputStream(findID);
			
			try {
				
				String currentID = "";
				
				int index = 0;
				
				while(readFile.available() > 0) {

					int nextCharInInt = readFile.read();
					
					if (nextCharInInt >= 48 && nextCharInInt <= 57) {
						currentID = currentID + (char) nextCharInInt;
					}
					else if (nextCharInInt == 64) {
						/** If the next character is @ (non-number) from 0 to 9 and 
						 * the currentID isn't an empty string, then I add the 
						 * currentID to ArrayList as integer.  */
						if (currentID.length() != 0) {
							IDs.add(Integer.parseInt(currentID));
							currentID = "";
						}
						break;
					}
					else {
						/** Same logic as above, but this time it applies to all 
						 * characters.  */
						if (currentID.length() != 0) {
							IDs.add(Integer.parseInt(currentID));
							currentID = "";
						}
					}
					
				}

				for (Integer ID : IDs) {
					System.out.printf("Employee #%d ID:  %d\n", index + 1, ID);
					index++;
					currentID = "";
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
