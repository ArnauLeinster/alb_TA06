package alb_TA06;

import java.util.Scanner;

public class Ej10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de numeros deseados");
		int n1 = 3;
		int n2 = 9;
		int[] list = new int[scan.nextInt()];

		llenar(list, n1, n2);
		mostrar(list);
	}

	private static void mostrar(int[] list) {
		// TODO Auto-generated method stub
		int max = 0;
		for (int i = 0; i < list.length; i++) {
			if (max < list[i]) {
				max = list[i];
			}
			System.out.println(list[i]);
		}
		System.out.println("El valor máximo es de " + max);
	}

	public static void llenar(int[] list, int n1, int n2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) primoRand(n1, n2);
		}
	}

	public static double primoRand(int n1, int n2) {
		// TODO Auto-generated method stub
		int result = 0;
		boolean primo = false;
		while (!primo) {
			result = (int) (Math.random() * (n2 - n1 + 1) + n1);
			if (result % 2 == 1) {
				return result;
			}
		}
		return result;
	}

}
