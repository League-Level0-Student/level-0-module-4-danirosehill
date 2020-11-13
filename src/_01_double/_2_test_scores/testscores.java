package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testscores {
	public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("Input your test score as a percentage to see how you did");
	double testscore = Double.parseDouble(score);
	if (testscore < 60) {
	JOptionPane.showMessageDialog(null, "Study harder!");
	}
	else if (60 <= testscore && testscore < 70) {
	JOptionPane.showMessageDialog(null, "You are barely scraping by.");
	}
	else if (70 <= testscore && testscore < 80) {
	JOptionPane.showMessageDialog(null, "You are improving. Keep up the good work!");
	}
	else if (80 <= testscore && testscore < 90) {
	JOptionPane.showMessageDialog(null, "Stellar work! Keep it up and you'll get an A soon.");
	}
	else if (90 <= testscore && testscore < 10) {
	JOptionPane.showMessageDialog(null, "Are you an astronaut? Because your score was out of this world!");
	}
	
		
		
		
	}

}
