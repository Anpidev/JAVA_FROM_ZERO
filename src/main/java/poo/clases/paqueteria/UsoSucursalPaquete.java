package poo.clases.paqueteria;

import java.util.Scanner;

public class UsoSucursalPaquete {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sucursal, paquetes, referencia, prioridad;
        String direccion, ciudad, dni;
        double peso;

        // Solicitar información sobre la sucursal al usuario
        System.out.println("Por favor, ingrese el número de sucursal: ");
        sucursal = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        System.out.println("Ingrese la dirección: ");
        direccion = sc.nextLine();

        System.out.println("Ingrese la ciudad: ");
        ciudad = sc.nextLine();

        // Crear una instancia de la clase Sucursal con los datos proporcionados por el usuario
        Sucursal primera = new Sucursal(sucursal, direccion, ciudad);

        // Solicitar información sobre los paquetes al usuario
        System.out.println("Ingrese el número de paquetes a realizar: ");
        paquetes = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        Paquete paquete[] = new Paquete[paquetes];

        for (int i = 0; i < paquetes; i++) {
            System.out.println("Paquete número: "+(i+1));
            System.out.println("Ingrese la referencia del envío: ");
            referencia = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            System.out.println("Ingrese el DNI del remitente: ");
            dni = sc.nextLine();

            System.out.println("Ingrese peso del paquete: ");
            peso = sc.nextDouble();
            sc.nextLine(); // Limpiar el buffer

            // Validar la prioridad ingresada por el usuario
            do {
                System.out.println("Ingrese la prioridad del envío (0=Normal, 1=Alta, 2=Urgente): ");
                prioridad = sc.nextInt();
                if (prioridad < 0 || prioridad > 2) {
                    System.out.println("¡Error! Prioridad incorrecta. Por favor, vuelva a intentarlo.");
                }
            } while (prioridad < 0 || prioridad > 2);

            // Crear una instancia de la clase Paquete con los datos proporcionados por el usuario
            paquete[i] = new Paquete(referencia, peso, dni, prioridad);
        }

        // Mostrar la información de la sucursal
        System.out.println("Los datos de la sucursal son:");
        System.out.println("Número de sucursal: " + primera.getNumeroSucursal());
        System.out.println("Dirección: " + primera.getDireccion());
        System.out.println("Ciudad: " + primera.getCiudad());

        // Mostrar la información de los paquetes
        System.out.println("Los datos de los paquetes son:");
        for (int i = 0; i < paquetes; i++) {
            System.out.println("Paquete número: " + (i + 1));
            System.out.println("Precio: " + primera.precio(paquete[i]));
            System.out.println("Prioridad: " + paquete[i].getPrioridad());
            System.out.println("Peso: " + paquete[i].getPeso());
        }

        sc.close(); // Cerrar el Scanner al finalizar
    }
}