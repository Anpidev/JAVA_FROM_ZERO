package ejercicios_poo.herencias.animal;

public class Ave extends Animal {
    
    // Constructor que recibe el sexo del ave
    public Ave(Sexo sexo) {
        super(sexo); // Llama al constructor de la clase base (Animal) con el sexo proporcionado
    }
    
    // Constructor sin parámetros
    public Ave() {
        super(); // Llama al constructor sin parámetros de la clase base (Animal)
    }
    
    // Método que hace que el ave se limpie
    public void aseate() {
        System.out.println("Me estoy limpiando las plumas");
    }
    
    // Método que hace que el ave levante el vuelo
    public void vuela() {
        System.out.println("Estoy volando");
    }
}
