package ejerciciosP4;

public class E4X04A {

	public static void main(String[] args) {
		// TODO Suma de todos los numeros naturales del 1 al 50 con bucle while
		int x = 0;
		int b = 0;
		
		while (x <= 50) {
			b = x + b;
			x++;
			System.out.printf("%d\n", b);
		}
	}
}
