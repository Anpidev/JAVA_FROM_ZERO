package excepciones;

import javax.swing.JOptionPane;

public class ExcepcionesPropias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mail= JOptionPane.showInputDialog("Introduce un email: ");
			try {
				examinaMail(mail);
			} catch (LongitudMailErronea e) {
				// TODO Auto-generated catch block
				
				System.out.println("El email es demasiado corto");
				e.printStackTrace();
			}

	}

	
	static void examinaMail(String email) throws LongitudMailErronea{
		
		
		
		if (email.length()<=3) {
			LongitudMailErronea miExcepcion= new LongitudMailErronea("Mail con tres o menos caráctares");
			throw miExcepcion;
			
		} 
	}

}

class LongitudMailErronea extends Exception{
	//Es obligatorio crear un constructor vacio
	public LongitudMailErronea() {
		// TODO Auto-generated constructor stub
	}
	
	public LongitudMailErronea(String mensaje) {
		super(mensaje);
	}
}