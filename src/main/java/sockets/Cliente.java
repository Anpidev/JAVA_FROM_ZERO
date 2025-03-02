package sockets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Cliente {
	
	// TODO Auto-generated method stub
	public static void main(String[] args) {
	MarcoClienteChat mimarco=new MarcoClienteChat();
	
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	

}




class MarcoClienteChat extends JFrame{

public MarcoClienteChat(){
	
	setBounds(600,300,280,350);
			
	LaminaClienteChat milamina=new LaminaClienteChat();
	
	add(milamina);
	
	setVisible(true);		
	
	}	

}


class LaminaClienteChat extends JPanel {

public LaminaClienteChat(){	
	
	JLabel cliente=new JLabel("CLIENTE");
	
	add(cliente);
	
	campo1=new JTextField(20);

	add(campo1);		

	miboton=new JButton("Enviar");	
	
	miboton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				//Creaccion de socket (via de comunicacion)
				Socket miSocket = new Socket("127.0.0.1",9999);
				//Creaccion del flujo de datos
				DataOutputStream flujoSaliData = new DataOutputStream(miSocket.getOutputStream());
				flujoSaliData.writeUTF(campo1.getText());
				flujoSaliData.close();
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
	});

	add(miboton);	
	
}



private JTextField campo1;	

private JButton miboton;
}



