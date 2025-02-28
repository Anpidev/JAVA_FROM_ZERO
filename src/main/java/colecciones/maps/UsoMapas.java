package colecciones.maps;

import java.util.HashMap;
import java.util.Map;

public class UsoMapas {

	public static void main(String[] args) {
		HashMap<String, Empleados> listaEmpleadosHashMap = new HashMap<String, Empleados>();
		listaEmpleadosHashMap.put("100", new Empleados("Angela"));
		listaEmpleadosHashMap.put("200", new Empleados("Maria"));
		listaEmpleadosHashMap.put("300", new Empleados("Luis"));
		listaEmpleadosHashMap.put("400", new Empleados("Antonio"));
		listaEmpleadosHashMap.put("600", new Empleados("Paco"));

		System.out.println(listaEmpleadosHashMap);
		listaEmpleadosHashMap.remove("300");
		System.out.println(listaEmpleadosHashMap);
		//Se puede sobreescribir un key-value
		listaEmpleadosHashMap.put("300", new Empleados("Luisa"));
		System.out.println(listaEmpleadosHashMap);
		
		for (Map.Entry<String, Empleados> entry : listaEmpleadosHashMap.entrySet()) {
			String key = entry.getKey();
			Empleados val = entry.getValue();
			System.out.println("Clave: "+key+" Valor: "+val);
			
		}
	}

}
class Empleados {

	public Empleados(String nombre) {
		super();
		this.nombre = nombre;
		salario=2000;
	}
	
	@Override
	public String toString() {
		return "Empleado [Nombre=" + nombre +", salario="+salario +"]";
	}
	
	
	
	private String nombre;
	private double salario;
}