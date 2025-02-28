package colecciones.coleccionSet;

import java.util.Objects;

public class Clientes {

	
	public Clientes(String nombre, String cuenta, double saldo) {
		super();
		this.nombre = nombre;
		this.cuenta = cuenta;
		this.saldo = saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cuenta);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		return Objects.equals(cuenta, other.cuenta);
	}


	private String nombre;
	private String cuenta;
	private double saldo;
}
