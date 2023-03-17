package alb_TA06;

import java.util.Scanner;

public class Ej12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el tamaño deseado: ");
		int tam = scan.nextInt();
		boolean dig = false;
		int n1 = 0;
		// CUIDADOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
		while (!dig) {
			System.out.println("Que digito buscas? ");
			n1 = scan.nextInt();
			if (n1 < 10) {
				dig = true;
			}
		}
		int[] arr1 = new int[tam];
		llenar(arr1);
		int[] arr2 = new int[buscar(arr1, n1)];
		llenarDigito(arr1, arr2, tam, n1);
		mostrar(arr2);
	}

	private static void mostrar(int[] arr2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

	private static void llenarDigito(int[] arr1, int[] arr2, int tam, int n1) {
		// TODO Auto-generated method stub
		int num = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (n1 == (arr1[i] % 10)) {

				arr2[num] = arr1[i];
				num++;
			}
		}
	}

	public static int llenar(int[] arr1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * (300 - 1 + 1) + 1);
		}
		return 0;
	}

	private static int buscar(int[] arr1, int n1) {
		// TODO Auto-generated method stub
		int tam = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (n1 == (arr1[i] % 10)) {
				tam++;
			}
		}

		return tam;
	}

}
