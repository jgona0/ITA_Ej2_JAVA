/*
 * Segon exercici IT ACADEMY
 * Xavi Gonzalez JAVA-1
 */

import java.util.*;

public class SegonExerciciApp {

	public static void main(String[] args) {

	
		/*----------
		-- FASE 1 --
		----------*/
		System.out.println(" Fase 1:");
		
		// Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra
		char[] nom = {'X', 'A', 'V', 'I'};
		
		// Mediante for-each
		for (char element: nom) {
			
			System.out.println(element);
		}
		
		/* forma de hacerlo con "for"
		
		for (int i=0; i < nom.length; i++) {
			
			System.out.println(nom[i]);
		}
		*/
		
		
		/*----------
		-- FASE 2 --
		----------*/
		System.out.println(" \n Fase 2:");
		
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
		
		
		/*----------
		-- FASE 3 --
		----------*/
		System.out.println(" \n Fase 3:");
		
		// Creem un hashmap
		HashMap <Character, Integer> nom_hashmap = new HashMap <Character, Integer> ();
		
		//insertem la info de les llistes anteriors
		for (int i=0; i<nom_lista.size(); i++) {
			
			if(nom_hashmap.containsKey(nom_lista.get(i))) {
				
				nom_hashmap.put(nom_lista.get(i), nom_hashmap.get(nom_lista.get(i))+1);
				
			}
			else {
				
				nom_hashmap.put(nom_lista.get(i), 1);
			}
		}
		
		System.out.println(Arrays.asList(nom_hashmap));
		
		
		/*----------
		-- FASE 4 --
		----------*/
		System.out.println(" \n Fase 4:");
		
		//creem una llista amb el cognom i li afegim les lletres
		List<Character> cognom_lista = new ArrayList<Character>();
		
		cognom_lista.add('G');
		cognom_lista.add('O');
		cognom_lista.add('N');
		cognom_lista.add('Z');
		cognom_lista.add('A');
		cognom_lista.add('L');
		cognom_lista.add('E');
		cognom_lista.add('Z');
		
		// creem una llista per posar tot el nom sencer
		List<Character> fullname_lista  = new ArrayList<Character>();
		
		fullname_lista.addAll(nom_lista);
		fullname_lista.add(' ');
		fullname_lista.addAll(cognom_lista);
		
		
		for (int i = 0; i < fullname_lista.size(); i++) {
			
			System.out.print("'"+fullname_lista.get(i)+"' " );
			
		}
		
	}
}