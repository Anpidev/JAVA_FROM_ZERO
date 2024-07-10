package bucles;

/**
 * Ejercicio 22 Muestra por pantalla todos los números primos entre 2 y 100,
 * ambos incluidos.
 *
 * @author angelaruiz
 */
public class Bucles22 {

  public static void main(String[] args) {

    int numeroMin = 2;
    int numeroMax = 100;

    System.out.println("Los números primos entre 2 y 100 son: ");

    for (int numeroActual = numeroMin; numeroActual <= numeroMax; numeroActual++) {
      boolean esPrimo = true; // SE PONE AQUI PARA QUE CADA VEZ QUE EMPIECE EL CICLO SE REINICE CON CADA
                              // NUMERO
      if (numeroActual > 1) {
        for (int i = 2; i < numeroActual; i++) {
          if ((numeroActual % i) == 0) {
            esPrimo = false;
            break;// Si ya no es primo, no es necesario seguir verificando

          }
        }

      } else {
        esPrimo = false; // Números menores o iguales a 1 no son primos
      }
      if (esPrimo) {
        System.out.print(numeroActual + " ");
      }

    }
  }

}
