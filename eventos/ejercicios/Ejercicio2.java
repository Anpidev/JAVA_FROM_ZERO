package eventos.ejercicios;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio2 {
    public static void main(String[] args) {
        Marco miMarco = new Marco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marco extends JFrame {
    public Marco() {
        setBounds(500, 300, 400, 250);
        add(new Lamina());
        setVisible(true);
    }
}

class Lamina extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        textoUsuario = new JTextField();
        textoPassword = new JTextField();
        textoEmail = new JTextField();
        etiUsuario = new JLabel("Usuario");
        etiEmail = new JLabel("Email");
        etiPassword = new JLabel("Contraseña");
        textoUsuario.setBounds(120, 10, 150, 20);
        textoPassword.setBounds(120, 50, 150, 20);
        textoEmail.setBounds(120, 90, 150, 20);
        etiUsuario.setBounds(70, 10, 150, 20);
        etiPassword.setBounds(70, 50, 150, 20);
        etiEmail.setBounds(70, 90, 150, 20);
        add(etiEmail);
        add(etiPassword);
        add(etiUsuario);
        add(textoEmail);
        add(textoPassword);
        add(textoUsuario);
        Foco miFoco = new Foco();
        textoUsuario.addFocusListener(miFoco);
        textoPassword.addFocusListener(miFoco);
    }

    private class Foco implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'focusGained'");
        }

        @Override
        public void focusLost(FocusEvent e) {
            if (e.getSource() == textoUsuario && textoUsuario.getText().equals("")) {
                JOptionPane.showMessageDialog(getParent(), "El usuario no puede quedar vacío");
                textoUsuario.requestFocus();
            }
            if (e.getSource() == textoPassword && textoPassword.getText().equals("")
                    && !textoUsuario.getText().equals("")) {
                JOptionPane.showMessageDialog(getParent(), "La contraseña no puede quedar vacía");
                textoPassword.requestFocus();
            }

        }

    }

    private JTextField textoUsuario, textoPassword, textoEmail;
    private JLabel etiUsuario, etiPassword, etiEmail;
}