package scanner;
import java.util.Scanner;

/**
Ejercicio 4
Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.
 */
public
        class Consola4 {
  public static
          void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Introduzca un número");
            int num1= sc.nextInt();
            System.out.println("Introduzca un segundo número");
            int num2=sc.nextInt();
            sc.close();
            int suma= num1+num2;
            int resta= num1-num2;
            int multi= num1*num2;
            double division= (double)num1/num2;
            
            System.out.printf("El primer numero es %d y el segundo numero es %d. "
                    + "La suma de los numeros es %d, su resta es %d, su multiplicación es %d y"
                    + " la division %.4f",num1,num2,suma,resta,multi,division);
      }
  
}
