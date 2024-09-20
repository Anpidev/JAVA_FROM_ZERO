package aprendiendo_interfaces.ejercicio;

public interface Vehiculo {
    final int VELOCIDAD_MAXIMA=120;

    public String plazas();
    public String acelerar(int incremento);
    public String frenar(int incremento);

}
