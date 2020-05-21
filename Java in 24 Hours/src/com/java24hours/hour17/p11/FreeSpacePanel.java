package com.java24hours.hour17.p11;

import java.io.IOException;
import java.nio.file.*;
import javax.swing.*;

/**
 * This class isn't meant to be executable, it's a component that's meant to be
 * added to any graphical user interface when I want to display information
 * about available disk space.
 */
@SuppressWarnings("serial")
public class FreeSpacePanel extends JPanel {

	JLabel spaceLabel = new JLabel("Disk space:  ");
	JLabel space = new JLabel();
	
	FreeSpacePanel() {
		
		/** Calls constructor of the JPanel class, ensure that it is set up properly.  */
		super();
		
		/** Add the two labels to the panel.  */
		add(spaceLabel);
		add(space);

		/**
		 * Try to retrieve the percent of free space as a double value, if I can't
		 * retrieve it, I can throw an I/O error where the JLabel space's text is set to
		 * Error rather than a percentage (in the form of double).
		 */
		try {
			setValue();
		}
		catch (IOException e) {
			space.setText("Error");
		}
	}
	
	private final void setValue() throws IOException {
		/**
		 * Get the current file storage pool. Path object current gets the current
		 * folder in which the Java application is running.
		 */
		Path current = Paths.get("");
		/**
		 * Storage information for a disk is contained within the FileStore object named
		 * store. Call the getFileStore (Path) method of Files to retrieve that file
		 * storage pool.
		 */
		FileStore store = Files.getFileStore(current);
		/** Find the free storage space.  */
		long totalSpace = store.getTotalSpace(); 
		long freeSpace = store.getUsableSpace(); 
		/** Get this as a percentage (with two digits).  */
		double percent = (double) freeSpace / (double) totalSpace * 100;
		/** Gets two decimal digits as percentage.  So I can get results like 15.25%.  */
		percent = (int) (percent * 100) / (double) 100;
		
		/** Convert the long variables (totalSpace, freeSpace) to char arrays.  */
		char[] totalSpaceCA = Long.toString(totalSpace).toCharArray(); 
		char[] freeSpaceCA = Long.toString(freeSpace).toCharArray(); 
		
		/** Declare two empty Strings that were supposed to contain commas.  */
		String totalSpaceS = "";
		String freeSpaceS = "";
		
		/** Declare digit = 0 to be used in for loop.  */
		int digit = 0;
		/**
		 * Start adding digits from lowest to highest (right to left), so it starts from
		 * the last index of the character array. For every 3 digits I added, I also put
		 * a comma in front of them.
		 */
		for (int i = totalSpaceCA.length - 1; i >= 0; i--) {
			if (digit != 0 && digit % 3 == 0) {
				totalSpaceS = "," + totalSpaceS;
			}
			totalSpaceS = totalSpaceCA[i] + totalSpaceS;
			digit++;
		}
		
		/** Reset digit to 0 for another similar for loop.  */
		digit = 0;
		/** I applied the same logic as above.  */
		for (int i = freeSpaceCA.length - 1; i >= 0; i--) {
			if (digit != 0 && digit % 3 == 0) {
				freeSpaceS = "," + freeSpaceS;
			}
			freeSpaceS = freeSpaceCA[i] + freeSpaceS;
			digit++;
		}
		
		/** Set the label's text.  */
		space.setText(freeSpaceS + " free out of " + totalSpaceS + " (" + percent + "%)");
	}
	
}
