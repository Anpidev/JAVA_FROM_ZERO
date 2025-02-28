package colecciones.coleccionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UsoClientes {

	public static void main(String[] args) {
		Clientes cliente1= new Clientes("Ana Lopez", "001", 1500) ;
		Clientes cliente2= new Clientes("Maria Ruiz", "002", 3000) ;
		Clientes cliente3= new Clientes("Cristian Gomez", "003", 1000) ;
		Clientes cliente4= new Clientes("Juan Lopez", "004", 500) ;
		Clientes cliente5= new Clientes("Manuel Berlanga", "005", 20500) ;
		Clientes cliente6= new Clientes("Manuel Berlanga", "005", 20500) ;
		
		Set<Clientes> clientesBanco = new HashSet<Clientes>();
		clientesBanco.add(cliente1);
		clientesBanco.add(cliente2);
		clientesBanco.add(cliente3);
		clientesBanco.add(cliente4);
		clientesBanco.add(cliente5);
		clientesBanco.add(cliente6);
		//NO agrega el cliente 6 porque es el mismo cliente (HashCode = cuenta)
		
		
		/*for (Clientes clientes : clientesBanco) {
			System.out.println(clientes.getNombre());
		}*/
		
		//USANDO ITERATOR
		Iterator<Clientes> iterator = clientesBanco.iterator();
		while (iterator.hasNext()) {
		    Clientes clientes = iterator.next();
		    
		    if (clientes.getNombre().equals("Ana Lopez")) {
		        iterator.remove(); // 
		    } else {
		        System.out.println(clientes.getNombre()); // 
		    }
		}

		
	}

}
