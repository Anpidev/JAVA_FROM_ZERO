package swing.componentes_swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class ComponentesMenuEmergente {

	public static void main(String[] args) {
		MarcoEmergente miMarcoEmergente = new MarcoEmergente();
		miMarcoEmergente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEmergente extends JFrame {
	public MarcoEmergente ()
{
		setBounds(500,500,700,600);
		add(new LaminaEmergente());
		setVisible(true);
		}
}

class LaminaEmergente extends JPanel{
	public LaminaEmergente () {
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem rojo= new JMenuItem("Rojo");
		JMenuItem verde= new JMenuItem("Verde");
		JMenuItem azul= new JMenuItem("Azul");
		azul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.BLUE);
				
			}
		});
		verde.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.GREEN);
				
			}
		});
		rojo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.RED);
				
			}
		});
		emergente.add(rojo);
		emergente.add(verde);
		emergente.add(azul);
		setComponentPopupMenu(emergente);
		
	}
}