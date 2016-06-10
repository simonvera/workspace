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
import javax.swing.JTextField;

public class FormularioCliente extends JFrame implements ActionListener, Runnable{
	JTextField txtNick, txtTip, txtMensaje;
	JButton btnEnviar,btnSalir;
	JTextArea txtMsj;
	ServerSocket serv=null;
	public FormularioCliente(){
		txtNick=new JTextField();
		txtNick.setBounds(10, 10, 400, 20);
		txtTip=new JTextField();
		txtTip.setBounds(10, 30, 400, 20);
		txtMensaje=new JTextField();
		txtMensaje.setBounds(10, 50, 400, 20);
		btnEnviar=new JButton("Enviar");
		btnEnviar.setBounds(10, 70, 400, 20);
		btnSalir=new JButton("Salir");
		btnSalir.setBounds(10, 410, 400, 20);
		txtMsj=new JTextArea();
		txtMsj.setBounds(10, 110, 400, 300);
		btnEnviar.addActionListener(this);
		btnSalir.addActionListener(this);
		add(txtNick);
		add(txtTip);
		add(txtMensaje);
		add(btnEnviar);
		add(btnSalir);
		add(txtMsj);
		setLayout(null);
		setSize(500, 500);
		setVisible(true);
		Thread hilo=new Thread(this);
		hilo.start();
		
	}
	public static void main (String[] args){
		new FormularioCliente();
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
		if(e.getSource()==btnEnviar){
			try {
				Socket cli=new Socket("192.168.1.102",9085);
				ClienteXd bean=new ClienteXd();
				bean.setNick(txtNick.getText());
				bean.setIp(txtTip.getText());
				bean.setMensaje(txtMensaje.getText());
				ObjectOutputStream flujo=new ObjectOutputStream(cli.getOutputStream());
				flujo.writeObject(bean);
				cli.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	@Override
	public void run() {
		try {
			serv=new ServerSocket(9090);
			Socket cli;
			ClienteXd bean;
			while(true){
				cli=serv.accept();
				ObjectInputStream flujo=new ObjectInputStream(cli.getInputStream());
				bean=(ClienteXd)flujo.readObject();
				txtMsj.append("\n"+bean.getNick()+" : "+bean.getMensaje());
			}
		} catch (Exception e) {
			System.out.println("Error en cliente "+e.getMessage());
		}
		
	}
}
