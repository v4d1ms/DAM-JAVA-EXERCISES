package ejercicios;
import java.util.Scanner;

public class E2X09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double turno, horasO, horasExtra, salario;
		boolean esValido = true;
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Turno de Trabajo (1-Diurno, 2-vespertino)?");
		turno = teclado.nextDouble();
		System.out.print("¿Numero de horas Ordinarias? ");
		horasO = teclado.nextDouble();
		System.out.print("¿Numero de horas extraordinarias? ");
		horasExtra = teclado.nextDouble();
		

		if (turno > 2 || turno < 1) {
			System.err.println("El turno debe estar comprendido entre 1 y 2");
			esValido = false;
		} 
		if (horasO < 20 || horasO > 40) {
			System.err.println("El numero de horas ordinarias debe estar comprendido entre 20 y 40");
			esValido = false;
		}			
		if (horasExtra > 5 || horasExtra < 0 ) {
			System.err.println("El numero de horas extraordinarias debe estar comprendido entre 0 y 5");
			esValido = false;
		}
		
		
		if (esValido) {
			if (turno == 1) {
				salario = horasO * 5 + horasExtra * 7;
				System.out.printf("Salario mensual: %.2f euros", salario);
			} else if (turno == 2){
				salario = horasO * 8 + horasExtra * 11;
				System.out.printf("Salario mensual: %.2f euros", salario);
			}
		}
		teclado.close();
	}
}

	