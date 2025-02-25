package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 30 Realiza un programa que calcule las horas transcurridas entre
 * dos horas de dos días de la semana. No se tendrán en cuenta los minutos ni
 * los segundos. El día de la semana se puede pedir como un número (del 1 al 7)
 * o como una cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario
 * introduce los datos correctamente y que el segundo día es posterior al
 * primero. Ejemplo: Por favor, introduzca la primera hora. Día: lunes Hora: 18
 * Por favor, introduzca la segunda hora. Día: martes Hora: 20 Entre las 18:00h
 * del lunes y las 20:00h del martes hay 26 hora/s.
 *
 * @author angelaruiz
 */
public class Bucles30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primerDia = 0;
        int segundoDia = 0;
        int primeraHora = 0;
        int segundaHora = 0;
        String primerDiaString;
        String segundoDiaString;
        String nombrePrimerDia = "";
        String nombreSegundoDia = "";
        boolean datosCorrectos = true;

        do {
            System.out.println("Por favor, introduzca la primera hora.");

            boolean diaCorrecto;

            // Primer día
            do {
                diaCorrecto = true;
                System.out.print("Día: ");
                primerDiaString = sc.nextLine();

                switch (primerDiaString.toLowerCase()) {
                    case "lunes":
                    case "1":
                        primerDia = 1;
                        nombrePrimerDia = "lunes";
                        break;
                    case "martes":
                    case "2":
                        primerDia = 2;
                        nombrePrimerDia = "martes";
                        break;
                    case "miércoles":
                    case "3":
                        primerDia = 3;
                        nombrePrimerDia = "miércoles";
                        break;
                    case "jueves":
                    case "4":
                        primerDia = 4;
                        nombrePrimerDia = "jueves";
                        break;
                    case "viernes":
                    case "5":
                        primerDia = 5;
                        nombrePrimerDia = "viernes";
                        break;
                    case "sábado":
                    case "6":
                        primerDia = 6;
                        nombrePrimerDia = "sábado";
                        break;
                    case "domingo":
                    case "7":
                        primerDia = 7;
                        nombrePrimerDia = "domingo";
                        break;
                    default:
                        diaCorrecto = false;
                        System.out.println("Día no válido. Inténtelo de nuevo.");
                }

            } while (!diaCorrecto);

            // Primera hora
            boolean horaCorrecta;
            do {
                horaCorrecta = true;
                System.out.print("Hora: ");
                primeraHora = sc.nextInt();
                sc.nextLine(); // Consumir la nueva línea pendiente

                if (primeraHora < 0 || primeraHora > 23) {
                    System.out.println("Hora no válida. Inténtelo de nuevo.");
                    horaCorrecta = false;
                }

            } while (!horaCorrecta);

            System.out.println("Por favor, introduzca la segunda hora.");

            // Segundo día
            do {
                datosCorrectos = true;

                diaCorrecto = true;

                System.out.print("Día: ");
                segundoDiaString = sc.nextLine();

                switch (segundoDiaString.toLowerCase()) {
                    case "lunes":
                    case "1":
                        segundoDia = 1;
                        nombreSegundoDia = "lunes";
                        break;
                    case "martes":
                    case "2":
                        segundoDia = 2;
                        nombreSegundoDia = "martes";
                        break;
                    case "miércoles":
                    case "3":
                        segundoDia = 3;
                        nombreSegundoDia = "miércoles";
                        break;
                    case "jueves":
                    case "4":
                        segundoDia = 4;
                        nombreSegundoDia = "jueves";
                        break;
                    case "viernes":
                    case "5":
                        segundoDia = 5;
                        nombreSegundoDia = "viernes";
                        break;
                    case "sábado":
                    case "6":
                        segundoDia = 6;
                        nombreSegundoDia = "sábado";
                        break;
                    case "domingo":
                    case "7":
                        segundoDia = 7;
                        nombreSegundoDia = "domingo";
                        break;
                    default:
                        segundoDia = 0;
                        System.out.println("Día no válido. Inténtelo de nuevo.");
                }

                if (!diaCorrecto) {
                    System.out.println("No se ha introducido correctamente el día de la semana.");
                    System.out.println(
                            "Los días válidos son: lunes, martes, miércoles, jueves, viernes, sábado y domingo.");
                }

            } while (!diaCorrecto);

            // Comprobar que el segundo día sea posterior al primero
            if (segundoDia <= primerDia) {
                System.out.println("El segundo día debe ser posterior al primero.");
                datosCorrectos = false;
            }

            // Segunda hora
            if (datosCorrectos) {
                do {
                    horaCorrecta = true;
                    System.out.print("Hora: ");
                    segundaHora = sc.nextInt();
                    sc.nextLine(); // Consumir la nueva línea pendiente

                    if (segundaHora < 0 || segundaHora > 23) {
                        System.out.println("Hora no válida. Inténtelo de nuevo.");
                        horaCorrecta = false;
                    }
                } while (!horaCorrecta);
            }

        } while (!datosCorrectos);

        System.out.print("Entre las " + primeraHora + ":00h del " + nombrePrimerDia);
        System.out.print(" y las " + segundaHora + ":00h del " + nombreSegundoDia);
        System.out
                .println(" hay " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " hora/s.");

        sc.close();
    }
}
