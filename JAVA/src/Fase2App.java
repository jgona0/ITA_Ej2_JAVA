/*
 * Segon exercici IT ACADEMY
 * Xavi Gonzalez JAVA-1
 */

import java.util.*;

public class Fase2App {

	public static void main(String[] args) {
		
		// Canvia la taula per una llista (List<Character>)
		List<Character> nom_lista = new ArrayList<Character>();
		
		nom_lista.add('X');
		nom_lista.add('7');
		nom_lista.add('V');
		nom_lista.add('I');
		
		Character letra = nom_lista.get(0);
		
		// Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONANT’.
		// Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.

		for (int i = 0; i < nom_lista.size(); i++) {
			
			letra = nom_lista.get(i); 
			
			if(letra.isDigit(letra)) {
				
				System.out.println(letra + " Els noms de persones no contenen números!");
			}
			else {

				if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
					
					System.out.println(letra + " VOCAL");

				}
				else {
					System.out.println(letra + " CONSONANT");
				}

			}
			
		}
		
	}
}