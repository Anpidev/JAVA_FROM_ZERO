package poo.herencias.animal;

public class Perro extends Mamifero{

    private Hocico hocico;

    public Perro(){
        super();
       this.hocico=Hocico.MESOCÉFALO;
    }

    public Perro(Sexo sexo){
        super(sexo);
       this.hocico=Hocico.MESOCÉFALO;
    }

    public Perro (Sexo sexo, Hocico hocico){
        super(sexo);
        this.hocico=hocico;
    }

    public Perro(Sexo sexo, Hocico hocico, int mamas){
        super(sexo, mamas);
        this.hocico=hocico;
    }

    public void perroLadra(){
System.out.println("El perro dice: Guaauu!!");
    }

    // Método toString() para obtener una representación de cadena del perro
    public String toString() {
        return super.toString() // Llama al método toString() de la clase base (Animal)
                + "\nHocico: " + this.hocico +
                 "\n*************************\n"; // Agrega información del hocico del perro
    }
}
