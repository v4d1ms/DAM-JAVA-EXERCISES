package E2X01;

public class Cuenta {
	
	private String cliente;
	private int cuenta;
	private double saldo;
	
	public Cuenta(String cliente, int cuenta) {
		this.cliente = cliente;
		this.cuenta = cuenta;
		this.saldo = 0.0;
	}

	public boolean ingresar(double saldo) {
		if (saldo > 0) {			
			this.saldo += saldo;
			return true;
		}
		return false;
	}
	
	public boolean retirar(double saldo) {
		if (saldo > 0 && saldo <= this.saldo) {			
			this.saldo -= saldo;
			return true;
		}
		return false;
	}
	
	public boolean transferir(Cuenta cuenta, double saldo) {
		if (saldo > 0 && this.saldo >= saldo) {			
			this.retirar(saldo);
			cuenta.ingresar(saldo);
			return true;
		}
		return false;
	}
	
	public String obtenerEstado() {
		return "Cliente [Cuenta = " + cuenta + 
				" Cliente = " + cliente + 
				" Saldo = " + String.format("%.2f", saldo) + " ]";
	}
}
