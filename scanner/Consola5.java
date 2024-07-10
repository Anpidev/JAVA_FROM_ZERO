package scanner;

import java.util.Scanner;
/**
Ejercicio 5
Escribe un programa que calcule el área de un rectángulo.
 */
public
        class Consola5 {
  public static
          void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Introduzca el ancho del rectángulo");
            double ancho=sc.nextDouble();
            System.out.println("Introduzca el largo del rectángulo");
            double largo= sc.nextDouble();
            sc.close();
            double resultado = largo*ancho;
            
            System.out.printf("El area del rectángulo es %.2f",resultado);
            
    
  }
  
}
