package E1X01;

public class Videojuego {

	private String name;
	private String dev;
	private int ano;
	private int maxplayers;

	// constructor
	public Videojuego(String name, String dev, int ano, int maxplayers) {
		this.name = name;
		this.dev = dev;
		this.ano = ano;
		this.maxplayers = maxplayers;
	}
	
	public Videojuego(String name, String dev, int ano) {
		this.name = name;
		this.dev = dev;
		this.ano = ano;
		this.maxplayers = 1;
	}

	public Videojuego(String name, String dev) {
		this.name = name;
		this.dev = dev;
		this.ano = 2021;
		this.maxplayers = 1;
	}
	
	public String returnVideojuego() {
		return "Videojuego [Nombre=" + name + " Desarrollador=" + dev + "Año=" + ano + " Jugadores Maximos=" + maxplayers + "]"; 
	}
}
