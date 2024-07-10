package ejercicios_poo.herencias.animal;

public class Lagarto extends Animal{
    private String colorEscamas;

    public Lagarto (){
        super();
        this.colorEscamas="marrón";
    }

    public Lagarto(Sexo sexo){
        super(sexo);
        this.colorEscamas="marrón";
    }

    public Lagarto(Sexo sexo, String color){
        super(sexo);
        this.colorEscamas=color;
    }
    public String toString() {
        return super.toString()+
        "El color de las escamas del lagarto es : " + this.colorEscamas + 
        "\n*************************\n";
    }
// Métodos de acceso para el campo mamas fuera de esta clase 
public String getColor() {
    return colorEscamas;
}

public void setColorNuevo(String nuevoColor) {
    this.colorEscamas = nuevoColor;
}

public void getSol(){
    System.out.println("El lagarto se pone al sol");
}
    

}
