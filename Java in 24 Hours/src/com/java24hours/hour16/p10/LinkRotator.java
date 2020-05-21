package com.java24hours.hour16.p10;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.net.*;

/* Link rotator class is is from com.java24hours.hour15.p2.  
 * My task is to use Lambda expression for the event listener.  
 */

@SuppressWarnings("serial")
public class LinkRotator extends JFrame implements Runnable {

	String[] pageTitle = new String[6];
	URI[] pageLink = new URI[6];
	int current = 0;
	Thread runner;
	JLabel siteLabel = new JLabel();
	
	/** Default constructor, almost everything related to the GUI goes here.  */
	LinkRotator() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		
		add(siteLabel);
		
		/** I can add elements to array this way.  */
		pageTitle[0] = "Oracle's Java site";
		pageTitle[1] = "Server Side";
		pageTitle[2] = "JavaWorld";
		pageTitle[3] = "Java in 24 Hours";
		pageTitle[4] = "Sams Publishing";
		pageTitle[5] = "Workbench";
		
		/**
		 * I can also add elements to arrays this way. However, this is only adding in
		 * the sense that the original array is empty. If the original array isn't
		 * empty, then the elements inside this newly declared array will replace the
		 * elements of the old array.
		 */
		pageLink = new URI[] {
				getURI("http://www.oracle.com/technetwork/java"), 
				getURI("http://www.theserverside.com"), 
				getURI("http://www.javaworld.com"), 
				getURI("http://www.java24hours.com"), 
				getURI("http://www.samspublishing.com"), 
				getURI("http://workbench.cadenhead.org")
		};
		
		/** Creates a button with text "Visit Site" in it.  */
		Button visitButton = new Button("Visit Site"); 
		
		/**
		 * Use Lambda Expression to create an ActionListener object named act, then
		 * specify what happen if I perform an action on the object with the
		 * ActionListener act added to it.
		 */
		ActionListener act = (event) -> {
			/**
			 * Desktop object is set up because the GUI is intended for user use the
			 * desktop's capabilities to interact with the object.
			 */
			Desktop desktop = Desktop.getDesktop();
			/** I'm not sure if block is needed because it will never be null.  */
			if (pageLink[current] != null) {
				try {
					/** Browse the current displayed link.  */
					desktop.browse(pageLink[current]);
					/**
					 * I don't want the thread to stop running or want the GUI to exit after I click
					 * on the "Visit Site" button, so I get rid of the following lines.
					 */
					// runner = null;
					// System.exit(0);
				}
				catch (IOException e) {
					/** Do nothing, I don't want to interrupt the GUI.  */
				}
			}
		};
		
		/**
		 * Notice how the button adds "act" ActionListener object instead of "this"
		 * keyword, that's because I use Lambda Expression rather than implement
		 * ActionListener on the class.
		 */
		visitButton.addActionListener(act);

		/** Add the visitButton Button object on the GUI.  */
		add(visitButton);
		
		/** Set the GUI visible.  */
		setVisible(true);
		
		/** Start the thread.  */
		start();
	}

	/**
	 * I use the method to convert String to URI because I don't want to use have
	 * exception in the constructor.  I can technically put a try-catch block in the 
	 * constructor as well, but it's safer to do it here.  
	 */
	private URI getURI(String urlText) {
		/** Reset the pageURI to null.  */
		URI pageURI = null;
		try {
			/** Transform the String into text.  */
			pageURI = new URI(urlText);
		}
		catch (URISyntaxException e) {
			/** Do nothing, because we don't want to interrupt the GUI while it's active.  */
		}
		return pageURI;
	}
	
	/** Start the thread if it's null.  The thread keeps re-invoking itself if it's interrupted or stopped.  */
	public void start() {
		if (runner == null) {
			runner = new Thread(this);
			runner.start();
		}
	}
	
	/**
	 * start() method automatically triggers the run() method. The thread will
	 * continue to run until I manually exit the GUI pop up window.
	 */
	public void run() {
		/** Creates a Thread object called thisThread, set it equal to a currently executing thread.  */
		Thread thisThread = Thread.currentThread();
		/**
		 * For every 2000 milliseconds, or 2 seconds, the thread changes. When the
		 * thread changes, the value of current changes. Since the value of current
		 * represents indices 0 to 5 of both pageTitle and pageLink, the
		 * pageTitle[current] and pageLink[current] changes every 2 seconds as well.
		 */
		while (runner == thisThread) {
			current++;
			if (current > 5) {
				current = 0;
			}
			siteLabel.setText(pageTitle[current]);
			repaint();
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				/** Do nothing because I don't want to interrupt the GUI.  */
			}
		}
	}
	
	/** Main method.  */
	public static void main(String[] args) {
		/** Creates and calls the default constructor.  */
		new LinkRotator();
	}
	
}