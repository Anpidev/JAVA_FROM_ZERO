package swing.componentes_swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EjercicioResumenComponentes1 {
    public static void main(String[] args) {
        Marco miMarco = new Marco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marco extends JFrame {
    public Marco() {
        setTitle("Ejercicio resumen de componentes Swing básico");
        setBounds(700, 200, 700, 500);
        add(new Lamina());
        setVisible(true);
    }

}

class Lamina extends JPanel {
    private JTextField nombre;
    private JTextField apellido;
    private JTextArea area;
    private JButton boton1;
    private JButton boton2;
    private JCheckBox casilla1;
    private JCheckBox casilla2;
    private JRadioButton radio1;
    private JRadioButton radio2;

    public Lamina() {
        setLayout(new BorderLayout());
        JPanel superior = new JPanel();
        JPanel central = new JPanel();
        JPanel inferior = new JPanel();

        // Componentes panel superior
        JLabel etiNombre = new JLabel("Nombre:");
        nombre = new JTextField(20);

        JLabel etiApellido = new JLabel("Apellidos:");
        apellido = new JTextField(30);

        // Componentes panel central
        area = new JTextArea("", 10, 50);
        area.setLineWrap(true);
        JScrollPane deslizarArea = new JScrollPane(area);

        // Componentes panel inferior
        boton1 = new JButton("Boton 1");
        boton1.addActionListener(new Eventos());
        boton2 = new JButton("Boton2");
        boton2.addActionListener(new Eventos());
        casilla1 = new JCheckBox("Casilla1", true);
        casilla1.addActionListener(new Eventos());
        casilla2 = new JCheckBox("Casilla 2");
        casilla2.addActionListener(new Eventos());
        ButtonGroup grupo = new ButtonGroup();
        radio1 = new JRadioButton("Radio 1");
        radio1.addActionListener(new Eventos());
        radio2 = new JRadioButton("Radio 2");
        radio2.addActionListener(new Eventos());
        grupo.add(radio1);
        grupo.add(radio2);

        // Añadiendo paneles y botones
        superior.add(etiNombre);
        superior.add(nombre);
        superior.add(etiApellido);
        superior.add(apellido);
        add(superior, BorderLayout.NORTH);
        central.add(deslizarArea);
        add(central, BorderLayout.CENTER);
        inferior.add(boton1);
        inferior.add(boton2);
        inferior.add(casilla1);
        inferior.add(casilla2);
        inferior.add(radio1);
        inferior.add(radio2);
        add(inferior, BorderLayout.SOUTH);

    }

    private class Eventos implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            actualizarAreaTexto(e);
        }

        // Función para manejar los eventos y actualizar el área de texto
        private void actualizarAreaTexto(ActionEvent e) {
            // Obtener el texto existente y agregar los datos del nombre y apellido solo una
            // vez.
            StringBuilder textoArea = new StringBuilder(area.getText());
            if (textoArea.length() == 0) {
                textoArea.append(nombre.getText())
                        .append(" ")
                        .append(apellido.getText())
                        .append(" ha pulsado las siguientes acciones:\n");
            }

            // Simplificar el uso de ifs con métodos auxiliares
            Object fuente = e.getSource();

            if (fuente == boton1) {
                textoArea.append("Ha presionado el botón 1\n");
            } else if (fuente == boton2) {
                textoArea.append("Ha presionado el botón 2\n");
            } else if (fuente == casilla1) {
                textoArea.append(casilla1.isSelected() ? "Casilla 1 seleccionada\n" : "Casilla 1 deseleccionada\n");
            } else if (fuente == casilla2) {
                textoArea.append(casilla2.isSelected() ? "Casilla 2 seleccionada\n" : "Casilla 2 deseleccionada\n");
            } else if (fuente == radio1) {
                textoArea.append("Radio 1 seleccionada\n");
            } else if (fuente == radio2) {
                textoArea.append("Radio 2 seleccionada\n");
            } else if (fuente == nombre || fuente == apellido) {
                // Si el evento es de los campos de texto, solo actualizamos el texto base
                area.setText(textoArea.toString());
                return; // Salimos de la función ya que no hay más que agregar
            }

            area.setText(textoArea.toString());
        }
    }
}