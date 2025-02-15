package p2;

public class E2X06 {
	public static long operacion = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		calcularFactorialI(13);
		System.out.print(calcularFactorialR(5));
	}
	
	public static long calcularFactorialR(int numero) {
		if (numero != 0) {
			operacion = (numero * numero--) * operacion;
			System.out.println(operacion);
			System.out.println(numero--);
			return calcularFactorialR(numero--);
		} else {
			return operacion;
		}
		
	}
	
	public static long calcularFactorialI(int numero) {
		long multiplicacion = 1;
		for (int a = 1; a <= numero; a++) {
			System.out.printf("%d x %d = %d\n", a , multiplicacion, multiplicacion * a);
			multiplicacion = multiplicacion * a;
		}
		return multiplicacion;
	}
}
