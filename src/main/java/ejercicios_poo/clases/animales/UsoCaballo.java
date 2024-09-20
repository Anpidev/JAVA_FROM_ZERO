package ejercicios_poo.clases.animales;

public class UsoCaballo {
    public static void main(String[] args) {
    
        Caballo caballoUno = new Caballo("Delito",  24);
        Caballo caballoDos = new Caballo("Azabache",  61);
        Caballo caballoTres= new Caballo("Luna", "Negro", 3, 10);
        
        System.out.println("Hola, me llamo " + caballoDos.getNombre());
        caballoDos.cabalga();
        caballoDos.relincha();
          
        System.out.println("Hola, yo soy " + caballoUno.getNombre());
        caballoUno.rumia();
        caballoUno.cabalga();

        caballoTres.setNombre("Noche");
        System.out.println(caballoTres.getDatos());
      }
    }

