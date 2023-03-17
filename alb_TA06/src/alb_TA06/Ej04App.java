package alb_TA06;

import javax.swing.JOptionPane;

public class Ej04App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oper = JOptionPane.showInputDialog("Introduzca un numero:");
		int n1 = Integer.parseInt(oper);
		System.out.println(factorial(n1));
	}

	public static int factorial(int n1) {
		int result = 1;
		for (int i = 1; i < (n1 + 1) ; i++) {
			result = result * i;
		}
		return result;
	}

}
