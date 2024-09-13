package componentes_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ComponentesJRadioButton {
public static void main(String[] args) {
    MarcoJRadio miMarco= new MarcoJRadio();
    miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}

class MarcoJRadio extends JFrame{
public MarcoJRadio()
{
    setBounds(500,300,500,200);
    add(new LaminaJRadio());
    setVisible(true);
}
}

class LaminaJRadio extends JPanel{
public LaminaJRadio (){
    ButtonGroup miGrupo= new ButtonGroup();
    boton1= new JRadioButton("Masculino");
    boton2= new JRadioButton("Femenino");
    boton3= new JRadioButton("No quiere decirlo");
    miGrupo.add(boton1);
    miGrupo.add(boton2);
    miGrupo.add(boton3);
    boton1.addActionListener(new EventoJRadio());
    add(boton1);
    add(boton2);
    add(boton3);
}
 private class EventoJRadio implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
      /*  if (boton1.isSelected()) {
        System.out.println("Has seleccionado masculino");
       }*/

       if(e.getSource()==boton1)System.out.println("Has seleccionado masculino");
    }

 }
private JRadioButton boton1, boton2 , boton3;
}