package alb_TA06;

public class Ej05App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = 64;
		System.out.println(numABinario(res));
	}

	public static String numABinario(int res) {
		// TODO Auto-generated method stub

		String result = "";

		int num = res;

		while ((num ) > 1) {
			if ((num % 2) == 0) {
				result = "0" + result;
			} else {
				result = "1" + result;
			}
			
			num = num / 2;
		}
		
		num = num / 2;
		
		if (num == 1) {
			result = "0" + result;
		} else {
			result = "1" + result;
		}

		return result;

	}

}
