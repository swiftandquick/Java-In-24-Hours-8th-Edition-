package com.java24hours.hour15.p3;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.net.*;

/* Same as the previous LinkRotator java file, 
 * except this program has 6 of my favorite websites.  
 */

@SuppressWarnings("serial")
public class LinkRotator extends JFrame 
	implements Runnable, ActionListener {
	
	String[] pageTitle = new String[6];
	URI[] pageLink = new URI[6];
	int current = 0;
	Thread runner;
	JLabel siteLabel = new JLabel();
	
	public LinkRotator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		add(siteLabel);
		pageTitle = new String[] {
			"Codecademy", 
			"Udemy", 
			"W3Schools", 
			"Github", 
			"Khan Academy", 
			"Coursera"			
		};
		pageLink[0] = getURI("http://www.codecademy.com");
		pageLink[1] = getURI("http://www.udemy.com");
		pageLink[2] = getURI("http://www.w3schools.com");
		pageLink[3] = getURI("http://www.github.com");
		pageLink[4] = getURI("http://www.khanacademy.org");
		pageLink[5] = getURI("http://www.coursera.org");
		Button visitButton = new Button("Visit Site");
		visitButton.addActionListener(this);
		add(visitButton);
		setVisible(true);
		start();
	}
	
	private URI getURI(String urlText) {
		URI pageURI = null;
		try {
			pageURI = new URI(urlText);
		}
		catch (URISyntaxException ex) {
			// Do nothing.  
		}
		return pageURI;
	}
	
	public void start() {
		if (runner == null) {
			runner = new Thread(this);
			runner.start();
		}
	}
	
	public void run() {
		Thread thisThread = Thread.currentThread();
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
			catch (InterruptedException exc) {
				// Do nothing.  
			}
		}
	}
	
	public void actionPerformed(ActionEvent event) {
		Desktop desktop = Desktop.getDesktop();
		if (pageLink[current] != null) {
			try {
				desktop.browse(pageLink[current]);
				// runner = null;
				// System.exit(0);
			}
			catch (IOException exc) {
				// Do nothing.  
			}
		}
	}
	
	public static void main(String arguments[]) {
		new LinkRotator();
	}

}
