import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ClubDeportivo {
	
	private String nombre;
	private List<Socio> socios;

	
	public ClubDeportivo(String nombre) {
		this.nombre = nombre;
		this.socios = new ArrayList<>();
	}
	
	public boolean estaVacio() {
		return this.socios.isEmpty();
	}
	
	public boolean agregarSocio(Socio socio) {
		return socios.add(socio);
	}
	
	
	public List<Socio> obtenerSociosConCuotaMasAlta() {
		List<Socio> aux = new ArrayList<>();
		
		if (this.obtenerCuotaMasAlta() != 0.0) {
			for (Socio s : socios) {
				if (s.calcularCuotaMensual() == 
						this.obtenerCuotaMasAlta()) {
					aux.add(s);
				}
			}
		}
		
		if (aux.isEmpty()) {
			return null;
		}
		return aux;
	}
	
	
	public boolean cambiarTipoSocio(String dni, boolean carnetEstudiante) {
		Socio socio = this.getSocioByDNI(dni);
		Socio cambio;
		
		if (socio != null 
				&& socio instanceof SocioBasico) {
			cambio = new SocioPremium(dni, socio.getNombre(), socio.getEdad(), 
					socio.getHorasEntrenador(),  carnetEstudiante);
			socios.set(socios.indexOf(socio), cambio);
			
			return true;
		}
		
		return false;
	}
	
	
	
	public double obtenerCuotaMasAlta() {
		double cuota = 0.0;
		if (!socios.isEmpty()) {
			for (Socio s : socios) {
				if (s.calcularCuotaMensual() > cuota) {
					cuota = s.calcularCuotaMensual();
				}
			}
		}
		return cuota;
	}
	
	public List<String> dniSocioConCarnetEstudiante() {
		List<String> aux = new ArrayList<>();
		
		for (Socio s: socios) {
			if (s instanceof SocioPremium) {
				SocioPremium premium = (SocioPremium) s;
				if (premium.tieneCarnetEstudiante()) {
					aux.add(premium.getDNI());
				}
			}
		}
		
		if (!aux.isEmpty()) {
			return aux;
		}
		
		return null;
	} 

	public boolean cambiarTurnoSocioBasico(String dni, String turno) {
		if (this.getSocioByDNI(dni) != null 
				&& this.getSocioByDNI(dni) instanceof SocioBasico) {	
			SocioBasico socio = (SocioBasico) this.getSocioByDNI(dni);
			socio.setTurno(turno);
			return true;
		}
		return false;
	}
	
	public List<Socio> ordenarPorDnieAsc() {
		List<Socio> listaAux = new ArrayList<Socio>();
		listaAux.addAll(socios);
		Collections.sort(listaAux, new OrdenarPorDniASC());
		return listaAux;
	}
	
	public Socio getSocioByDNI(String dni) {
		if (!socios.isEmpty()) {			
			for (Socio s: socios) {
				if (s.getDNI().equals(dni)) {
					return s;
				}
			}
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		
		String cadena = "";
		
		if (socios.isEmpty()) {
			return "Este club deportivo no tiene socios actualmente.";
		} else {
			cadena += nombre + ": \n";
			for (Socio s: socios) {
				cadena += s + "\n";
			}
		}
		
		return cadena;
	}
}
