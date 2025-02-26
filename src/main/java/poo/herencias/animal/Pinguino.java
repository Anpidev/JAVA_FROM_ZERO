package poo.herencias.animal;

public class Pinguino extends Ave {
    
    // Constructor sin parámetros que llama al constructor sin parámetros de la clase base (Ave)
    public Pinguino() {
        super();
    }
    
    // Constructor que recibe el sexo del pingüino y llama al constructor de la clase base (Ave) con el sexo proporcionado
    public Pinguino(Sexo s) {
        super(s);
    }
    
    // Método sobreescrito que indica que el pingüino no puede volar
    @Override
    public void vuela() {
        System.out.println("No puedo volar");
    }
}
