package E2X03;
import entrada.Teclado;

public class E2X03 {
	
	public static void generarMenu() {
		System.out.println("-------------------------------------");
		System.out.println("0) Salir del programa");
		System.out.println("1) Leer por teclado un tiempo valido");
		System.out.println("2) Visualizar en consola el tiempo");
		System.out.println("3) Sumar al tiempo otro tiempo");
		System.out.println("4) Restar al tiempo otro tiempo");
		System.out.println("-------------------------------------");
	}

	public static void main(String[] args) {
		Tiempo tiempo = null;
		int horas, minutos, segundos, opcion = -1;
		boolean valido = false;
		
		while (opcion != 0) {
			generarMenu();
			opcion = Teclado.leerEntero("Opcion: ");
			
			switch(opcion) {
			case 0:
				break;
			case 1:
				horas = Teclado.leerEntero("Horas: ");
				minutos = Teclado.leerEntero("minutos: ");
				segundos = Teclado.leerEntero("Segundos: ");
				while (!(Tiempo.validar(horas, minutos, segundos))){
					horas = Teclado.leerEntero("Horas: ");
					minutos = Teclado.leerEntero("minutos: ");
					segundos = Teclado.leerEntero("Segundos: ");
				}
				
				tiempo = new Tiempo(horas, minutos, segundos);
				System.out.println("Se ha generado un tiempo valido");
				break;
			case 2:
				if (tiempo != null) {
					System.out.println(tiempo.devolverEstado());
				} else {
					System.out.println("No existe un tiempo valido creado.");
				}
				break;
			case 3:
				if (tiempo != null) {
					horas = Teclado.leerEntero("Horas: ");
					minutos = Teclado.leerEntero("minutos: ");
					segundos = Teclado.leerEntero("Segundos: ");
					
					while (!(Tiempo.validar(horas, minutos, segundos))){
						horas = Teclado.leerEntero("Horas: ");
						minutos = Teclado.leerEntero("minutos: ");
						segundos = Teclado.leerEntero("Segundos: ");
						valido = false;
					}
					valido = true;
					
					if (valido) {
						String estado = tiempo.devolverEstado();
						Tiempo tiemp = new Tiempo(horas, minutos, segundos);
						if(tiempo.sumar(tiemp)) {							
							System.out.println(estado);
							System.out.println(tiemp.devolverEstado());
							System.out.println(tiempo.devolverEstado());
						} else {
							System.out.println("Error al sumar el tiempo mas otro tiempo:");
							System.out.println("La suma debe ser igual o inferior a 23h:59m:59s");
						}
						valido = false;
					} else {
							System.out.println("Los datos del tiempo no son válidos:");
							System.out.println("Las horas deben estar comprendidas entre 0 y 23.");
							System.out.println("Los minutos deben estar comprendidos entre 0 y 59.");
							System.out.println("Los segundos deben estar comprendidos entre 0 y 59.");
					}
				} else {
					System.out.println("No existe un tiempo valido creado.");
				}
				break;
			case 4:
				if (tiempo != null) {
					horas = Teclado.leerEntero("Horas: ");
					minutos = Teclado.leerEntero("minutos: ");
					segundos = Teclado.leerEntero("Segundos: ");
					
					while (!(Tiempo.validar(horas, minutos, segundos))){
						horas = Teclado.leerEntero("Horas: ");
						minutos = Teclado.leerEntero("minutos: ");
						segundos = Teclado.leerEntero("Segundos: ");
						valido = false;
					}
					valido = true;
					
					if (valido) {
						String estado = tiempo.devolverEstado();
						Tiempo tiemp = new Tiempo(horas, minutos, segundos);
						if(tiempo.restar(tiemp)) {							
							System.out.println(estado);
							System.out.println(tiemp.devolverEstado());
							System.out.println(tiempo.devolverEstado());
						} else {
							System.out.println("Error al sumar el tiempo mas otro tiempo:");
							System.out.println("La suma debe ser igual o superior a 00h:00m:00s");
						}
						valido = false;
					} else {
							System.out.println("Los datos del tiempo no son válidos:");
							System.out.println("Las horas deben estar comprendidas entre 0 y 23.");
							System.out.println("Los minutos deben estar comprendidos entre 0 y 59.");
							System.out.println("Los segundos deben estar comprendidos entre 0 y 59.");
					}
				} else {
					System.out.println("No existe un tiempo valido creado.");
				}
				break;
			}
		}
	}
}