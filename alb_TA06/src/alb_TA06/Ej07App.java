package alb_TA06;

public class Ej07App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double euro = 650;
		String moneda = "libra";

		cambioEuro(euro, moneda);
		System.out.println(euro + " euros son " + cambioEuro(euro, moneda) + moneda);
	}

	public static double cambioEuro(double euro, String moneda) {
		// TODO Auto-generated method stub
		double result = euro;
		
		if (moneda.equalsIgnoreCase("libra")) {
			result = result * 0.86;
		}else if(moneda.equalsIgnoreCase("yen")) {
			result = result * 1.28611;
		} else {
			result = result * 129.852;
		}
		
		return result;
	}

}
