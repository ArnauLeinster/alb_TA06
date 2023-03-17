package alb_TA06;

import java.util.Scanner;

public class Ej11App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de numeros que quieres: ");
		int[] arr1 = new int[scan.nextInt()];
		generar(arr1);
		int[] arr2 = arr1.clone();
		generar(arr2);
		int[] arr3 = new int[arr1.length];
		multiplicar(arr1, arr2, arr3);
		mostrar(arr3);
	}

	private static void mostrar(int[] arr3) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

	private static void multiplicar(int[] arr1, int[] arr2, int[] arr3) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i] * arr2[i];
		}
	}

	private static void generar(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
	}

}
