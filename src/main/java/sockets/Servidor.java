package sockets;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Servidor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoServidorChat mimarco = new MarcoServidorChat();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoServidorChat extends JFrame implements Runnable {

	public MarcoServidorChat() {

		setBounds(1200, 300, 280, 350);

		JPanel milamina = new JPanel();

		milamina.setLayout(new BorderLayout());

		areatexto = new JTextArea();

		milamina.add(areatexto, BorderLayout.CENTER);

		add(milamina);

		setVisible(true);

		// Comenzar multiples hilos
		Thread miHilo = new Thread();
		miHilo.start();

	}

	@Override
	public void run() {
		try {
			// Puerto a la escucha
			ServerSocket miServer = new ServerSocket(9999);

			while (true) {
				Socket miSocket = miServer.accept(); // acepta todas las conexiones del socket

				// Flujo de entrada de datos
				DataInputStream flujoEntrada = new DataInputStream(miSocket.getInputStream());
				String mensajeString = flujoEntrada.readUTF();
				areatexto.append("\n"+mensajeString);

				// Cerrar escucha
				miSocket.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private JTextArea areatexto;

}
