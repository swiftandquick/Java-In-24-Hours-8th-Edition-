package com.java24hours.hour13.p4;

import java.awt.*;
import java.util.*;

public class FontMapper {
	
	public FontMapper() {
		
		/* Font class is already defined in java.awt package.  
		 * It is used to create fonts and use them to display text in a graphical user interface.  
		 * A font includes the name of the font, the point size, 
		 * and whether its style is plain, bold, or italic.  
		 * Below, I created 3 objects with different fonts.  
		 */
		Font courier = new Font("Courier New", Font.PLAIN, 6);
		Font times = new Font("Times New Roman", Font.BOLD, 12);
		Font verdana = new Font("Verdana", Font.ITALIC, 25);
		Font sans = new Font("sans", Font.PLAIN, 24);
		
		// Create a hash map with fonts, it has two attributes:  string and font.  
		HashMap<String, Font> fonts = new HashMap<>();

		// Create three hash map objects.  
		fonts.put("smallprint", courier);
		fonts.put("body", times);
		fonts.put("headline", verdana);
		fonts.put("bottom", sans);
		
		/** The other way is:  for(String key : fonts.keySet()) */
		for (Map.Entry<String, Font> entry : fonts.entrySet()) {
			// The string part of the hash map.  
			String key = entry.getKey();
			// The font part of the hash map.  
			Font value = entry.getValue();
			System.out.println(key + ":  " + value.getSize() + "-pt " + value.getFontName());
		}
		
	}
	
	public static void main(String[] arguments) {
		new FontMapper();
	}

}