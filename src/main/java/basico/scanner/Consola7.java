package basico.scanner;
import java.util.Scanner;

/**
Ejercicio 7
Escribe un programa que calcule el total de una factura a partir de la base
imponible.

 */
public
        class Consola7 {
  public static
          void main(String[] args) {
            Scanner s= new Scanner(System.in);
            System.out.println("Introduzca la base imponible");
            double base=s.nextDouble();
          s.close();
            double iva= (base*21)/100;
            double resultado= base+iva;
    
    System.out.println("Su factura da : "+resultado);
  }
  
}
