package colecciones.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class EjercicioLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> paises = new LinkedList<String>();
		LinkedList<String> capitales = new LinkedList<String>();
		
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mejico");
		paises.add("Peru");
		
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("DF");
		capitales.add("Lima");
		
		ListIterator<String>itpaises=paises.listIterator();
		ListIterator<String>itcapitales=capitales.listIterator();
		
		//Añadir capitales a la lista de paises de forma secuencial pais con su capital
		while (itcapitales.hasNext()) {
			if (itpaises.hasNext()) itpaises.next();
			itpaises.add(itcapitales.next());	
		}
		System.out.println(paises);
		
		//Dejar solo las capitales en posiciones pares
		//Sobreescribimos el iterador para que vuelva a la posicion de inicio
		itcapitales=capitales.listIterator();
		
		while (itcapitales.hasNext()) {
			itcapitales.next();
			if (itcapitales.hasNext()) {
				itcapitales.next();
				itcapitales.remove();
			}
			
		}
		System.out.println(capitales);
		
	}

}
