package scanner;
import java.util.Scanner;

/**
Ejercicio 2
Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
 */
public
        class Consola2 {
  public static
          void main(String[] args) {
    double pesetas=136.66;
    Scanner s = new Scanner (System.in);
    System.out.println("Introduzca la cantidad de euros a convertir");
    double euros = s.nextDouble();
    s.close();
            
    
    double resultado=euros*pesetas;
    System.out.printf("La cantidad introducida de %f euros, es %f pesetas",euros, resultado);
  }
  
}
