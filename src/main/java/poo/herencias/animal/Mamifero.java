package poo.herencias.animal;

public class Mamifero extends Animal {

    private int mamas;

public Mamifero(Sexo sexo,int mamas){
    super(sexo);
    this.mamas=mamas;

}

public Mamifero(){
    this.mamas=6;

}

public Mamifero(Sexo sexo){
    super(sexo);
    this.mamas=6;
}

public  static String getMamiferoMama(){
    return "La cría mama de su madre";
}
public String toString() {
    return super.toString() // Llama al método toString() de la clase base (Animal)
    +"Es un mamífero con "+this.mamas+ " mamas";
}


    // Métodos de acceso para el campo mamas fuera de esta clase 
    public int getMamas() {
        return mamas;
    }

    public void setMamas(int mamas) {
        this.mamas = mamas;
    }

}
