package Exercise;

import javax.swing.JOptionPane;

public class Equation {
	private static void FirstDegreeEquation(double a, double b) {
		if(a == 0) {
			if(b != 0)	
				JOptionPane.showMessageDialog(null, "Equation has no root", "Show results", 
						JOptionPane.INFORMATION_MESSAGE);
			else {
				JOptionPane.showMessageDialog(null, "Equation has infinite roots", "Show results", 
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Equation has unique root x = " + -b/a , "Show results", 
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
	private static void SystemFirstDegreeEquation(double a1, double b1, double c1, double a2, double b2, double c2) {
		double d = a1*b2-a2*b1;
		double dx = c1*b2-c2*b1;
		double dy =  a1*c2-a2*c1;
		if(d != 0) {
			JOptionPane.showMessageDialog(null, 
					"System of equation has unique root" + "\n" + "x = " + dx/d + "\n" + " y = " + dy/d  , 
					"Show results", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			if(dx != 0  && dy != 0) {
				JOptionPane.showMessageDialog(null, "System of equation has no root", "Show results",
						JOptionPane.INFORMATION_MESSAGE);
			}
			else if( dx == 0 && dy ==0) {
				JOptionPane.showMessageDialog(null, "System of equation has infinite roots", "Show results",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	private static void SecondegreeEquation (double a, double b, double c) {
		double delta = b*b - 4*a*c;
		if(delta < 0) {
			JOptionPane.showMessageDialog(null, "Second degree equation has no root", "Show results",
					JOptionPane.INFORMATION_MESSAGE);
		}
		else if(delta == 0) {
			JOptionPane.showMessageDialog(null, "Second degree equation has unique root x = " + -b/2/a, 
					"Show results",
					JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, 
					"Second degree equation has 2 root" + "\n" + (-b - Math.sqrt(delta))/2/a + "\n" + (-b + Math.sqrt(delta))/2/a, 
					"Show results",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "First Degree Equation");
		String a = JOptionPane.showInputDialog(null, "Please input the first number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		String b = JOptionPane.showInputDialog(null, "Please input the second number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		double a1 = Double.parseDouble(a);
		double b1 = Double.parseDouble(b);
		FirstDegreeEquation(a1,b1);
		
		JOptionPane.showMessageDialog(null, "System of first Degree Equation");
		String c = JOptionPane.showInputDialog(null, "Please input the first number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		String d = JOptionPane.showInputDialog(null, "Please input the second number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		String e = JOptionPane.showInputDialog(null, "Please input the third number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		String f = JOptionPane.showInputDialog(null, "Please input the forth number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		String g = JOptionPane.showInputDialog(null, "Please input the fifth number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		String h = JOptionPane.showInputDialog(null, "Please input the sixth number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		double c1 = Double.parseDouble(c);
		double d1 = Double.parseDouble(d);
		double e1 = Double.parseDouble(e);
		double f1 = Double.parseDouble(f);
		double g1 = Double.parseDouble(g);
		double h1 = Double.parseDouble(h);
		SystemFirstDegreeEquation(c1, d1, e1, f1, g1, h1);
		
		JOptionPane.showMessageDialog(null, "Second degree Equation");
		String i = JOptionPane.showInputDialog(null, "Please input the first number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		String k = JOptionPane.showInputDialog(null, "Please input the second number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		String l = JOptionPane.showInputDialog(null, "Please input the third number", 
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		double i1 = Double.parseDouble(i);
		double k1 = Double.parseDouble(k);
		double l1 = Double.parseDouble(l);
		SecondegreeEquation(i1, k1, l1);
	}
}
