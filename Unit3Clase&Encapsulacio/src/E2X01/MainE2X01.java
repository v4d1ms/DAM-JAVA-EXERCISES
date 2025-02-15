package E2X01;

import entrada.Teclado;

public class MainE2X01 {

	public static void main(String[] args) {

		int opcion = -1;
		int saldo;
		Cuenta cuenta1 = new Cuenta("Francisco", 1);
		Cuenta cuenta2 = new Cuenta("Victoria", 2);

		while (opcion != 0) {
			System.out.println("-----------------------------");
			System.out.println("0) Salir del programa");
			System.out.println("1) Visualizar en consola las 2 cuentas.");
			System.out.println("2) Ingresar importe en la cuenta 1");
			System.out.println("3) Retirar importe en la cuenta 1");
			System.out.println("4) Ingresar importe en la cuenta 2");
			System.out.println("5) Retirar importe en la cuenta 2");
			System.out.println("6) Transferir un importe de la cuenta 1 a la cuenta 2.");
			System.out.println("7) Transferir un importe de la cuenta 2 a la cuenta 1.");
			System.out.println("-----------------------------");

			opcion = Teclado.leerEntero("Opcion (0-8) ? ");

			switch (opcion) {
			case 0:
				System.out.println("Saliendo ...");
				break;
			case 1:
				if (cuenta1 != null && cuenta2 != null) {
					System.out.println(cuenta1.obtenerEstado());
					System.out.println(cuenta2.obtenerEstado());
				} else {
					System.out.println("Las cuentas deben estar creadas.");
				}
				break;
			case 2:
				saldo = Teclado.leerEntero("Saldo que deseas ingresar? ");
				if (cuenta1 != null && cuenta1.ingresar(saldo)) {
					System.out.println("Se ha realizado el ingreso");
				} else {
					System.out.println("La cuenta debe estar creada.");
				}
				break;
			case 3:
				saldo = Teclado.leerEntero("Saldo que deseas retirar? ");
				if (cuenta1 != null && cuenta1.retirar(saldo)) {
					System.out.println("Has retirado dinero correctamente.");
				} else {
					System.out.println("No has podido retirar saldo.");
				}
				break;
			case 4:
				saldo = Teclado.leerEntero("Saldo que deseas ingresar? ");
				if (cuenta2 != null && cuenta2.ingresar(saldo)) {
					System.out.println("Se ha realizado el ingreso");
				} else {
					System.out.println("La cuenta debe estar creada.");
				}
				break;
			case 5:
				saldo = Teclado.leerEntero("Saldo que deseas retirar? ");
				if (cuenta2 != null && cuenta2.retirar(saldo)) {
					System.out.println("Has retirado dinero correctamente.");
				} else {
					System.out.println("La cuenta debe estar creada.");
				}
				break;
			case 6:
				saldo = Teclado.leerEntero("Saldo que deseas transferir? ");
				if (cuenta1.transferir(cuenta2, saldo)) {				
					System.out.println("Se ha echo la transferencia de la cuenta 1 a la cuenta 2.");
				} else {
					System.out.print("No se ha podido realizar la transferencia");
				}
				break;
			case 7:
				saldo = Teclado.leerEntero("Saldo que deseas transferir? ");
				if (cuenta2.transferir(cuenta1, saldo)) {				
					System.out.println("Se ha echo la transferencia de la cuenta 2 a la cuenta 1.");
				} else {
					System.out.print("No se ha podido realizar la transferencia");
				}
				break;
			default:
				System.out.println("La opcion debe estar comprendida entre 0 y 7");
				break;
			}
		}
	}
}
