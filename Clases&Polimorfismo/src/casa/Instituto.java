package casa;

public class Instituto {
	
	private String nombre;
	private Grupo[] grupo;
	private int index = 0;
	
	public Instituto(String nombre) {
		this.nombre = nombre;
		this.grupo = new Grupo[200];
	}
	
	@Override
	public String toString() {
		String cadena = "";
		
		if (index == 0) {
			cadena += this.getNombre() + ":\n";
			cadena += "Este instituto no tiene grupos";
		} else {			
			cadena += this.getNombre() + ":\n";
			for (int i = 0; i < index; i++) {
				cadena += grupo[i] + "\n";
			}
		}
		
		return cadena;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public boolean agregarGrupo(Grupo g) {
		if (index < grupo.length) {
			grupo[index] = g;
			index++;
			return true;
		}
		return false;
	}
	
	public Grupo obtenerGrupoPorNombre(String nombre) {
		for (int i = 0; i < grupo.length; i++) {
			if (grupo[i].getNombre().equals(nombre)) {
				return grupo[i];
			}
		}
		return null;
	}
	
}
