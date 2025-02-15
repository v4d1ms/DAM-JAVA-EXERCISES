package E3XPlataforma;

public class Catalogo {
	
	private Video[] videos;
	private int indice;
	
	public Catalogo(int cantidad) {
		this.videos = new Video[cantidad];
		this.indice = 0;
	}
	
	public boolean insertar(Video video) {
		if (indice < videos.length) {			
			videos[indice] = video; 
			indice++;
			return true;
		} 
		return false;
	}
	
	public Catalogo peliculasdeDirector(String director) {
		
		Catalogo peliculas = new Catalogo(indice);
		
		for (int i = 0; i < indice; i++) {
			if (videos[i] instanceof Pelicula) {
				if (((Pelicula) videos[i]).getDirector().equals(director)) {
					peliculas.insertar(videos[i]);
				}
			}
		}
		
		return peliculas;
	}
	
	public Catalogo seriesPorAgnoInicioEmision(int agno) {
		Catalogo series = new Catalogo(indice);
		for (int i = 0; i < indice; i++) {
			if (videos[i] instanceof Serie) {
				if (((Serie) videos[i]).getInicioEmision() == agno) {
					series.insertar(videos[i]);
				}
			}
		}
		return series;
	}
	
	public int obtenerPosicionVideoPorCodigo(int codigo) {
		for (int i = 0; i < indice; i++) {
			if (videos[i].getCodigo() == codigo) {
				return i;
			}
		}
		
		return -1;
	}
	
	public boolean eliminarCodigo(int codigo) {
		int posicion = this.obtenerPosicionVideoPorCodigo(codigo);
		
		if (posicion < indice && posicion >= 0) {			
			videos[posicion] = null;
			for (int i = posicion; i < indice - 1; i++) {
				videos[i] = videos[i + 1];
			}
			indice--;		
			return true;
		}
		return false;
	}
	
	public boolean organizarModificando() {
		
		Video[] backup = new Video[videos.length];
		int numero = 0;
		
		if (indice > 1) {			
			for (int i = 0; i < indice; i++) {
				if (videos[i] instanceof Pelicula) {
					backup[numero] = videos[i];
					numero++;
				}
			}
			
			for (int i = 0; i < indice; i++) {
				if (videos[i] instanceof Serie) {
					backup[numero] = videos[i];
					numero++;
				}
			}
			
			videos = backup;
			
			return true;
		}
		
		return false;
	}
	
	
	public Catalogo organizar() {
		Catalogo auxiliar = new Catalogo(indice);
		if (indice > 0) {
			for (int i = 0; i < indice; i++) {
				if (videos[i] instanceof Pelicula) {
					auxiliar.insertar(videos[i]);
				}
			}
			
			for (int i=0; i < indice; i++) {
				if (videos[i] instanceof Serie) {					
					auxiliar.insertar(videos[i]);
				}
			}
			
		}
 		return auxiliar;
	}
	
	public boolean estaVacio() {
		return (indice == 0);
	}
	
	@Override
	public String toString() {
		String cadena = "";
		
		if (indice == 0 ) {
			return "Este catalogo no tiene videos..";
		} else {
			for (int i = 0; i < indice; i++) {
				cadena += videos[i].toString() + "\n";
			}
		}
		
		return cadena;
	}
}
