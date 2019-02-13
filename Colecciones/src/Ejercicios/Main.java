package Ejercicios;

public class Main {
	public static void main(String[] args) {
		//EJERCICIO 2 (CUENTATEXTO)
		CuentaTexto ct = new CuentaTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
//		System.out.println("Número de veces la letra dada: " + ct.numeroVecesLetra2('s'));
		ct.numeroVecesLetra('s');
		System.out.println("Número de palabras: " + ct.numeroPalabras(ct.cadena));	
		System.out.println("Número de letras: " + ct.numeroLetras(ct.cadena));
		
		
		//EJERCICIO 3 (PALABRAS)
//		Palabras p = new Palabras("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
//		System.out.println(p.palabrasNoRepetidas(p.cadena));
	}
}
