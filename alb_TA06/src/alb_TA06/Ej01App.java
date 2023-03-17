package alb_TA06;

import javax.swing.JOptionPane;

public class Ej01App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		String oper = JOptionPane.showInputDialog("Introduzca 1 por circulo, 2 por triangulo y 3 para cuadrado:");
		int n1 = Integer.parseInt(oper);
		switch (n1) {
		case 1:
			String radio = JOptionPane.showInputDialog("Introduzca el radio del circulo deseado:");
			num1 = Integer.parseInt(radio);
			System.out.println("Area: " + areaCirculo(num1));
				break;
		case 2:
			String base = JOptionPane.showInputDialog("Introduzca la base del triangulo deseado:");
			num1 = Integer.parseInt(base);
			
			String altura = JOptionPane.showInputDialog("Introduzca la altura del triangulo deseado:");
			num2 = Integer.parseInt(altura);
			System.out.println("Area: " + areaTriangulo(num1, num2));
			break;
		case 3:
			String lado = JOptionPane.showInputDialog("Introduzca el lado del cuadrado deseado:");
			num1 = Integer.parseInt(lado);
			System.out.println("Area: " + areaCuadrado(num1));
			break;
		default:
			
			break;
		}
			
	}
	public static double areaCirculo (double radio) {
		double result = (3.14*Math.pow(radio, 2));
		return result;
	}
	
	public static double areaTriangulo (double base, double altura) {
		double result = (base * altura / 2);
		return result;
	}
	
	public static double areaCuadrado (double lado) {
		double result = (lado * lado);
		return result;
	}

}
