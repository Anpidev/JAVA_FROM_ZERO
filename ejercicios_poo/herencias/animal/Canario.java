package ejercicios_poo.herencias.animal;

public class Canario extends Ave{
    private String colorPlumas;

    public Canario(String color){
        super();
        this.colorPlumas=color;
    }

    public Canario(Sexo sexo){
        super(sexo);
        this.colorPlumas="amarillo";
    }

    public String toString() {
        return super.toString()+
        "El color de las plumas del canario es : " + this.colorPlumas + 
        "\n*************************\n";
    }

    

}
