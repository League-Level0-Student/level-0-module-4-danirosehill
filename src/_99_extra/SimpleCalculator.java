package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		
	
		for (int i=0; i<100; i++) {

		// 1. Get 2 numbers from the user and convert them to integer.
		
		String num1 = JOptionPane.showInputDialog("Choose a number.");
		int number1 = Integer.parseInt(num1);
		String num2 = JOptionPane.showInputDialog("Choose a second number.");
		int number2 = Integer.parseInt(num2);

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What would you like to do to these two numbers?", "The Big Choice", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
				null);
		
		
		
		

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		
	if (operation == 0) {
	add(number1, number2);
	}
	
	if (operation == 1) {
		subtract(number1, number2);
		}
	
	if (operation == 2) {
		multiply(number1, number2);
		}
	
	if (operation == 2) {
		divide(number1, number2);
		}

		}

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	
	static void add (int number1, int number2) {
	int answer1 = number1 + number2;
	JOptionPane.showMessageDialog(null, number1 + "+" + number2 + "=" + answer1);
	}
	
	static void subtract (int number1, int number2) {
	int answer2 = number1 - number2;
	JOptionPane.showMessageDialog(null, number1 + "-" + number2 + "=" + answer2 );
	}
	
	static void multiply (int number1, int number2) {
		int answer3 = number1 * number2;
		JOptionPane.showMessageDialog(null, number1 + "x" + number2 + "=" + answer3 );
		}
	
	static void divide (int number1, int number2) {
		int answer4 = number1/number2;
		JOptionPane.showMessageDialog(null, number1 + "/" + number2 + "=" + answer4 );
		}
	

	// 4. Create similar methods for subtraction, multiplication and division.
}