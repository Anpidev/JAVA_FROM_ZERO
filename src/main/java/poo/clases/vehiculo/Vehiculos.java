package poo.clases.vehiculo;

public class Vehiculos {

    public Vehiculos() { 
      /*   Constructor de la clase. Mismo nombre que la clase, sin paso de parametros,
        metodo muy rigido.*/
        ruedas = 4;
        largo = 2;
        ancho = 1;
        peso = 2;
        color = "sin color";
    }

    public Vehiculos(int ruedas){
        this.ruedas=ruedas;
        largo = 2;
        ancho = 1;
        peso = 2;
        color = "sin color";

    }

    public void setColor(String color) { // Por convención en Java a los metodos setter se les llama
                                                 // set+propiedad a cambiar
        // String color es pasar parametros al metodo (el argumento)

        this.color = color; //this. hace referencia al campo de clase, a la propiedad.
        /*
         * El metodo setter establece el valor de la propiedad
         * color="azul";
         */
    }

    public String getColor() { // nombrado igualmente por convención, metodo getter.
        // El metodo getter devuelve el valor de la propiedad
        return color;
    }

    public String getDatosVehiculo(){
        return "Tu vehículo tiene "+ruedas+
        " ruedas ademas tiene "+largo+" metros de largo";
    }

    //Se declara private para que no se pueda modificar desde fuera, se encapsula.
    private int ruedas; // private solo se puede usar desde esta clase
    private String color;
    private int largo;
    private int ancho;
    private int peso;
}
