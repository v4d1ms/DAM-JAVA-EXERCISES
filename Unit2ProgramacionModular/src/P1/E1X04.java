package P1;

public class E1X04 {
	
	public static void main(String[] args) {
		for (int a = 1; a <= 9; a++) {
			for (int b= 2; b <= 6; b++) {
				System.out.printf(" %d ^ %d = %6d", a, b, elevar(a, b));
				System.out.print(",");
			}
			System.out.println();
		}
	}

	public static int elevar(int base, int exponente) {
		int potencia = 1;
		for (int a = 0; a < exponente; a++) {
			potencia = potencia * base; 
		}
		return potencia;
	}
}
