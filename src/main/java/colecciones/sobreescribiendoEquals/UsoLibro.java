package colecciones.sobreescribiendoEquals;

public class UsoLibro {

	public static void main(String[] args) {
		Libros libro1 = new Libros("Java", "Oracle", 1010);
		Libros libro2 = new Libros("Java", "Oracle", 1010);
		Libros libro3= new Libros("Java", "Oracle", 1020);
		
		if	(libro1.equals(libro2)) System.out.println("Son el mismo libro"); 
		if	(libro1.equals(libro3)) System.out.println("Son el mismo libro");
		else System.out.println("No son el mismo libro");
	}

}
