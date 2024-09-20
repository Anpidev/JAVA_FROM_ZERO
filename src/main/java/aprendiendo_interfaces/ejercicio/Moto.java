package aprendiendo_interfaces.ejercicio;

public class Moto implements Vehiculo{

    // Constructor
    public Moto(int velocidad_inicio, String color, String modelo) {
        this.velocidad_actual = velocidad_inicio;
        this.color = color;
        this.modelo = modelo;
    }

    // Implementación de la interfaz
    @Override
    public String plazas() {
        return "Tiene dos plazas.";
    }

    @Override
    public String acelerar(int incremento) {
        if (velocidad_actual + incremento >= VELOCIDAD_MAXIMA) {
            velocidad_actual = VELOCIDAD_MAXIMA;
            return "Ha alcanzado la velocidad máxima 120 km/h";
        }
        velocidad_actual += incremento;
        return "Su velocidad es " + velocidad_actual + " km/h";
    }

    @Override
    public String frenar(int decremento) {
        if (velocidad_actual - decremento <= 0) {
            velocidad_actual = 0;
            return "Su moto se ha detenido";
        }
        velocidad_actual -= decremento;
        return "Su velocidad es " + velocidad_actual + " km/h";
    }

    // Getters and setters
    public int getVelocidad_actual() {
        return velocidad_actual;
    }

    public void setVelocidad_actual(int velocidad_actual) {
        this.velocidad_actual = velocidad_actual;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


//Campos de clase 
    private int velocidad_actual;
    private String color;
    private String modelo;

}
