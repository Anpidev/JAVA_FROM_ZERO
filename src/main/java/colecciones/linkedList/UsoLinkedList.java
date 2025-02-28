package colecciones.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class UsoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <String>personas= new LinkedList<String>();
		personas.add("Ana");
		personas.add("Juan");
		personas.add("Marcos");
		personas.add("Angela");
		personas.add("Adrian");
		personas.add("Maria");
		personas.add("Pedro");
		System.out.println(personas.size());
		
		ListIterator<String> iterator = personas.listIterator();
		iterator.next();
		iterator.add("Pepe");
		
		
		for (String string : personas) {
			System.out.println(string);
		}
	}

}
