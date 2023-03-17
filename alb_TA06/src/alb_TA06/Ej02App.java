package alb_TA06;

import java.util.Scanner;

public class Ej02App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduczca la cantidad de numeros deseada: ");
		double ca = scan.nextDouble();
		int n1 = 1;
		int n2 = 10;

		double[] list = new double[(int) ca];

		
		//El enunciado pide crear un metodo que devuelva solo un numero a la vez, por eso esta en el main y no en otro metodo esto
		for (int i = 0; i < ca; i++) {
			list[i] = numRand(1, 10);
		}

		mostrar(list);

	}

	public static void mostrar(double[] list) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	private static double numRand(int n1, int n2) {
		// TODO Auto-generated method stub
		double result;

		result = Math.random() * (10);

		return result;
	}

}
