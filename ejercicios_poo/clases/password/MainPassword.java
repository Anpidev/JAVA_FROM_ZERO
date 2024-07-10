package ejercicios_poo.clases.password;

import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {

        //Petición por Scanner de los datos necesarios
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escriba cuantas contraseñas quiere crear");
        int numeroCreadas=sc.nextInt();
        System.out.println("Escriba la longitud de las contraseñas a crear");
        int longitud=sc.nextInt();
        sc.close();


        //Creación del array de contraseñas
        Password []passwords= new Password [numeroCreadas];

        for (int i = 0; i < numeroCreadas; i++) {
            passwords[i]=new Password(longitud);
        }

        //Mostras datos de las contraseña

        for (Password password : passwords) {
           System.out.println(password.toString()); 
        }
    }

}
