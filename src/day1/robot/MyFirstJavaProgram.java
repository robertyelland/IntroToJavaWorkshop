package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot Steve = new Robot();
		Steve.moveTo(500, 500);
		Steve.setPenColor(Color.PINK);
		Steve.penDown();
		Steve.setSpeed(10);
		Steve.move(-100);
		Steve.turn(90);
		Steve.move(100);
		Steve.turn(-90);
		Steve.move(100);
		Steve.turn(-90);
		Steve.move(100);
		for (int i = 0; i < 7; i++) {
			Steve.turn(360 / 7);
			Steve.move(100);
		}
	}
}
