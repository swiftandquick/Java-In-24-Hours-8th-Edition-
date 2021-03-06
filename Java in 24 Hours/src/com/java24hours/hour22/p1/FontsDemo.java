package com.java24hours.hour22.p1;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class FontsDemo extends JFrame {
	
	JLabel hello = new JLabel("Hello world!");
	/** Create a font that is Serif, Italic, Bold, and size 72.  */
	Font helloFont = new Font("Serif", Font.BOLD + Font.ITALIC, 72);
	
	FontsDemo() {
		
		super("Fonts Demo");
		setSize(600, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		/** Sets the background color to black.  */
		getContentPane().setBackground(Color.black);
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		setLayout(layout);
		
		/** Sets the JLabel's text color to red.  */
		hello.setForeground(Color.red);
		hello.setFont(helloFont);
		add(hello);
		
	}
	
	
	public static void main(String args[]) {
		FontsDemo frame = new FontsDemo();
		frame.setVisible(true);
	}
	
}
