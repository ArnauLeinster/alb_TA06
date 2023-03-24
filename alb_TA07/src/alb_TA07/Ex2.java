package alb_TA07;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Precio IVA
		Hashtable<String, Double> carrito = new Hashtable<String, Double>();

		double iva = 0.21;
		double total = 0;
		boolean out = true;
		while (out) {

			String producto = JOptionPane.showInputDialog("Pon el producto: ");

			Double precio = Double.parseDouble(JOptionPane.showInputDialog("Pon el precio: "));

			carrito.put(producto, precio);
			total = total + precio + (precio * iva);

			String fin = JOptionPane.showInputDialog("Pon -1 si ya ha terminado");

			if (fin.equals("-1")) {
				out = false;
			}
		}

		Enumeration<String> productos = carrito.keys();
		Enumeration<Double> precios = carrito.elements();

		// Me lo immprime fuera de orden, no entiendo porque pero no causa ningun error
		// y
		// por lo tento lo he dejado asi, ya que es totalmente funcional
		while (productos.hasMoreElements() & precios.hasMoreElements()) {

			double precReal = precios.nextElement();

			System.out.print("Producto: " + productos.nextElement());
			System.out.println("  Precio: " + precReal + "  Precio con Iva: " + (precReal + (precReal * iva)));

		}

		System.out.println("El total sale a :" + total + " euros con un IVA del 21%");
		boolean sufi = true;
		double din = 0;
		while (sufi) {
			din = Double.parseDouble(JOptionPane.showInputDialog("Introduzca tu dinero: "));
			if (din >= total) {
				sufi = false;
			} else {
				System.out.println("Introduzca una cantidad correcta");
			}
		}
		System.out.println("Su cambio es de " + (din - total) + " euros");
	}

}
