package Exercise;

import javax.swing.JOptionPane;

public class ShowTwoNumber {
	public static void main(String[] args) {
		String num1, num2;
		String notificationString = "You have just entered : ";
		num1 = JOptionPane.showInputDialog(null, "Please input the first number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		notificationString += num1 + " and ";
		num2 = JOptionPane.showInputDialog(null, "Please input the second number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		notificationString += num2;
		JOptionPane.showMessageDialog(null, notificationString, "Show 2 number", 
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
