package basico.scanner;


import java.util.Scanner;

/**

Ejercicio 1
Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.

 */
public
        class Consola1 {
  public static
          void main(String[] args) {
            Scanner s= new Scanner(System.in);
            System.out.println("Introduzca un número");
            int num1=s.nextInt();
            System.out.println("Introduzca un segundo número");
            int num2=s.nextInt();
            int resultado=num1*num2;
            s.close();
    
    System.out.printf("El resultado del primero numero %d y el segundo numero %d es %d",num1,num2,resultado);
  }
  
}
