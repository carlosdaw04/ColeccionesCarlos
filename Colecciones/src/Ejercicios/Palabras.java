package Ejercicios;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Palabras {
	
	Set<String> sinRepetir = new HashSet<String>();
	Set<String> repetidas = new HashSet<String>();
	
	public Palabras(String s) {
		String palabra = "";
		for(int i=0; i<s.length(); i++) {
			char c = s.toLowerCase().charAt(i);
			if(Character.isAlphabetic(c)) {
				palabra+= c;
				if(i == s.length()-1 || !Character.isAlphabetic(s.charAt(i+1))) {
					if(sinRepetir.contains(palabra)) {
						repetidas.add(palabra);
						sinRepetir.remove(palabra);
					}else {
						sinRepetir.add(palabra);
					}
					palabra = "";
				}
			}
		}
	}
	
	public Set<String> getSinRepetir() {
		return sinRepetir;
	}
	
	public Set<String> getRepetidas() {
		return repetidas;
	}

	public static void main(String[] args) {
		Palabras p = new Palabras("Esto es una prueba es");
		System.out.println("Sin repetir: ");
		mostrarColeccion(p.getSinRepetir());
		System.out.println("Repetidas: ");
		mostrarColeccion(p.getRepetidas());
	}
	
	static void mostrarColeccion(Collection<String> c) {
		System.out.println(c.getClass().getSimpleName() + ": " + c.size() + " elementos");
		Iterator<String> i = c.iterator();
		while (i.hasNext()) {
			String s = i.next();
			System.out.print(s);
			if (i.hasNext())
				System.out.print(" ");
		}
		System.out.println();
	}
}
