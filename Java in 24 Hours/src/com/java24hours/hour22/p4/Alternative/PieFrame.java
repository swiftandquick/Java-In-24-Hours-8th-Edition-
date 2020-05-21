package com.java24hours.hour22.p4.Alternative;

import javax.swing.*;
import java.awt.*;

/** I am supposed to put the color and and size values as command
 * -line arguments instead of including them in the source code of 
 * the application.  Do this tomorrow.  What is put in args[] array:  
	0xCC 0xCC 0x99 1350 
	0xCC 0x66 0xFF 1221 
	0x66 0x66 0x99 316 
	0x66 0x99 0x66 251 
	0x66 0x66 0x99 201 
	0x33 0xFF 0xFF 193 
	0x00 0x99 0x66 173 
	0x33 0xCC 0xCC 164 
	0x66 0x33 0x99 143 
	0x99 0x66 0x33 127
 * */

@SuppressWarnings("serial")
public class PieFrame extends JFrame {


	/** Create a null array, then use it to store args[] later.  */
	// private int[] colorArgs;
	// private int[] sizeArgs;
	
	/*
	Color uneasyBeingGreen = new Color(0xCC, 0xCC, 0x99);
	Color zuzusPetals = new Color(0xCC, 0x66, 0xFF);
	Color zootSuit = new Color(0x66, 0x66, 0x99);
	Color sweetHomeAvocado = new Color(0x66, 0x99, 0x66);
	Color shrinkingViolet = new Color(0x66, 0x66, 0x99);
	Color miamiNice = new Color(0x33, 0xFF, 0xFF);
	Color inBetweenGreen = new Color(0x00, 0x99, 0x66);
	Color norwegianBlue = new Color(0x33, 0xCC, 0xCC);
	Color purpleRain = new Color(0x66, 0x33, 0x99);
	Color freckle = new Color(0x99, 0x66, 0x33);
	*/
	
	PieFrame() {
		setTitle("Pie Graph");
		setLookAndFeel();
		setSize(320, 290);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/*
		pie.addSlice(uneasyBeingGreen, 1350);
		pie.addSlice(zuzusPetals, 1221);
		pie.addSlice(zootSuit, 316);
		pie.addSlice(sweetHomeAvocado, 251);
		pie.addSlice(shrinkingViolet, 201);
		pie.addSlice(miamiNice, 193);
		pie.addSlice(inBetweenGreen, 173);
		pie.addSlice(norwegianBlue, 164);
		pie.addSlice(purpleRain, 143);
		pie.addSlice(freckle, 127);
		*/
		
	}
	
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plat.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
			// Do nothing, I don't want to interrupt the GUI.  
		}
	}
	
	
	/** I must have String[] args in main argument, but I will convert them to hexademical 
	 * and decimal integers later.  */
	public static void main(String[] args) {
		PieFrame frame = new PieFrame();
		frame.setVisible(true);

		int colorArgs[] = new int[args.length / 4 * 3];
		int sizeArgs[] = new int[args.length / 4]; 
		
		/** colorIndex and sizeIndex starts at 0.  */
		int colorIndex = 0;
		int sizeIndex = 0;
				
		for(int i = 0; i < args.length; i++) {
			/** For size.  Because every 4th argument is about size.  */
			if ((i + 1) % 4 == 0) {
				sizeArgs[sizeIndex] = Integer.parseInt(args[i]);
				sizeIndex++;
			}
			/** Otherwise, the index will be converted to hexadecimal and 
			 * be added to color.  */
			else {
				/** Program can't convert a String to int when there is "0x" 
				 * in front of it, so I must get rid of it first.  */
				args[i] = args[i].replace("0x", "");
				colorArgs[colorIndex] = Integer.parseInt(args[i], 16);
				colorIndex++;
			}
		}
		
		
		/** The trick is to create PiePanel object and add it in the main method, because other than 
		 * that, I don't know how to get a variable static method from non-static method under this 
		 * package's condition.  */
		PiePanel pie = new PiePanel(10);
		/** Use for loop to create Color object, then pass the color object and size to the method addSlice().  */
		for (int i = 0; i < sizeArgs.length; i++) {
			Color currentColor = new Color(colorArgs[i * 3], colorArgs[i * 3 + 1], colorArgs[i * 3 + 2]);
			pie.addSlice(currentColor, sizeArgs[i]);
		}
		frame.add(pie);
				
	}
	
}