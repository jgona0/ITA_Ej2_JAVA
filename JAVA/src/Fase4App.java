/*
 * Segon exercici IT ACADEMY
 * Xavi Gonzalez JAVA-1
 */

import java.util.*;

public class Fase4App {

	public static void main(String[] args) {


		List<Character> nom_lista = new ArrayList<Character>();
		
		nom_lista.add('X');
		nom_lista.add('7');
		nom_lista.add('V');
		nom_lista.add('I');
		
		
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