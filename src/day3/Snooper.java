package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String House = JOptionPane.showInputDialog("Where Do You Live?");
		String Phone = JOptionPane.showInputDialog("What is your Phone Number?");
		String Social = JOptionPane.showInputDialog("What is your Social Security Number?");
		JOptionPane.showMessageDialog(null, "Thank you for your personal info\n " + House + "\n" + Phone + "\n" + Social + "\n");
		System.out.println("Hello There");
	}

}
