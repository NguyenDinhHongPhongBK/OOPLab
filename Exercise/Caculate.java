package Exercise;

import javax.swing.JOptionPane;

public class Caculate {
	public static void main(String[] args) {
		String a,b;
		double c,d, sum, difference, product, quotion;
		a = JOptionPane.showInputDialog(null, "Please input the first number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		b = JOptionPane.showInputDialog(null, "Please input the second number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		c = Double.parseDouble(a);
		d = Double.parseDouble(b);
		sum = c + d;
		difference = c - d;
		product = c * d;
		quotion = c / d;
		String resultString = "Sum : " + sum + "\n" + "Difference : " + difference 
				+ "\n" + "Product : "+product +  "\n"+"Quotion : "+quotion;
		JOptionPane.showMessageDialog(null, resultString, "Show results", 
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
