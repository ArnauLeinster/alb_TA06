package alb_TA06;

import java.util.Scanner;

public class Ej09App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("introduzca la mida deseada: ");
		
		int mida = scan.nextInt();
		
		double num[] = new double[mida];
		
		rellenar(num,0,9);
		
		calcular(num);
		
	}

	public static void calcular(double[] num) {
		// TODO Auto-generated method stub
		double result = 0;
		
		for (int i = 0;i<num.length;i++) {
			result = result + num[i];
			System.out.println(num[i] + " ");
		}
		System.out.println("Total: " + result);
	}

	public static void rellenar(double[] num, int n1, int n2) {
		// TODO Auto-generated method stub
		for (int i = 0;i<num.length;i++) {
			num[i] = Math.random()*10;
		}
		
	}

}
