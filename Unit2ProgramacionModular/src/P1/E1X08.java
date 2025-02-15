package P1;

public class E1X08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 0; a < 500; a++) {
			for (int b=1; b <= 500; b++) {
				if (sonAmigos(a, b)) {
					System.out.printf("%d y %d son amigos.\n", a, b);
				}
			}
		}
	}
	
	
	public static boolean sonAmigos(int numA, int numB) {
		int sumaA = 0, sumaB = 0;
		for (int a = 1; a < numA; a++) {
			if (numA % a == 0) {
				sumaA = sumaA + a;
			}
		}
		
		for (int b = 1; b < numB; b++) {
			if (numB % b == 0) {
				sumaB = sumaB + b;
			}
		}
		return (sumaA == numB & sumaB == numA);
	}
}
