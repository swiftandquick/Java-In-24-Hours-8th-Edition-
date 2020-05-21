package com.java24hours.hour20.p8;

import java.io.*;

public class newStudentID {

	File studentIDList = new File("src/com/java24hours/hour20/p8/IDList.dat");
	
	/** Constructor.  */
	newStudentID() {
		try {
			FileOutputStream writeFile = new FileOutputStream(studentIDList);
			/** Calls writeLine method.  However, only the first 5 numbers are 
			 * studentID, rest of it doesn't need to be written.  */
			writeLine(writeFile, "42814mfd");
			writeLine(writeFile, "900143rr");
			writeLine(writeFile, "09913K@9");
			writeFile.close();
		}
		catch (IOException e) {
			// Do nothing.  
		}
	}
	
	public void writeLine(FileOutputStream rWriteFile, String untrimmedID) throws IOException {
		byte[] labelBytes = "Student ID:  #".getBytes();
		byte[] uIDBytes = untrimmedID.getBytes();
		rWriteFile.write(labelBytes);
		/** Writes only the first 5 characters, because rest are not part of the ID.  */
		rWriteFile.write(uIDBytes, 0, 5);
		/** Skips a line.  */
		rWriteFile.write('\n');
	}
	
	public static void main(String args[]) {
		new newStudentID();
	}
	
}
