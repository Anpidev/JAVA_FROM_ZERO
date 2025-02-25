package numeros_aleatorios;

import java.util.Scanner;

/**
 * Ejercicio 29
 * Realiza un programa que muestre la previsión del tiempo para mañana en
 * Málaga. Las temperaturas máxima y mínima se deben generar de forma
 * aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
 * últimas décadas para cada estación. La probabilidad de que esté soleado
 * o nublado en cada estación se proporciona a continuación. Obviamente, la
 * temperatura mínima deberá ser menor o igual que la temperatura máxima.
 * Ejemplo:
 * 1. Primavera
 * 2. Verano
 * 3. Otoño
 * 4. Invierno
 * Seleccione la estación del año (1-4): 4
 * Previsión del tiempo para mañana
 * --------------------------------
 * Temperatura mínima: 10oC
 * Temperatura máxima: 16oC
 * Nublado
 */

public class Num29 {
   public static void main(String[] args) {

      // DECLARACIÖN E INICIALIZACION DE VARIABLES
      Scanner sc = new Scanner(System.in);
      System.out.println("Seleccione la estación del año(1-4): "
            + "\n 1.Primavera \n 2.Verano \n 3.Otoño  \n 4.Invierno");
      int estacion = sc.nextInt();
      sc.close();

      double maxima = 0;
      double minima = 0;
      int probabilidad = (int) (Math.random() * 10 + 1);
      String solNube = " ";

      // EJECUCION
      switch (estacion) {
         case 1:
            maxima = 30;
            minima = 15;
            switch (probabilidad) {
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
                  solNube = "soleado";
                  break;
               case 7:
               case 8:
               case 9:
               case 10:
                  solNube = "nublado";
                  break;
               default:
                  break;
            }
            break;
         case 2:
            maxima = 45;
            minima = 25;
            switch (probabilidad) {
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
                  solNube = "soleado";
                  break;
               case 9:
               case 10:
                  solNube = "nublado";
                  break;
               default:
                  break;

            }
            break;
         case 3:
            maxima = 30;
            minima = 20;
            switch (probabilidad) {
               case 1:
               case 2:
                  solNube = "soleado";
                  break;
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:
               case 10:
                  solNube = "nublado";
                  break;
               default:
                  break;
            }
            break;
         case 4:
            maxima = 25;
            switch (probabilidad) {
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
                  solNube = "soleado";
                  break;
               case 7:
               case 8:
               case 9:
               case 10:
                  solNube = "nublado";
                  break;
               default:
                  break;
            }
            break;

         default:
            break;
      }

      // CALCULO DE TEMPERATURAS
      double temperaturaMaxima = Math.random() * (maxima - minima) + minima;
      double temperaturaMinima = Math.random() * (temperaturaMaxima - minima) + minima;

      // RESOLUCION
      System.out.println("Previsión del tiempo para mañana");
      System.out.println("-----------------------------------");
      System.out.printf("Temperatura mínima: %.2f°C%n", temperaturaMinima);
      System.out.printf("Temperatura máxima: %.2f°C%n", temperaturaMaxima);
      System.out.println(solNube);
   }
}
