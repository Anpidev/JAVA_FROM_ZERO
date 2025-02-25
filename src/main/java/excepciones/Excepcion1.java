package excepciones;

import javax.swing.JOptionPane;

public class Excepcion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=0;
		
		try {
			numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		} catch (NumberFormatException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "El mensaje introducido no es un número\n"
					+"El programa se cerrará."
					);
			System.exit(0);
		}
if (numero%2==0) {JOptionPane.showMessageDialog(null, "El número "+numero+ " es par");
	
} else {
	JOptionPane.showMessageDialog(null, "El número "+numero+ " es impar");
}
	}

}
