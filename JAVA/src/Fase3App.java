/*
 * Segon exercici IT ACADEMY
 * Xavi Gonzalez JAVA-1
 */

import java.util.*;

public class Fase3App {

	public static void main(String[] args) {
		
		List<Character> nom_lista = new ArrayList<Character>();
		
		nom_lista.add('X');
		nom_lista.add('7');
		nom_lista.add('X');
		nom_lista.add('I');
		
		
		// Creem un hashmap
		HashMap <Character, Integer> nom_hashmap = new HashMap <Character, Integer> ();
		
		//insertem la info de les llistes anteriors i comptem si alguna lletra esta més d'una vegada
		for (int i=0; i<nom_lista.size(); i++) {
			
			if(nom_hashmap.containsKey(nom_lista.get(i))) {
				
				nom_hashmap.put(nom_lista.get(i), nom_hashmap.get(nom_lista.get(i))+1);
				
			}
			else {
				
				nom_hashmap.put(nom_lista.get(i), 1);
			}
		}
		
		System.out.println(Arrays.asList(nom_hashmap));

		
	}
}