package E1X02;
import entrada.Teclado;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		String apellido;
		int edad;
		int altura;
		boolean activo;
		Persona persona;
		
		
		System.out.println("PERSONA 1");
		nombre = Teclado.leerCadena("Nombre: ");
		apellido = Teclado.leerCadena("Apellido : ");
		edad = Teclado.leerEntero("Edad: ");
		altura = Teclado.leerEntero("¿Altura? :");
		activo = Teclado.leerBooleano("¿Trabajando? :");
		persona = new Persona(nombre, apellido, edad, altura, activo);
		System.out.println(persona.obtenerEstado());
		
		System.out.println("PERSONA 2");
		nombre = Teclado.leerCadena("Nombre: ");
		apellido = Teclado.leerCadena("Apellido : ");
		edad = Teclado.leerEntero("Edad: ");
		altura = Teclado.leerEntero("Altura: ");
		persona = new Persona(nombre, apellido, edad, altura);
		System.out.println(persona.obtenerEstado());
		
		System.out.println("PERSONA 3");
		persona = new Persona();
		System.out.println(persona.obtenerEstado());
	}

}
