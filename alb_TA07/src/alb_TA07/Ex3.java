package alb_TA07;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Double> almacen = new Hashtable<String, Double>();
		almacen.put("a", 10.0);
		almacen.put("b", 20.0);
		almacen.put("c", 30.0);
		almacen.put("d", 40.0);
		almacen.put("e", 50.0);
		almacen.put("f", 60.0);
		almacen.put("g", 70.0);
		almacen.put("h", 80.0);
		almacen.put("i", 90.0);
		almacen.put("j", 100.0);

		Hashtable<String, Double> carrito = new Hashtable<String, Double>();
		String opcio = "";
		while (!opcio.equals("4")) {
			opcio = JOptionPane.showInputDialog(
					"Pulse 1 para comprar,2 para buscar todo, 3 para buscar algo especifico, o 4 para terminar:");
			if (opcio.equals("1")) {
				carrito = comprar(almacen, carrito);
			}
			if (opcio.equals("2")) {
				mostrar(almacen);
			}
			if (opcio.equals("3")) {
				String busc = JOptionPane.showInputDialog("Que quiere buscar?");
				buscar(almacen, busc);
			}

		}
		mostrar(carrito);
	}

	private static Hashtable<String, Double> comprar(Hashtable<String, Double> almacen,
			Hashtable<String, Double> carrito) {
		// TODO Auto-generated method stub
		String com = JOptionPane.showInputDialog("Que quieres comprar?");
		double can = Integer.parseInt(JOptionPane.showInputDialog("Cuantos quieres comprar?"));
		if (almacen.containsKey(com)) {
			carrito.put(com, (can * almacen.get(com)));
		}
		return carrito;
	}

	private static void buscar(Hashtable<String, Double> almacen, String busc) {
		// TODO Auto-generated method stub
		System.out.println(almacen.get(busc));
	}

	private static void mostrar(Hashtable<String, Double> almacen) {
		// TODO Auto-generated method stub
		Enumeration<String> productos = almacen.keys();
		Enumeration<Double> precios = almacen.elements();
		while (productos.hasMoreElements()) {
			double precReal = precios.nextElement();
			System.out.print("  Producto: " + productos.nextElement());
			System.out.println(" Precio: " + precReal);
		}
	}

}
