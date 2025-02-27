package serializando;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Recuperando {

    public static void main(String[] args) {
        try {
            ObjectInputStream flujentrada = new ObjectInputStream(new FileInputStream("/media/anpiarur/USB-DATA/serializado.dat"));
        
            Empleado entradaObjeto [] = (Empleado[]) flujentrada.readObject();

            // Mostrar los datos recuperados
            for (Empleado e : entradaObjeto) {
                System.out.println(e);
            }

            flujentrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) { // Necesario para readObject()
            e.printStackTrace();
        }
    }
}

