package alb_TA06;

public class Ej06App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 67854;

		System.out.println(deci(num));

	}

	public static int deci(int num) {
		// TODO Auto-generated method stub
		int result = 0;

		while (num > 10) {
			result++;
			num = num / 10;
		}

		return result + 1;
	}

}
