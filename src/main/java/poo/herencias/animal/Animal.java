package poo.herencias.animal;

public class Animal {
    
    // Campos de la clase
    private Sexo sexo;
    
    // Constructores
    public Animal() {
        this.sexo = Sexo.MACHO;
    }
    
    public Animal(Sexo sexo) {
        this.sexo = sexo;
    }
    
    // Métodos
    public Sexo getSexo() {
        return sexo;
    }
    
    public String toString() {
        return "Sexo: " + this.sexo + "\n";
    }
    
    /**
    * Hace que el animal se eche a dormir.
    */
    public void duerme() {
        System.out.println("Zzzzzzz");
    }
}