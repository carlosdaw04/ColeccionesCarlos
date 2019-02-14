package Ejercicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Palabra {
	Map<Integer, Set<String>> mapa = new HashMap<Integer, Set<String>>();
	
	public void addPalabra(String palabra) {
		int l = palabra.length();
		Set s = mapa.get(l);
//		if(s==null)
		if(!mapa.containsKey(l)) {
			s = new TreeSet<String>();
			mapa.put(l, s);
		}
		s.add(palabra);
	}
	
	public Set<String> conjunto(int l){
		return mapa.get(l);
	}
	
	public static void main(String[] args) {
		Palabra p = new Palabra();
		p.addPalabra("Hola");
		p.addPalabra("Adios");
		p.addPalabra("Melocoton");
		p.addPalabra("Jamon");
		p.addPalabra("Raro");
		p.addPalabra("Pelota");
		p.addPalabra("Fuerza");
		
		Set<String> s = p.conjunto(4);
		Iterator<String> i = s.iterator();
		while(i.hasNext()) {
			String palabra = i.next();
			System.out.println(palabra);
		}
//		System.out.println(s);
//		
//		System.out.println(p.conjunto(5));
	}
}
