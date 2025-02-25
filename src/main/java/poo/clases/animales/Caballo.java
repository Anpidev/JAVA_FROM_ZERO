package ejercicios_poo.clases.animales;

public class Caballo {

    private String nombre;
    private String color;
    private int edad;
    private int carrerasGanadas;

    Caballo(String nombre, String color, int edad, int carrera) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.carrerasGanadas = carrera;
    }

    Caballo (String nombre, int carrera){
        this.nombre=nombre;
        this.carrerasGanadas=carrera;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCarrerasGanadas() {
        return "Las carreras ganadas de " + this.nombre + " son " + this.carrerasGanadas;
    }

    public String getDatos() {
        return "El caballo se llama " + this.nombre +
                " ,su color es " + this.color +
                " ,tiene " + this.edad + " años" +
                " y ha ganado " + this.carrerasGanadas + " carreras";
    }

    public void cabalga() {
        System.out.println("El caballo cabalga");
    }

    public void relincha() {
        System.out.println("El caballo relincha");
    }

    public void rumia() {
        System.out.println("El caballo rumia");
    }
}