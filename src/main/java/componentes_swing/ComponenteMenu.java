package componentes_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ComponenteMenu {

    public static void main(String[] args) {
        MarcoMenu miMarco = new MarcoMenu();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoMenu extends JFrame {
    public MarcoMenu() {
        setBounds(500, 500, 700, 600);
        add(new LaminaMarco());
        setVisible(true);

    }
}

class LaminaMarco extends JPanel {
    public LaminaMarco() {

        JMenuBar miBarra = new JMenuBar();

        // -------------------ELEMENTOS DEL MENÚ------------------------------

        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edición");
        JMenu herramientas = new JMenu("Herramientas");

        // Añadir al menú los elementos

        miBarra.add(archivo);
        miBarra.add(edicion);
        miBarra.add(herramientas);

        // ------------SUBELEMENTOS DEL ARCHIVO ---------------------------------------
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarComo = new JMenuItem("Guardar como...");
        archivo.add(guardar);

        //Añadir evento
        guardarComo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has pulsado en Guardar como");
            }
            
        });
        archivo.add(guardarComo);

        // -------------------SUBELEMENTOS DE
        // EDICIÓN------------------------------------
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);

        // ----------------------SUBMENU PARA HERRAMIENTAS---------------------------
        // Primero elemento Opciones
        JMenuItem opciones = new JMenuItem("Opciones");
        herramientas.add(opciones);

        // Añadimos separador
        herramientas.addSeparator();
        // Segundo submenu y elementos para preferencias
        JMenu preferencias = new JMenu("Preferencias");
        herramientas.add(preferencias);
        JMenuItem generales = new JMenuItem("Generales");
        JMenuItem ayuda = new JMenuItem("Ayuda");
        preferencias.add(generales);
        preferencias.add(ayuda);

        // Añadir a la lamina
        add(miBarra);

    }

   
}