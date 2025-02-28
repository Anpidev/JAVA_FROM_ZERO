package colecciones.sobreescribiendoEquals;

import java.util.Objects;

public class Libros {
    private String nombre;
    private String autor;
    private Integer iBSMS;

    public Libros(String nombre, String autor, Integer iBSMS) {
        this.setNombre(nombre);
        this.setAutor(autor);
        this.iBSMS = iBSMS;
    }

    public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getiBSMS() {
        return iBSMS;
    }

    public void setiBSMS(Integer iBSMS) {
        this.iBSMS = iBSMS;
    }

	@Override
	public int hashCode() {
		return Objects.hash(iBSMS);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libros other = (Libros) obj;
		return Objects.equals(iBSMS, other.iBSMS);
	}

    
}

