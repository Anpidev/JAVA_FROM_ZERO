package poo.clases.disco;

import java.util.Scanner;

public class UsoDiscos {

    public static void main(String[] args) {
        // N determina el tamaño del array
        final int N = 100;

        // Crea el array de discos
        Discos[] discos = new Discos[N];

        // Crea todos los discos que van en cada una de las celdas del array
        for (int i = 0; i < N; i++) {
            discos[i] = new Discos();
        }

        // Carga varios discos
        discos[0] = new Discos(
                "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
        discos[1] = new Discos(
                "FGHQ64", "Metallica", "Black album", "hard rock", 46);
        discos[2] = new Discos(
                "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

        int opcion;
        Scanner s = new Scanner(System.in);
        String codigoIntroducido;
        String autorIntroducido;
        String tituloIntroducido;
        String generoIntroducido;
        int duracionIntroducida;

        do {
            // Menú de opciones
            System.out.println("\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(s.nextLine());

            // Realiza la acción seleccionada
            switch (opcion) {
                case 1:
                    // Listado de discos
                    System.out.println("\nLISTADO");
                    System.out.println("=======");

                    for (Discos d : discos) {
                        if (!d.getCodigo().equals("LIBRE")) {
                            System.out.println(d);
                        }
                    }

                    break;

                case 2:
                    // Nuevo disco
                    System.out.println("\nNUEVO DISCO");
                    System.out.println("===========");

                    // Busca la primera posición libre del array
                    int primeraLibre = -1;
                    do {
                        primeraLibre++;
                    } while (!((discos[primeraLibre].getCodigo()).equals("LIBRE")));

                    // Introduce los datos del nuevo disco
                    System.out.println("Por favor, introduzca los datos del disco.");
                    System.out.print("Código: ");
                    codigoIntroducido = s.nextLine();
                    System.out.print("Autor: ");
                    autorIntroducido = s.nextLine();
                    System.out.print("Título: ");
                    tituloIntroducido = s.nextLine();
                    System.out.print("Género: ");
                    generoIntroducido = s.nextLine();
                    System.out.print("Duración: ");
                    duracionIntroducida = Integer.parseInt(s.nextLine());
                    discos[primeraLibre] = new Discos(
                            codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido,
                            duracionIntroducida);

                    break;

                case 3:
                    // Modificar disco
                    System.out.println("\nMODIFICAR");
                    System.out.println("===========");

                    System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
                    codigoIntroducido = s.nextLine();

                    int i = -1;
                    do {
                        i++;
                    } while (!((discos[i].getCodigo()).equals(codigoIntroducido)));

                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

                    // Modifica los datos del disco seleccionado
                    System.out.println("Código: " + discos[i].getCodigo());
                    System.out.print("Nuevo código: ");
                    codigoIntroducido = s.nextLine();
                    if (!codigoIntroducido.equals("")) {
                        discos[i].setCodigo(codigoIntroducido);
                    }

                    System.out.println("Autor: " + discos[i].getAutor());
                    System.out.print("Nuevo autor: ");
                    autorIntroducido = s.nextLine();
                    if (!autorIntroducido.equals("")) {
                        discos[i].setAutor(autorIntroducido);
                    }

                    System.out.println("Título: " + discos[i].getTitulo());
                    System.out.print("Nuevo título: ");
                    tituloIntroducido = s.nextLine();
                    if (!tituloIntroducido.equals("")) {
                        discos[i].setTitulo(tituloIntroducido);
                    }

                    System.out.println("Género: " + discos[i].getGenero());
                    System.out.print("Nuevo género: ");
                    generoIntroducido = s.nextLine();
                    if (!generoIntroducido.equals("")) {
                        discos[i].setGenero(generoIntroducido);
                    }

                    System.out.println("Duración: " + discos[i].getDuracion());
                    System.out.print("Duración: ");
                    final String duracionIntroducidaString = s.nextLine();
                    if (!duracionIntroducidaString.equals("")) {
                        discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
                    }

                    break;

                case 4:
                    // Borrar disco
                    System.out.println("\nBORRAR");
                    System.out.println("======");

                    System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
                    codigoIntroducido = s.nextLine();

                    i = -1;
                    do {
                        i++;
                    } while (!((discos[i].getCodigo()).equals(codigoIntroducido)));
                    discos[i].setCodigo("LIBRE");
                    System.out.println("Álbum borrado.");

                    break;

                default:
                    // No hacer nada si la opción no es válida
            } // switch
        } while (opcion != 5);

        s.close();
    }
}
