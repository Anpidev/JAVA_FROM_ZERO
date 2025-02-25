package basico.condicionales;

import java.util.Scanner;

/**
 * Ejercicio 24 Escribe un programa que genere la nómina (bien desglosada) de un
 * empleado según las siguientes condiciones: • Se pregunta el cargo del
 * empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto), los días
 * que ha estado de viaje visitando clientes durante el mes y su estado civil (1
 * - Soltero, 2 - Casado). • El sueldo base según el cargo es de 950, 1200 y
 * 1600 euros según si se trata de un prog. junior, un prog. senior o un jefe de
 * proyecto respectivamente. • Por cada día de viaje visitando clientes se pagan
 * 30 euros extra en concepto de dietas. Al sueldo neto hay que restarle el
 * IRPF, que será de un 25% en caso de estar soltero y un 20% en caso de estar
 * casado.
 *
 * @author angelaruiz
 */
public class Condicionales24 {

  public static void main(String[] args) throws Exception {

    // Inicializacion de datos pedidos por pantalla y declaración
    Scanner sc = new Scanner(System.in);
    System.out.println("Programa de nóminas");
    System.out
        .println("Marque el número según el cargo del empleado%n 1-Programador junior%n 2-Programador senior%n 3-Jefe");
    int cargo = sc.nextInt();
    System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
    int dias = sc.nextInt();
    sc.nextLine();// VACIAR BUFFER
    System.out.println("¿Está soltero o casado?");
    String estadoCivil = sc.nextLine();
    sc.close();

    // Inicialización de datos
    int base;
    int viajes;
    int brutos;
    String irpf;
    double retencion;
    double neto;

    // Ejecución
    switch (cargo) {
      case 1:
        base = 950;
        break;
      case 2:
        base = 1200;
        break;
      case 3:
        base = 1600;
        break;
      default:
        throw new Exception("Cargo mal introducido");
    }
    viajes = dias * 30;
    brutos = base + viajes;

    switch (estadoCivil) {
      case "soltero":
        irpf = "25%";
        retencion = (double) (brutos * 25) / 100;
        neto = brutos - retencion;
        break;
      case "casado":
        irpf = "20%";
        retencion = (double) (brutos * 20) / 100;
        neto = brutos - retencion;
        break;
      default:
        throw new Exception("Estado civil mal introducido");
    }

    // Resultados
    System.out.println("---------------------------------------");
    System.out.printf("||Sueldo base             %7d   ||%n", base);
    System.out.printf("||Dietas (%2d viajes)     %7d    ||%n", dias, viajes);
    System.out.println("||----------------------------------||");
    System.out.printf("||Sueldo bruto            %7d   ||%n", brutos);
    System.out.printf("||Retencion IRPF (%s)      %7.2f ||%n", irpf, retencion);
    System.out.println("||----------------------------------||");
    System.out.printf("||Sueldo neto                %7.2f||%n", neto);
    System.out.println("----------------------------------------");
  }
}
