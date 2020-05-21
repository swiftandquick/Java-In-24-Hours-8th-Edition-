package com.java24hours.hour20.p10;

import java.io.*;
import java.util.*;

public class Configurator {

	File configFile = new File("src/com/java24hours/hour20/p10/program.properties");
	
	Configurator() {
		try {
			/** Input stream for the file.  */
			FileInputStream readFile = new FileInputStream(configFile);

			/** Create a Properties object.  Load the properties of the file.  */
			Properties config = new Properties();
			config.load(readFile);
			
			/** Gets the current date, since runtime's property value is currently 
			 * null, I give it a value as the current time in String.  */
			Date current = new Date();
			config.setProperty("runtime", current.toString());
			
			/** Save the properties file.  */
			FileOutputStream writeFile = new FileOutputStream(configFile);
			/** Stores the newly updated information to the console, I need to have 
			 * an output stream for this to work.  The new green text of that file 
			 * displays "Properties settings" on first line, and the second line 
			 * has shows the old lines that I replaced.  */
			config.store(writeFile, "Properties settings");
			config.list(System.out);
			
			/** Close streams that I no longer use.  */
			readFile.close();
			writeFile.close();
		}
		catch (IOException e) {
			// Do nothing.  
		}
	}
	
	public static void main(String args[]) {
		new Configurator();
	}
	
}
