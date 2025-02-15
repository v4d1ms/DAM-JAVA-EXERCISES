import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class principal {

	public static void main(String[] args) {
		
		// Ejemplos de ArrayList y LinkedList
		
		// creamos array list y agregamos datos
		ArrayList<String> listaCadena = new ArrayList<String>();
		listaCadena.add("bmw");
		listaCadena.add("mercedes");
		listaCadena.add("bugatti veiron");

		// eliminacion de elementos de una lista
		
		listaCadena.remove(1);
	
		// lectura del array list
		
		// bucle for-each 
		System.out.println("Recorrido por bucle for");
		for (String l: listaCadena) {
			System.out.println(l);
		}
		
		// for each
		System.out.println("Recorrido ArrayList for each");
		listaCadena.forEach(p -> {
			System.out.println(p);
		});
		
		// iterator
		System.out.println("Recorrido de ArrayList por iteradir");
		Iterator<String> iterador = listaCadena.iterator();
		
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		
		
		// ejemplo linked list 
		
		LinkedList<String> listCadena = new LinkedList<String>(listaCadena);
		
		System.out.println(listCadena.toString());
		
		Collections.sort(listCadena);
		
		System.out.println(listCadena);
		
		Collections.sort(listCadena, Collections.reverseOrder());
		
		
		
		
		
		
		
			
//		HashMap<String, Integer> personas = new HashMap<String, Integer>();
//				// 	 key     value
//		personas.put("Vadim", 21);
//		personas.put("dasdas", 22);
//		personas.put("Vadddddim", 23);
//		
//		// Mostramos todo el hashmap
//		System.out.println(personas.toString());
//		
//		// mostrando los valores
//		for (Integer p : personas.values()) {
//			System.out.println(p);
//		}
//
//		// mostrando la key
//		for (String n : personas.keySet()) {
//			System.out.println(n);
//		}
	}
}
