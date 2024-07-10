package ejercicios_poo.clases.tiempo;

public class UsoTiempo {
public static void main(String[] args) {
     // Crear objetos de la clase Tiempo
     Tiempo t1 = new Tiempo(1, 20, 30);
     Tiempo t2 = new Tiempo(10, 30, 40);
     Tiempo t3 = new Tiempo(20, 35, 20);

     // Sumar los intervalos de tiempo
     t1.setSuma(t2.horas, t2.minutos, t2.segundos);
     t2.setSuma(22,3 , 5);
     t3.setResta(5, 0, 5);

     // Imprimir el resultado
     System.out.println("Resultado de la suma: " + t1.toString());
     System.out.println("Resultado de la suma: " + t2.toString()); 
     System.out.println("Resultado de la resta: " + t3.toString());
 }
}

