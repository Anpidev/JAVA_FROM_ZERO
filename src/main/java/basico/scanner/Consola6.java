package basico.scanner;
import java.util.Scanner;

/**
Ejercicio 6
Escribe un programa que calcule el área de un triángulo.
 */
public
        class Consola6 {
  public static
          void main(String[] args) {
            
            Scanner sc = new Scanner (System.in);
            System.out.println("Introduzca la base del triangulo");
            double base = sc.nextDouble();
            System.out.println("Introduzca la altura del triangulo");
            double altura=sc.nextDouble();
            sc.close();
            double resultado=(base*altura)/2;
            
            System.out.println("El area del triangulo es: "+resultado);
   
  }
  
}
