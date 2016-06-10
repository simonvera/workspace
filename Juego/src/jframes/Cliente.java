package cl.curso.java.jframes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Cliente extends JFrame implements ActionListener {
	JTextField txtMensaje;
	JButton btnEnviar;
	public Cliente() {
		txtMensaje=new JTextField();
		txtMensaje.setBounds(10, 10, 200, 20);
		add(txtMensaje);
		btnEnviar=new JButton();
		btnEnviar.setText("Enviar");
		btnEnviar.setBounds(10, 40, 150, 20);
		btnEnviar.addActionListener(this);
		add(btnEnviar);
		setLayout(null);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Cliente();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnEnviar){
			try {
				Socket cli=new Socket ("127.0.0.1",9090);
				DataOutputStream flujo=new DataOutputStream(cli.getOutputStream());
				flujo.writeUTF(txtMensaje.getText());
				cli.close();
			} catch (Exception ex) {
				System.out.println("Error en cliente "+ex.getMessage());
			}
		}
	}

}
