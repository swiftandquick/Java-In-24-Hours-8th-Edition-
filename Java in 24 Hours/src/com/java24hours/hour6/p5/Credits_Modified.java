package com.java24hours.hour6.p5;

public class Credits_Modified {
	
	public static void main(String[] arguments) {
		// Set up film information. 
		String title = "Sharknado";
		int year = 2013;
		String director = "Anthony Ferrante";
		String role1 = "Fin";
		String actor1 = "Ian Ziering";
		String role2 = "April";
		String actor2 = "Tara Reid";
		String role3 = "George";
		String actor3 = "John Heard";
		String role4 = "Nova";
		String actor4 = "Cassie Scerbo";
		
		// Display information.  
		System.out.println(title + " (" + year + ")\n" + 
				"A " + director.toUpperCase() + " film.\n\n" + 
				role1 + "\t" + actor1.toUpperCase() + "\n" + 
				role2 + "\t" + actor2.toUpperCase() + "\n" + 
				role3 + "\t" + actor3.toUpperCase() + "\n" + 
				role4 + "\t" + actor4.toUpperCase() + "\n");
	}
	
}