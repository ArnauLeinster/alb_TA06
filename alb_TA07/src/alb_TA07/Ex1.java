package alb_TA07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// counter for the student total in the while loop
		int alum = 0;
		// condition to continue the while loop
		boolean cont = true;
		double total = 0;
		ArrayList<Double> alumList = new ArrayList<>();

		while (cont) {
			alum++;
			System.out.println("Introduzca tu nota de mates para el alumno " + alum + ": ");
			double mates = scan.nextDouble();
			System.out.println("Introduzca tu nota de historia para el alumno " + alum + ": ");
			double hist = scan.nextDouble();
			System.out.println("Introduzca tu nota de ingles para el alumno " + alum + ": ");
			double ingles = scan.nextDouble();

			total = total + ((mates + hist + ingles) / 3);
			alumList.add(((mates + hist + ingles) / 3));

			System.out.println("Si ya ha introducido las notas de todos los alumnos, escriba -1: ");
			int ent = scan.nextInt();
			if (ent == -1) {
				cont = false;
			}
		}

		Iterator<Double> it = alumList.iterator();
		while (it.hasNext()) {
			System.out.println("Nota media del alumo es " + it.next());

		}
		System.out.println("Nota media entre los estudiantes es " + (total / (alumList.size())));
	}

}
