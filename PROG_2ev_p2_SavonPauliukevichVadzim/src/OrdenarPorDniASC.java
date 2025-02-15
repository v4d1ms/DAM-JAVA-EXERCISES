import java.util.Comparator;

public class OrdenarPorDniASC implements Comparator<Socio>{

	@Override
	public int compare(Socio socio1, Socio socio2) {
		String dni1 = socio1.getDNI();
		String dni2 = socio2.getDNI();
		return dni1.compareTo(dni2);
	}

}
