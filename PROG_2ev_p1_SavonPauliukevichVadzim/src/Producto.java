import java.util.Random;

public class Producto {
	
	public static int totalCodigo = 0;
	private static Random aleatorio = new Random();
	private String nombre;
	private double precio;
	private int diasCaducidad;
	private int codigo;
	
	
	public static String generarNombre() {
		String nombre = "";
		
		nombre += (char) aleatorio.nextInt(65, 68);
		
		if (aleatorio.nextInt(1, 3) == 2) {
			nombre += "PER";
		} else {
			nombre += "NOP";
		}
		
		nombre += String.format("%04d", aleatorio.nextInt(1, 10000));
		
		return nombre;
	}


	public Producto() {
		this.codigo = totalCodigo;
		this.nombre = generarNombre();
		this.diasCaducidad = aleatorio.nextInt(-50, 368);
		this.precio = aleatorio.nextDouble(1, 21);
		totalCodigo++;
	}
	
	public int getDias() {
		return diasCaducidad;
	}
	
	public boolean esPercedero() {
		if (nombre.contains("PER")) {
			return true;
		}
		return false;
	}
	
	public boolean haCaducado() {
		if (this.getDias() <= 0 && this.esPercedero()) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Producto [" 
				+ "Codigo = " + codigo 
				+ "Nombre= " + nombre 
				+ ", precio= " + precio 
				+ ", Caduca en = " + diasCaducidad 
				+ "]";
	}

}
