package Ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio1 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
//		List<Integer> lista = new ArrayList<Integer>();
		Set<Integer> hash = new HashSet<Integer>(lista);
		Set<Integer> tree = new TreeSet<Integer>(lista);
		Random r = new Random();
		
		for(int i=0; i<100; i++) {
			lista.add(r.nextInt(1000)+1);
		}
		
		mostrarColeccion(lista);
		mostrarColeccion(hash);		//No salen ordenados.
		mostrarColeccion(tree);		//Salen ordenados.
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
