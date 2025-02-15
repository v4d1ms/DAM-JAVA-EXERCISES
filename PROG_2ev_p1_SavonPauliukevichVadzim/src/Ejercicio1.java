import entrada.Teclado;

public class Ejercicio1 {
	
	public static void menuOpciones() {
		System.out.println("|-----------------------------------------------------|");
		System.out.println("| 0 | Exit                                            |");
		System.out.println("| 1 | Insertar producto primero posicion              |");
		System.out.println("| 2 | consultar todos los productos del inventario    |");
		System.out.println("| 3 | Consultar un producto por codigo                |");
		System.out.println("| 4 | Consultar producto percedero caducados          |");
		System.out.println("|-----------------------------------------------------|");
		
	}

	public static void main(String[] args) {
		int opcion = 0;
		;
		Inventario inv = new Inventario(50);
		
		do {
			menuOpciones();
			opcion = Teclado.leerEntero("Opcion (0, 5) : ");
			switch(opcion) {
			case 0:
				break;
			case 1:
				Producto prod = new Producto();
				System.out.println(prod.toString());
				if (inv.insertar(prod)) {
					System.out.println("Se ha insertado un producto en la primera posicion");
				} else {
					System.out.println("No se ha podido insertar un producto");
				}
				break;
			case 2:
				System.out.println(inv.toString());
				break;
			case 3:
				int codigo = Teclado.leerEntero("Codigo: ");
				System.out.println(inv.consultar(codigo));
				break;
			case 4:
				if (inv.consultarPercederosCaducados() ==  null) {
					System.out.println("No se han encontrado percederos caducados");
				} else {
					System.out.println(inv.consultarPercederosCaducados());
				}
				break;
			default:
				break;
			}
		} while (opcion != 0);

	}

}
