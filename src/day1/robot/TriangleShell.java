package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot Dog = new Robot();

	void go() {
		drawTriangle(100);

		// 6. Make the robot go as fast as possible
		Dog.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
		int Pet = 50;
		// 7. Do the following (up to step 10) 60 times
		for (int i = 0; i < 60; i++) {

			// 9. Change the color of the pen to a random color
			Dog.setRandomPenColor();
			// 8. Increase the length of the side by 10 pixels
			Pet = Pet + 10;
			// 5. call your drawTriangle() method using your length variable
			drawTriangle(Pet);
			// 10. Turn the robot 6 degrees to the right
			Dog.turn(6);
		}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {
			Dog.penDown();
			Dog.turn(360 / 3);
			Dog.move(length);
		}

	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
