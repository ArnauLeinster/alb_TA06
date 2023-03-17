package alb_TA06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej08App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduzca 10 numeros: ");

		int num[] = new int[10];

		intro(num);

		while (true) {

			System.out.println("Pulse 1 si quiere volver a introducir, pulse 2 si quiere ver el array");
			int n = scan.nextInt();
			switch (n) {
			case 1:
				intro(num);
				break;

			case 2:
				ver(num);
				break;
			}

		}
	}

	public static void ver(int[] num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}
	}

	public static int[] intro(int num[]) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			num[i] = scan.nextInt();
		}
		return num;

	}

}
