public class Kouvadakia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Read from input file and store in vol1,vol2,volg
		int vol1=0, vol2=0, volg=0;

		if (args.length > 1) {
			vol1 = Integer.parseInt(args[0]);
			vol2 = Integer.parseInt(args[1]);
			volg = Integer.parseInt(args[2]);
			//System.out.println(vol1 + " " + vol2 + "" + volg);
		} else {
			System.out.println("impossible");
		}
		// see if there is a possible solution
		if (volg % findGCD(vol1, vol2) != 0 || vol1<0 || vol2<0 || volg<0)
			System.out.println("impossible");
		else {
			//need to implement the findMovements
			findMovements(vol1,vol2,volg);
			findMovements(vol2,vol1,volg);
		}
		
	}

	private static int findGCD(int number1, int number2) {
		// base case
		if (number2 == 0) {
			return number1;
		}
		return findGCD(number2, number1 % number2);
	}
	private static String findMovements (int v1,int v2, int vg){
		String solution = new String();
		return solution;
	}
}
