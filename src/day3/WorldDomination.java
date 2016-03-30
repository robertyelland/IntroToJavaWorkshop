package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String Domination = JOptionPane.showInputDialog("Do you know How to write Code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (Domination.equals("yes")) {
			System.out.println("Great!, Let us begin world domination!");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else {
			System.out.println("Sorry You are no longer needed");

		}

	}
}
