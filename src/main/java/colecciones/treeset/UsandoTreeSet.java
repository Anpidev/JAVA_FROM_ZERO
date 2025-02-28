package colecciones.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class UsandoTreeSet {

	public static void main(String[] args) {

		TreeSet<String> gente = new TreeSet<String>();
		gente.add("Juan");
		gente.add("Maria");
		gente.add("Ana");
		gente.add("Pepe");
		gente.add("Luis");

		for (String string : gente) {
			// Lo imprime en orden alfabetico ya que String ya tiene definido el metodo
			// compareTo (ordenamiento natural)
			System.out.println(string);
		}

		Producto comparadProducto = new Producto();
		TreeSet<Producto> productos = new TreeSet<Producto>(comparadProducto);
		Producto jabon = new Producto(2, "jabon de manos");
		Producto lavavajillas = new Producto(4, "jabon de cocina");
		Producto suavizante = new Producto(3, "suavizante ropa");
		Producto vinagre = new Producto(20, "vinagre de cocina para limpiar");
		Producto champu = new Producto(12, "gel de pelo");

		productos.add(jabon);
		productos.add(lavavajillas);
		productos.add(vinagre);
		productos.add(suavizante);
		productos.add(champu);

		for (Producto producto : productos) {
			// Sale en orden segun la descripcion gracias a sobreescribir el metodo
			// compareTo (ordenamiento no natural)
			System.out.println(producto.getDescripcion());
		}

	}

}

class Producto implements Comparable<Producto>, Comparator<Producto> {
	public Producto() {
	}

	public Producto(int numeroProducto, String descripcion) {
		super();
		this.numeroProducto = numeroProducto;
		this.descripcion = descripcion;
	}

	@Override
	public int compareTo(Producto o) {
		return this.numeroProducto - o.numeroProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public int compare(Producto o1, Producto o2) {
		int caracteres1=o1.getDescripcion().length();
		int caracteres2=o2.getDescripcion().length();
		if (caracteres1 < caracteres2) {
	        return -1;
	    } else if (caracteres1 > caracteres2) {
	        return 1;
	    } else {
	        return 0;
	    }
	}

	private int numeroProducto;
	private String descripcion;
}
