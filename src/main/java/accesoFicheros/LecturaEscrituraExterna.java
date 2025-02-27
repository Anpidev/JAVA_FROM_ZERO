package accesoFicheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LecturaEscrituraExterna {

    public static void main(String[] args) {
        Ficheros fichero = new Ficheros();
        fichero.leerArchivo();
        fichero.escribirArchivo();
    }
}

class Ficheros {
    private final String ruta = "/media/anpiarur/USB-DATA/gus.png";
    private String rutaCopia = "/media/anpiarur/USB-DATA/gusClone.png";
    private final ArrayList<Integer> arrayList = new ArrayList<>();

    public void leerArchivo() {
        try (FileInputStream lecturaFileInputStream = new FileInputStream(ruta)) {
            int byteImgEntrada;
            
            while ((byteImgEntrada = lecturaFileInputStream.read()) != -1) {
                arrayList.add(byteImgEntrada);
            }
            lecturaFileInputStream.close();
            System.out.println("Bytes leídos: " + arrayList.size());
        } catch (IOException e) {
            System.out.println("No se ha encontrado el fichero");
            e.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
    	 
    	
    	try {
			FileOutputStream escrituraFileOutputStream = new FileOutputStream(rutaCopia);
			for (Integer integer : arrayList) {
				escrituraFileOutputStream.write(integer);
			}
			escrituraFileOutputStream.close();
		} catch (IOException e) {
			System.out.println("No se ha podido copiar el fichero");
			e.printStackTrace();
		}
    }
}
