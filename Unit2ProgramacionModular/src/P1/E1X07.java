package P1;

public class E1X07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a <= 10000; a++) {
			if (esPerfecto(a)) {
				System.out.println("El numero " + a + " es perfecto.");
			}
		}
	}
	
	public static boolean esPerfecto(int numero) {
		int suma = 0;
		for (int a = 1; a < numero; a++) {
			if (numero % a == 0) {
				suma = suma + a;
			}
		}	
		return (suma == numero);
	}
}
