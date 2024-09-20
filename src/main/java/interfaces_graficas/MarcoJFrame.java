package interfaces_graficas;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarcoJFrame extends JFrame {

    public MarcoJFrame() {
        // Configurar el marco principal
        setBounds(300, 300, 800, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel contenedor con GridLayout para organizar las láminas
        JPanel contenedor = new JPanel();
        contenedor.setLayout(new GridLayout(1, 2)); // Una fila, dos columnas

        // Crear instancias de las láminas
        LaminaJPanel miLamina = new LaminaJPanel();
        Lamina2D miLamina2D = new Lamina2D();
        miLamina2D.setBackground(Color.PINK);

        // Agregar las láminas al contenedor
        contenedor.add(miLamina);
        contenedor.add(miLamina2D);

        // Agregar el contenedor al marco
        add(contenedor);

        // Hacer visible el marco
        setVisible(true);
    }
}