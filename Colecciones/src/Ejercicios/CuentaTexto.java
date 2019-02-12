package Ejercicios;

public class CuentaTexto {
	
	String cadena;
	
	public CuentaTexto(String cadena) {
		this.cadena = cadena;
	}

	
	public int numeroPalabras(String letra) {
		int n_palabras = 0;
		String[] cadenapartida = new String[cadena.length()];
		cadenapartida = cadena.split(" ");
		
		n_palabras = cadenapartida.length;
		return n_palabras;
	}
	
	public int numeroLetras(String cadena) {
		int n_letras = 0;
		char[] arraycadena = cadena.toCharArray();
		for(int i=0; i<cadena.length(); i++) {
			if(arraycadena[i] != ' ') {
				n_letras++;
			}
		}
		return n_letras;
	}
	
	
	public void numeroVecesLetra(char c) {
		int contador = 0;
		this.cadena = cadena.toLowerCase();
		for(int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i) == c) {
				contador++;
			}
		}
		System.out.println("Número de veces la letra " + c +" : "+ contador);
	}
	
	public int numeroVecesLetra2(char c) {
		int contador = 0;
		this.cadena = cadena.toLowerCase();
		for(int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i) == c) {
				contador++;
			}
		}
		return contador;
	}

}
