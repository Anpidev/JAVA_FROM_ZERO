package archivosExternos;

import java.io.File;
import java.io.IOException;

public class CreandoDirectorios {

    public static void main(String[] args) {
        File directorio = new File("/media/anpiarur/USB-DATA/prueba/");
        
        if (!directorio.exists()) {
            directorio.mkdir(); // Crear directorio si no existe
        }

        // Forma correcta de construir la ruta del archivo
        File archivo = new File(directorio, "prueba.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado en: " + archivo.getAbsolutePath());
            } else {
                System.out.println("El archivo ya existe en: " + archivo.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
