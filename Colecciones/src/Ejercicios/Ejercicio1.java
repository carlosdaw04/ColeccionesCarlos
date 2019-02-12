package Ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Ejercicio1 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>(100);
//		List<Integer> lista = new ArrayList<Integer>();
		Random r = new Random();
		
		for(int i=0; i<100; i++) {
			lista.add(r.nextInt(100)+1);
		}
		
//		Collections.sort(lista);
		
		mostrarColeccion(lista);
		
		Set<Integer> set = new HashSet<Integer>(lista);
//		Set<Integer> set = new HashSet<Integer>(lista);
		
		mostrarColeccion(set);
	}
	
	static void mostrarColeccion(Collection<Integer> c) {
		Iterator<Integer> i = c.iterator();
		while(i.hasNext()) {
			Integer numero = i.next();
			if(i.hasNext()) {
				System.out.print(numero + ", ");	
			}else {
				System.out.print(numero);	
			}
		}
		System.out.println();
		System.out.println("Numero de elementos: " + c.size());
	}
}
