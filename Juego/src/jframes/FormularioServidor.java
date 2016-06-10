package jframes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FormularioServidor extends JFrame implements Runnable, ActionListener{
	JTextArea txtMensaje;
	ServerSocket serv=null;
	JButton btnSalir;
	public FormularioServidor() {
		btnSalir=new JButton("Salir");
		btnSalir.setBounds(10, 10, 300, 20);
		txtMensaje=new JTextArea();
		txtMensaje.setBounds(10, 30, 500, 600);
		add(txtMensaje);
		add(btnSalir);
		btnSalir.addActionListener(this);
		setLayout(null);
		setSize(600, 600);
		setVisible(true);
		Thread hilo=new Thread (this);
		hilo.start();
	}

	public static void main(String[] args) {
		new FormularioServidor();

	}

	@Override
	public void run() {
		try {
			serv=new ServerSocket(9087);
			Socket cli;
			String nick, ip, mensaje;
			ClienteXd bean;
			while(true){
				cli=serv.accept();
				ObjectInputStream flujo=new ObjectInputStream(cli.getInputStream());
				bean=(ClienteXd)flujo.readObject();
				nick=bean.getNick();
				ip=bean.getIp();
				mensaje=bean.getMensaje();
				txtMensaje.append("\n"+nick +" le dice a "+ip+" : "+mensaje);
				Socket cliEnvia=new Socket(ip,9092);
				ObjectOutputStream flujoEnvia=new ObjectOutputStream(cliEnvia.getOutputStream());
				flujoEnvia.writeObject(bean);
				cliEnvia.close();
				cli.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSalir){
			try {
				serv.close();
				dispose();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		}
		
	}

}
