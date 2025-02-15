package empleados;

import java.util.Comparator;

public class OrdenarEmpleadoAsc implements Comparator<Empleado>{
	@Override
	public int compare(Empleado usuario1, Empleado usuario2) {
		String nombre1 = usuario1.getNombre();
		String nombre2 = usuario2.getNombre();
		return nombre1.compareTo(nombre2);
	}
}