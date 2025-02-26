package poo.herencias.vehiculo;

class Bicicleta extends Vehiculo {
    Bicicleta(String color, String modelo, int year, int pinones) {
        super(color, modelo, year);
        this.pinones=pinones;
    }

    public void andar() {
        System.out.println("¡Andando con la bicicleta!");
    }

    public void hacerCaballito() {
        System.out.println("¡Haciendo caballito con la bicicleta!");
    }

    private int pinones;
}