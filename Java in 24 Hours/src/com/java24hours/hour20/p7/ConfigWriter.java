package com.java24hours.hour20.p7;

import java.io.*;

public class ConfigWriter {

	/** This String should be able to let us skip a line later, 
	 * it's important so I put it as instance variable.  */
	String newline = System.getProperty("line.separator");

	/** Constructor.  */
	ConfigWriter() {
		File programProperties = new File("src/com/java24hours/hour20/p7/program.properties");
		try {
			/** Create a output stream object to write on (+create) the file.  */
			FileOutputStream writeFile = new FileOutputStream(programProperties);
			/** To avoid confusion, writeLine() method is not a FileOutputStream method, 
			 * rather, it's the method that I created.  */
			writeLine(writeFile, "username = max");
			writeLine(writeFile, "score = 12550");
			writeLine(writeFile, "score = 5");
			writeFile.close();
		}
		catch (IOException e) {
			System.out.println("I/O error.  ");
		}
	}
	
	/** Throws IOException because program may encounter errors while trying to write.  */
	public void writeLine(FileOutputStream rWriteFile, String output) throws IOException {
		/** Adds an line.seperate (basically like Enter key) to output for line skipping.  */
		output = output + newline;
		/** I can just use "\n" in place of the "line.separator", I am not sure why I need it.  */
		// output = output + "\n";  
		byte[] outputBytes = output.getBytes();
		/** Writes the entire outputBytes byte array to program.properties.  */
		rWriteFile.write(outputBytes);
	}
	
	/** Creates the main method, then invokes the constructor.  */
	public static void main(String args[]) {
		new ConfigWriter();
	}
	
	
}
