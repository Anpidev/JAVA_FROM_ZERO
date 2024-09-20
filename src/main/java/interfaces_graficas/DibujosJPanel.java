package interfaces_graficas;

import java.awt.Color; // Importar clase Color para establecer el color del fondo
import java.awt.Graphics; // Importar clase Graphics para realizar dibujos
import java.awt.Image; // Importar clase Image para manejar imágenes
import java.io.File; // Importar clase File para manejar archivos
import java.io.IOException; // Importar clase IOException para manejar errores de entrada/salida

import javax.imageio.ImageIO; // Importar clase ImageIO para leer imágenes
import javax.swing.JFrame; // Importar clase JFrame para crear ventanas
import javax.swing.JPanel; // Importar clase JPanel para crear paneles

public class DibujosJPanel {
    public static void main(String[] args) {
        // Crear un objeto MarcoDibujo y establecer la operación de cierre
        MarcoDibujo miMarco = new MarcoDibujo();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establecer la operación de cierre para salir al
                                                                // cerrar la ventana
    }
}

class MarcoDibujo extends JFrame {
    public MarcoDibujo() {
        // Establecer las dimensiones y posición de la ventana
        setBounds(400, 200, 600, 450);
        setTitle("Escribiendo en un marco"); // Establecer el título de la ventana
        setVisible(true); // Hacer la ventana visible

        // Crear un objeto DibujoPanel y agregarlo al marco
        DibujoPanel miPanel = new DibujoPanel();
        add(miPanel); // Añadir el panel a la ventana
    }

    // Clase interna para el panel de dibujo
    class DibujoPanel extends JPanel {
        public DibujoPanel() {
            // Establecer el color de fondo del panel
            setBackground(new Color(195));
        }

        @Override
        public void paintComponent(Graphics g) {
            // Llamar al método paintComponent de la clase padre para pintar el fondo
            super.paintComponent(g);

            // Crear un objeto File con la ruta de la imagen
            File miImagen = new File("/home/Anpiarur/VSC/JAVA_FROM_ZERO/interfaces_graficas/pata.png");
            try {
                // Intentar leer la imagen desde el archivo
                imagen = ImageIO.read(miImagen);
            } catch (IOException e) {
                // Manejar la excepción si la imagen no se encuentra
                System.out.println("Lo siento, la imagen no se ha encontrado");
            }

            // Obtener la anchura de la imagen
            int anchuraImagen = imagen.getWidth(this);
            // Obtener la altura de la imagen
            int alturaImagen = imagen.getHeight(this);

            // Dibujar la imagen en el panel en la posición (0, 0)
            g.drawImage(imagen, 0, 0, null);

            // Bucle para copiar la imagen en una cuadrícula
            for (int i = 0; i < 600; i++) {
                for (int j = 0; j < 300; j++) {
                    // Copiar el área de la imagen dentro del panel
                    g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen * i, alturaImagen * j);
                }
            }
        }

        private Image imagen; // Variable para almacenar la imagen
    }
}
