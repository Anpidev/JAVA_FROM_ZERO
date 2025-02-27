package accesoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaBuffer {

    public static void main(String[] args) {
        LeerFicheroBuffer fichero = new LeerFicheroBuffer();
        fichero.leerBuffer();
    }
}

class LeerFicheroBuffer {
    public void leerBuffer() {
        String ruta = System.getProperty("user.home") + "/Documentos/stream.txt";

        try (FileReader entrada = new FileReader(ruta);
             BufferedReader miBufferedReader = new BufferedReader(entrada)) {

            String linea;
            while ((linea = miBufferedReader.readLine()) != null) {
                System.out.println(linea);  // Usa println para evitar "null" al final
            }

        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
            e.printStackTrace();
        }
    }
}
