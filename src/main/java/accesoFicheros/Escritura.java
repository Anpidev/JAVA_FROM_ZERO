package accesoFicheros;

import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

    public static void main(String[] args) {
        Escribir escritor = new Escribir();
        escritor.escribiendo();
        System.out.println("Archivo escrito con éxito.");
    }
}

class Escribir {
    
    public void escribiendo() {
        String texto = "Estamos escribiendo a través de Streams";
        String ruta = System.getProperty("user.home") + "/Documentos/streamNuevo.txt"; 
        
        try (FileWriter documento = new FileWriter(ruta)) {
            documento.write(texto);
            System.out.println("Texto escrito en " + ruta);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
