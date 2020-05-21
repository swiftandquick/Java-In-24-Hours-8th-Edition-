package com.java24hours.hour19.p9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class BookTitleDisplay extends JFrame {

	private String[] listOfBooks = { "The Song of Achilles", "Of Mice and Men", "Mind Prey", 
									"Where the Crawdads Sing", "The Plague of Corruption", 
									"Normal People", "The Great Gatsby" };
	private int current; // Current displayed books.  
	JLabel bookTitle = new JLabel();
	JLabel readBook = new JLabel();
	JButton previousButton = new JButton("Previous");
	JButton nextButton = new JButton("Next");
	JButton readButton = new JButton("Read");
	
	BookTitleDisplay() {
		
		/** Sets ActionListener called action so I don't have to implement the interface.  
		 * I must create a Lambda expression for ActionListener before I add any components 
		 * to ActionListener or else the program cannot detect the ActionListener.  */
		ActionListener action = (event) -> {
			
			String cmd = event.getActionCommand();
			
			if (cmd == "Previous") {
				current--;
				bookTitle.setText(listOfBooks[current]);
				readBook.setText("Do you want to read this book?  ");  
			}
			else if (cmd == "Next") {
				current++;
				bookTitle.setText(listOfBooks[current]);
				readBook.setText("Do you want to read this book?  ");  
			}
			else { // cmd == "Rent"
				readBook.setText("You read " + listOfBooks[current] + ".  ");
			}
			
			if (current == 0) {
				previousButton.setEnabled(false);
			}
			else {
				previousButton.setEnabled(true);
			}
			
			if (current == 6) {
				nextButton.setEnabled(false);
			}
			else {
				nextButton.setEnabled(true);
			}
			
		};
		
		setTitle("Book Title Display");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		current = 3;
		
		GridLayout layout = new GridLayout(3, 1, 10, 10);
		setLayout(layout);
		
		JPanel topRow = new JPanel();
		FlowLayout topLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		topRow.setLayout(topLayout);
		/** Displays the middle index initially:  Where the Crawdads Sing.  */
		bookTitle.setText(listOfBooks[current]);
		topRow.add(bookTitle);
		add(topRow);
		
		JPanel midRow = new JPanel();
		FlowLayout midLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		midRow.setLayout(midLayout);
		readBook.setText("Do you want to rent this book?  ");  
		midRow.add(readBook);
		add(midRow);
		
		JPanel bottomRow = new JPanel();
		FlowLayout bottomLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		bottomRow.setLayout(bottomLayout);
		/** I will set the ActionListener as an object inside the constructor, so instead
		 * of "this", I will refer to it as "action".  */
		previousButton.addActionListener(action);
		/** Add the buttons to the ActionListener object named action.  Since I 
		 * created a Lambda expression before these codes are executed, so it's OK.  */
		nextButton.addActionListener(action);
		readButton.addActionListener(action);
		bottomRow.add(previousButton);
		bottomRow.add(nextButton);
		bottomRow.add(readButton);
		add(bottomRow);
		
	}
	
	public static void main(String args[]) {
		BookTitleDisplay frame = new BookTitleDisplay();
		frame.setVisible(true);
	}
	
}
