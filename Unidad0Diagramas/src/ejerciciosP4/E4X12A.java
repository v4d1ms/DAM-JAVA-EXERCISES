package ejerciciosP4;

public class E4X12A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fahrenheit = 0;
		double kelvin = 0;
		
		System.out.printf("Celsius\t\tFahrenheit\t\tKelvin\n");
		for (int celsius = -20; celsius <= 100; celsius = celsius + 10) {
			fahrenheit = ((celsius  * 9) / 5 ) + 32;
			kelvin = (double) celsius + 273.15;
			System.out.printf("%d\t\t%d\t\t\t%d\n", celsius, fahrenheit, (int) kelvin);
		}
	}
}
