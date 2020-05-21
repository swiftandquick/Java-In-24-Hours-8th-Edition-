package com.java24hours.hour17.p9;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ScrollPaneDemo extends JFrame {

	ScrollPaneDemo() {
		
		setTitle("Scroll Pane Demo");
		setSize(500, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		JTextArea comments = new JTextArea(8, 40);
		comments.setLineWrap(true);
		comments.setWrapStyleWord(true);
		/**
		 * Creates a vertical scroll bar, the scroll bar wraps around the component
		 * comments. So now, the box can hold way more than just 320 characters because
		 * a vertical scroll bar allows it to. The horizontal scroll bar is set to only
		 * appear if it's needed. Since we already set line wrapping to true, the
		 * horizontal scroll bar will never appear.
		 */
		JScrollPane scroll = new JScrollPane(comments, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(scroll);
		
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new ScrollPaneDemo();
	}
	
}
