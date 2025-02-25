package arreglos.arrays.unidimensional;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejercicio 15
Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
como máximo e intente de nuevo”. Para el grupo que llega, se busca
siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
programa se ilustra a continuación:
 */
public class Array15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mesas[] = new int[10];
        boolean correcto = false;

        // Inicializar las mesas con valores aleatorios entre 0 y 4
        for (int i = 0; i < 10; i++) {
            mesas[i] = (int) (Math.random() * 5);
            System.out.print("La mesa " + (i + 1) + " tiene " + mesas[i] + " personas\n");
        }

        // Solicitar la cantidad de personas hasta que se ingrese un valor válido
        while (!correcto) {
            try {
                System.out.println("¿Cuantas personas son?");
                int personas = sc.nextInt();

                if (personas > 0 && personas <= 4) {
                    correcto = true;

                    // Buscar la primera mesa libre o con espacio suficiente para el grupo
                    for (int i = 0; i < mesas.length; i++) {
                        if (mesas[i] == 0 || (mesas[i] + personas <= 4 && mesas[i] > 0)) {
                            mesas[i] += personas;
                            System.out.print("Por favor siéntese en la mesa" + (i + 1) + "\n");
                            break; // Para salir del bucle no es necesario seguir buscando mesa
                        }
                    }

                    // Mostrar el estado actual de las mesas
                    for (int i = 0; i < mesas.length; i++) {
                        System.out.print("La mesa " + (i + 1) + " tiene " + mesas[i] + " personas\n");
                    }
                } else {
                    System.out.println("Lo siento, solo admitimos grupos de 1 a 4 personas. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Introduzca un número entero.");
                sc.next(); // Limpiar el búfer del scanner
            }
        }

        sc.close();
    }
}
