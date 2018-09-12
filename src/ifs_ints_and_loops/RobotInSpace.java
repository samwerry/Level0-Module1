package ifs_ints_and_loops;

import java.applet.AudioClip;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;

import org.jointheleague.graphical.robot.Robot;

public class RobotInSpace implements KeyEventDispatcher {

	Robot rob = new Robot("mini");

	/*
	 * Make the Robot move around the screen when the arrow keys are pressed...
	 * 
	 * 1. IMPORTANT: For this recipe, use rob.microMove(distance) to move your
	 * Robot and rob.setAngle(angle) to change the direction of your Robot. //Do
	 * not add code here - go to step 2
	 */

	private void moveRobot(int keyPressed) throws InterruptedException {
		// 2. Print out the keyPressed variable and write down the numbers for
		// each arrow key
System.out.println(keyPressed);
		// 3. If the up arrow is pressed, move the Robot up the screen.

		// 4. If the down arrow is pressed, move the Robot down.

		// 5. If the left arrow is pressed, make the Robot go left.

		// 6. If right is pressed, move the Robot right.

		// 7. Run your program and move the Robot to RD-2D for a surprise!
	}

	private void checkIfR2D2Found() throws Exception {
		int robotLocationX = rob.getX();
		int robotLocationY = rob.getY();

		if (robotLocationX <= 7300 && robotLocationX >= 720 && robotLocationY >= 150 && robotLocationY <= 160)
			playEureka();
	}

	public static void main(String[] args) {
		new RobotInSpace().controlTheRobot();
	}

	private void controlTheRobot() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Robot.setWindowImage("planet.jpg");
		rob.penUp();
		rob.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			try {
				moveRobot(e.getKeyCode());
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				checkIfR2D2Found();
			} catch (Exception exception) {
			}
		}
		return false;
	}

	public void playEureka() {
		System.out.println("EUREKA!");
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource("r2d2-eureka.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
