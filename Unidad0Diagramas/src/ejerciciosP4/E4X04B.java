package ejerciciosP4;

public class E4X04B {

	public static void main(String[] args) {
		// TODO Suma de todos los numeros naturales del 1 al 50 con bucle do-while
		int x = 0, b = 0;
		
		do {
			b = x + b;
			x++;
		} while (x <= 50);
		
		System.out.print("Resultado: " + b);
	}

}
