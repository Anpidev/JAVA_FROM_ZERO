package poo.herencias.animal;

public class UsoAnimal {
    public static void main(String[] args) {
        // Crear instancias de la clase Gato con diferentes parámetros
        Gato garfield = new Gato(Sexo.MACHO, "romano");
        Gato tom = new Gato(Sexo.MACHO);
        Gato lisa = new Gato(Sexo.HEMBRA,6,"Europeo");
        Gato silvestre = new Gato();
        
        //Crear instancias de la clase Perro
        Perro ares= new Perro(Sexo.MACHO);
        // Crear instancia de la clase Pinguino 
        Pinguino pingu = new Pinguino(Sexo.HEMBRA);

        // Crear instancia de la clase Ave 
        Ave miLoro = new Ave();

        //Crear instancia de la clase Canario
        Canario piolin = new Canario("multicolor");


        //Crear instancia de la clase Lagarto
        Lagarto gecko= new Lagarto(Sexo.HERMAFRODITA);
        

        // Imprimir información de cada animal
        System.out.println(garfield);
        System.out.println(tom);
        System.out.println(lisa);
        System.out.println(silvestre);
        System.out.println(ares);
        System.out.println(piolin);
        System.out.println(gecko);
        //Cambio de color del lagarto
        gecko.setColorNuevo("morado");
        System.out.println(gecko);

        //Llamar a los métodos de ave
        miLoro.aseate(); // Limpia al loro
        miLoro.vuela(); // Hace volar al loro

        //Métodos de clases hijas de Ave
        pingu.aseate(); // Limpia al pingüino
        pingu.vuela(); // Indica que el pingüino no puede volar
        piolin.vuela(); // Indica que si puede volar

        //Sacar metodo estático de mamifero
        System.out.println(Mamifero.getMamiferoMama());

        //Método de lagarto
        gecko.getSol();


    }
}
