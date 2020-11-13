package _02_boolean._1_sleepy_head;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import org.w3c.dom.css.Rect;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        
		String weekday = JOptionPane.showInputDialog("What day is it?");
		
		if (weekday.equals("saturday") || weekday.equals("sunday")) {
			isWeekend = true;
			JOptionPane.showMessageDialog(null, "You get to sleep in!");
		} else {
			isWeekend = false;
			JOptionPane.showMessageDialog(null, "Get out of bed and go to school!");
		}
		
		
		
		// Set the boolean isWeekend based on the value they enter
		
		
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam

		String sco = JOptionPane.showInputDialog("What percentage did you score in your last exam?");
		double score = Double.parseDouble(sco);
		
		if (score > 70) {
		passedExam= true;
		JOptionPane.showMessageDialog(null, "Congrats! You passed.");
		} else {
		passedExam= false;
		JOptionPane.showMessageDialog(null, "You failed, better luck next time!");
		}
		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			if (gameOver.equals("yes")) {
			gameIsOver=true;
			JOptionPane.showMessageDialog(null, "Game is over!");
			}
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		
		String color = JOptionPane.showInputDialog("What color should I draw with?");
		if (color.equals("red")) {
		isRed = true;
		} else {
		isRed=false;
		}
		
		
		boolean isSquare;		
		
		String shape = JOptionPane.showInputDialog("What shape should I draw?");
		if (shape.equals("square")) {
		isSquare = true;
		} else {
		isSquare=false;
		}
		
		if (isSquare == true && isRed == true) {
		drawRedSquare();
		} else {
			JOptionPane.showMessageDialog(null, "I do not know how to draw that shape.");
		}
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	private static void Rect(int i, int j) {
		// TODO Auto-generated method stub
		
	}


	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.setPenColor(Color.red);
		rob.penDown();
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		// Complete the rest of this method
	}	
}
