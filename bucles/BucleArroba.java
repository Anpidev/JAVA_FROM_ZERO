package bucles;
/*En este ejercicio se pide al usuario que introduzca su dirección de email con ayuda de la clase
JOptionPane.
Una vez introducido el email, el programa debe decir si la dirección de email es correcta o no
teniendo en cuenta los siguientes requisitos:
1. Debe tener una @
2. No debe tener más de una @
3. Debe tener un punto
4. La dirección de email debe tener al menos 4 caracteres.
El programa pedirá introducir indefinidamente la dirección de email si no es correcta o si tienes
menos de 4 caracteres. */
import javax.swing.JOptionPane;

public class BucleArroba {
public static void main(String[] args) {

   
    boolean tieneArroba = false;
    boolean masDeUnaArroba = false;
    boolean tienePunto = false;
    String email;

    do {
         email = JOptionPane.showInputDialog("Introduzca su email: ");

        // Reiniciamos las variables en cada iteración del bucle
        tieneArroba = false;
        masDeUnaArroba = false;
        tienePunto = false;

        // Verificamos cada caracter del email
        for (int i = 0; i < email.length(); i++) {
            char caracter = email.charAt(i);

            if (caracter == '@') {
                if (!tieneArroba) {
                    tieneArroba = true;
                } else {
                    masDeUnaArroba = true;
                }
            } else if (caracter == '.') {
                tienePunto = true;
            }
        }

        // Verificamos las condiciones
        if (!tieneArroba) {
            System.out.println("El email debe contener al menos una '@'.");
        } else if (masDeUnaArroba) {
            System.out.println("El email no puede contener más de una '@'.");
        } else if (!tienePunto) {
            System.out.println("El email debe contener al menos un punto '.'.");
        } else if (email.length() < 4) {
            System.out.println("El email debe tener al menos 4 caracteres.");
        } else {
            System.out.println("Email correcto.");
        }

    } while (!tieneArroba || masDeUnaArroba || !tienePunto || email.length() < 4); // Continuar si no se cumplen todas las condiciones

}
}