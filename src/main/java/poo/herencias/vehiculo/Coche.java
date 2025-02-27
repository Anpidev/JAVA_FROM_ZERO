package poo.herencias.vehiculo;

class Coche extends Vehiculo {
    Coche(String color, String modelo, int year,int cilindrada) {
        super(color, modelo, year);
    }

    public void andar() {
        System.out.println("¡Andando con el coche!");
    }

    public void quemarRueda() {
        System.out.println("¡Quemando rueda con el coche!");
    }
}