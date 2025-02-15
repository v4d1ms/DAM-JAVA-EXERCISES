package ejerciciosP4;

public class E4X04C {

	public static void main(String[] args) {
		// TODO Suma de todos los numeros naturales del 1 al 50 con bucle for
		int b = 0;
		
		for (int x = 0; x <= 50; x = x + 1) {
			b = b + x;
			System.out.println(b);
		}
		System.out.print("Resultado: " + b);
	}
}
