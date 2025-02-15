package E2X03;

public class Tiempo {
	private int horas;
	private int minutos;
	private int segundos;
	
	
	public Tiempo(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public static boolean validar(int horas, int minutos, int segundos) {
		if (horas <= 23 && horas >= 0 && minutos <= 59 && minutos >= 0 && segundos <= 59 && segundos >= 0) {
			return true;
		}
		return false;
	}
	
	public boolean sumar(Tiempo otro) {
		int segundo = this.segundos + otro.segundos;
		int minuto = this.minutos + otro.minutos;
		int horas = this.horas + otro.horas;
		boolean calculado = false;
		
		if (segundo >= 60) {
			segundo = segundo - 60;
			minuto++;
		}
		
		if (minuto >= 60) {
			minuto = minuto -60;
			horas++;
		}
		
		if (horas < 24) {
			this.segundos = segundo;
			this.minutos = minuto;
			this.horas = horas;
			calculado = true;
		} 
		return calculado;
	}
	
	public boolean restar(Tiempo otro) {
		int segundo = this.segundos - otro.segundos;
		int minuto = this.minutos - otro.minutos;
		int horas = this.horas - otro.horas;
		boolean calculado = false;
		
		if (segundo < 0) {
			segundo = segundo + 60;
			minuto--;
		}
		
		if (minuto < 0) {
			minuto = minuto + 60;
			horas--;
		}
		
		if (horas >= 0) {
			this.segundos = segundo;
			this.minutos = minuto;
			this.horas = horas;
			calculado = true;
		}
		return calculado;
	}
	
	public String devolverEstado() {
		return String.format("%02dh:%02dm:%02ds", this.horas, this.minutos, this.segundos);
	}
}