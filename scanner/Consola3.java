package scanner;
import java.util.Scanner;
/**
Ejercicio 3
Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.
 */
public
        class Consola3 {
  public static
          void main(String[] args) {
    double euros= 0.0060;
    Scanner s = new Scanner (System.in);
    System.out.println("Introduce la cantidad de pesetas a convertir");
    double pesetas= s.nextDouble();
    s.close();
    double resultado= pesetas*euros;
    
    System.out.printf("Las pesetas introducidas %.2f son %.2f euros",pesetas, resultado);
    
  }
  
}
