package Ejercicios;

import java.util.ArrayList;

public class Palabras {

	String cadena;
	public Palabras(String cadena) {
		this.cadena = cadena;
	}
	
	public ArrayList<String> palabrasNoRepetidas(String cadena) {
		ArrayList<String> pl = new ArrayList<String>();
		String[] cadenapartida = cadena.split(" ");
		
		for(int i=0; i<cadenapartida.length; i++) {
			if(!cadenapartida[i].equals(pl)) {
				pl.add(cadenapartida[i]);
			}
		}
		return pl;
	}
}
