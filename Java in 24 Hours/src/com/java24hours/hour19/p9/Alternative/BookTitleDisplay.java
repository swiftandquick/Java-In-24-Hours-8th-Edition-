package com.java24hours.hour19.p9.Alternative;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class BookTitleDisplay extends JFrame {

	private ArrayList<String> listOfBooks = new ArrayList<String>();
	private ArrayList<String> rentedBooks = new ArrayList<String>();
	private int current; // Current displayed books.  
	JLabel bookTitle = new JLabel();
	JLabel rentBook = new JLabel();
	JButton previousButton = new JButton("Previous");
	JButton nextButton = new JButton("Next");
	JButton rentButton = new JButton("Rent");
	
	BookTitleDisplay() {
		
		/** Sets ActionListener called action so I don't have to implement the interface.  
		 * I must create a Lambda expression for ActionListener before I add any components 
		 * to ActionListener or else the program cannot detect the ActionListener.  */
		ActionListener action = (event) -> {
			
			String cmd = event.getActionCommand();
			
			if (cmd == "Previous") {
				current--;
				bookTitle.setText(listOfBooks.get(current));
				/** Disable the rent option if the book is already rented.  */
				if (rentedBooks.contains(listOfBooks.get(current))) {
					rentBook.setText("You already rented this book.  ");  
					rentButton.setEnabled(false);
				}
				else {
					rentBook.setText("Do you want to rent this book?  ");  
					rentButton.setEnabled(true);
				}
			}
			else if (cmd == "Next") {
				current++;
				bookTitle.setText(listOfBooks.get(current));
				/** Disable the rent option if the book is already rented.  */
				if (rentedBooks.contains(listOfBooks.get(current))) {
					rentBook.setText("You already rented this book.  ");  
					rentButton.setEnabled(false);
				}
				else {
					rentBook.setText("Do you want to rent this book?  ");  
					rentButton.setEnabled(true);
				}
			}
			else { // cmd == "Rent"
				rentBook.setText("You rented " + listOfBooks.get(current) + ".  ");
				/** Add the rented books to the ArrayList rentedBook.  */
				rentedBooks.add(listOfBooks.get(current));
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
		
		/** Add the necessary books the ArrayList.  */
		listOfBooks.add("The Song of Achilles");
		listOfBooks.add("Of Mice and Men");
		listOfBooks.add("Mind Prey");
		listOfBooks.add("Where the Crawdads Sing");
		listOfBooks.add("The Plague of Corruption");
		listOfBooks.add("Normal People");
		listOfBooks.add("The Great Gatsby");
		
		/** Current index is the middle index.  */
		current = 3;
		
		GridLayout layout = new GridLayout(3, 1, 10, 10);
		setLayout(layout);
		
		JPanel topRow = new JPanel();
		FlowLayout topLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		topRow.setLayout(topLayout);
		/** Displays the middle index initially:  Where the Crawdads Sing.  */
		bookTitle.setText(listOfBooks.get(current));
		topRow.add(bookTitle);
		add(topRow);
		
		JPanel midRow = new JPanel();
		FlowLayout midLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		midRow.setLayout(midLayout);
		rentBook.setText("Do you want to rent this book?  ");  
		midRow.add(rentBook);
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
		rentButton.addActionListener(action);
		bottomRow.add(previousButton);
		bottomRow.add(nextButton);
		bottomRow.add(rentButton);
		add(bottomRow);
		
	}
		public static void main(String args[]) {
		BookTitleDisplay frame = new BookTitleDisplay();
		frame.setVisible(true);
	}
	
}