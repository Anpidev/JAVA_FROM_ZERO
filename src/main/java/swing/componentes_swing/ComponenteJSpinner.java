package swing.componentes_swing;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ComponenteJSpinner {

    public static void main(String[] args) {
        MarcoJSpinner miMarco = new MarcoJSpinner();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoJSpinner extends JFrame {
    public MarcoJSpinner() {
        setBounds(400, 400, 700, 500);
        add(new LaminaJSpinner());
        setVisible(true);
    }
}

class LaminaJSpinner extends JPanel {
    public LaminaJSpinner() {
        /*String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre"
                ,"Octubre", "Noviembre", "Diciembre" };
        JSpinner control = new JSpinner(new SpinnerListModel(meses));*/
        JSpinner control= new JSpinner(new SpinnerNumberModel(5,-5,15,1));
        Dimension maxSize= new Dimension (100,50);
        control.setPreferredSize(maxSize);
        control.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println(control.getValue());
            }

        });
        add(control);
    }
}
