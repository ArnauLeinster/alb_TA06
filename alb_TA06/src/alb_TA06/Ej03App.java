package alb_TA06;

import javax.swing.JOptionPane;

public class Ej03App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oper = JOptionPane.showInputDialog("Introduzca un numero:");
		int n1 = Integer.parseInt(oper);
		System.out.println("Numero primo: " + primo(n1));
	}
	
	public static boolean primo(int n1) {
		boolean result;
		if ((n1 % 2) == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
		
	}

}
