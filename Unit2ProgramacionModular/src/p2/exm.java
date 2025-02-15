package p2;

import java.util.Random;
public class exm {

	public static void main(String[] args) {
		
		Random random = new Random();
		System.out.println(random.nextDouble(20.0, 30.7));
		System.out.println(random.nextInt(20, 100));
		
//		int cuenta = 0;
//		for (int a = 0; a <= 500; a++) {
//			if (cuenta < 10) {
//				if (esTriangular(a)) {
//					System.out.print(a + " ");
//					cuenta++;
//				}
//			} else if (cuenta == 10) {
//				break;
//			}
//		}
		
	}
	
	public static boolean esTriangular(int numero) {
		int suma = 0;
		for (int a= 1; a <= numero; a++) {
			if (suma == numero) {
				return true;
			} else {
				suma = suma + numero;				
			}
		}
		return false;                 
	}
}
