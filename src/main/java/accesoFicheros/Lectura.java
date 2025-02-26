package accesoFicheros;

import java.io.FileReader;
import java.io.IOException;

public class Lectura {

	public static void main(String[] args) {
		LeerFichero fichero = new LeerFichero();
		fichero.leerDatos();
	}
}

class LeerFichero {
	public void leerDatos() {
		// Se usa try-with-resources para cerrar automáticamente el FileReader
		try (FileReader entrada = new FileReader(System.getProperty("user.home") + "/Documentos/stream.txt")) {
			int caracter;
			while ((caracter = entrada.read()) != -1) {  // Leer carácter por carácter
				System.out.print((char) caracter);  // Imprimir sin salto de línea
			}
			entrada.close();
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
			e.printStackTrace();
		}
	}
}
