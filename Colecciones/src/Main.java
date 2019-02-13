import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class Main {
	
//	private static int [] numeros = {3, 7, 2, 9, 8, 6, 4, 5, 1};
	private static int [] numeros = {10, 3, 201, 4, 957, 2, 87, 531, 402, 27, 95};
	
	public static void main(String[] arg) {
		//Colecciones LISTAS
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		//Coleccion QUEUE (cola)
		Queue<Integer> queue = new LinkedList<Integer>();		//LinkedList con una cola
		
		//Colecciones SET
		HashSet<Integer> hashSet = new HashSet<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		for(int i=0; i<numeros.length; i++) {
			arrayList.add(numeros[i]);
			linkedList.add(numeros[i]);
			queue.add(numeros[i]);
			hashSet.add(numeros[i]);
			treeSet.add(numeros[i]);
		}
		
		mostrarColeccion(arrayList);
		mostrarColeccion(linkedList);
		mostrarColeccion(queue);
		mostrarColeccion(hashSet);
		mostrarColeccion(treeSet);
	}
	
	static void mostrarColeccion(Collection<Integer> c) {
		System.out.println(c.getClass().getSimpleName() + ": " + c.size() + " elementos");
		Iterator<Integer> i = c.iterator();
		while(i.hasNext()) {
			Integer numero = i.next();
			System.out.print(numero);
			if(i.hasNext()) {
				System.out.print(", ");	
			}
		}
		System.out.println();
	}
	
}
