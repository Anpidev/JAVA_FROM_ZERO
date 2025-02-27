package archivosExternos; // Define el paquete donde se encuentra la clase

import java.io.File; // Importa la clase File para manejar archivos y directorios
import java.io.FileWriter; // Importa FileWriter para escribir en archivos
import java.io.IOException; // Importa IOException para manejar posibles errores de entrada/salida
import javax.swing.JOptionPane; // Importa JOptionPane para mostrar cuadros de diálogo

public class EjercicioRecopilatorio { // Define la clase principal

    public static void main(String[] args) {
        // Solicita al usuario el nombre del directorio que desea crear
        String directorio = JOptionPane.showInputDialog("Introduzca el nombre del directorio que quiere crear");

        // Solicita al usuario el nombre del archivo a crear (sin la extensión)
        String archivo = JOptionPane.showInputDialog("Introduzca el nombre del archivo que quiere crear (sin extensión)");

        // Solicita al usuario el texto que quiere añadir al archivo
        String texto = JOptionPane.showInputDialog("Escriba el texto que quiere añadir");

        // Llama a la función para crear el directorio y guarda la referencia a la ruta creada
        File rutaDirectorio = crearDirectorio(directorio);

        // Llama a la función para crear el archivo dentro del directorio especificado
        File archivoFinal = crearArchivo(rutaDirectorio, archivo);

        // Llama a la función para escribir el texto en el archivo recién creado
        añadirTexto(archivoFinal, texto);
    }

    /**
     * Crea un directorio dentro de la ruta especificada en el USB.
     * @param directorio Nombre del directorio a crear.
     * @return Objeto File con la referencia al directorio creado.
     */
    private static File crearDirectorio(String directorio) {
        // Define la ruta donde se creará el directorio en el USB
        File ruta = new File("/media/anpiarur/USB-DATA/" + directorio);

        // Verifica si el directorio ya existe; si no, lo crea
        if (!ruta.exists()) {
            ruta.mkdir(); // Crea el directorio
        }

        return ruta;  // Retorna el objeto File con la ruta del directorio creado
    }

    /**
     * Crea un archivo dentro del directorio especificado.
     * @param directorio Directorio donde se creará el archivo.
     * @param nombreArchivo Nombre del archivo sin extensión.
     * @return Objeto File con la referencia al archivo creado.
     */
    private static File crearArchivo(File directorio, String nombreArchivo) {
        // Crea un objeto File con la ruta del archivo y le añade la extensión .txt
        File archivo = new File(directorio, nombreArchivo + ".txt");

        try {
            // Intenta crear el archivo
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getAbsolutePath());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            // Captura posibles errores al crear el archivo
            System.out.println("Error al crear el archivo.");
            e.printStackTrace();
        }

        return archivo;  // Retorna el objeto File con la referencia al archivo creado
    }

    /**
     * Escribe el texto proporcionado dentro del archivo especificado.
     * @param archivo Archivo donde se escribirá el texto.
     * @param texto Contenido a escribir en el archivo.
     */
    private static void añadirTexto(File archivo, String texto) {
        // Utiliza FileWriter en un bloque try-with-resources para asegurar el cierre del recurso
        try (FileWriter writer = new FileWriter(archivo)) {
            writer.write(texto); // Escribe el texto en el archivo
            System.out.println("Texto añadido correctamente.");
        } catch (IOException e) {
            // Captura posibles errores al escribir en el archivo
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}


