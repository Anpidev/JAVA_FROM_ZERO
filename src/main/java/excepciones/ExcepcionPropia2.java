package excepciones;

import javax.swing.JOptionPane;

public class ExcepcionPropia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pedirNumero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número entre 1 y 100 (inclusives)"));
		try {
			NumeroCorrecto(pedirNumero);
		} catch (ErrorNumero e) {
			// TODO Auto-generated catch block
			System.out.println("El número no está entre 1 y 100");
			e.printStackTrace();
		}

	}

	static void NumeroCorrecto(int numero) throws ErrorNumero {
		if (numero < 1 || numero > 100) {
			ErrorNumero miError = new ErrorNumero("Número erróneo");
			throw miError;
		} else {
			System.out.println("Número correcto");

		}
		;
	}

}

class ErrorNumero extends Exception {
	public ErrorNumero() {
	};

	public ErrorNumero(String mensaje) {
		super(mensaje);
	};

}