package cl.curso.java.ejemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class NotasGUI {

	private JFrame frmPromedioDeNotas;
	private JTextField nota1;
	private JTextField nota2;
	private JTextField nota3;
	private JTextField promedioText;
	private JLabel lblPromedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasGUI window = new NotasGUI();
					window.frmPromedioDeNotas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NotasGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPromedioDeNotas = new JFrame();
		frmPromedioDeNotas.getContentPane().setBackground(new Color(0, 0, 0));
		frmPromedioDeNotas.setFont(new Font("French Script MT", Font.PLAIN, 18));
		frmPromedioDeNotas.setTitle("Promedio de Notas");
		frmPromedioDeNotas.setIconImage(Toolkit.getDefaultToolkit().getImage(NotasGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		frmPromedioDeNotas.setBounds(100, 100, 450, 300);
		frmPromedioDeNotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPromedioDeNotas.getContentPane().setLayout(null);
		
		JLabel lblIngresarNota = new JLabel("Ingresar nota 1");
		lblIngresarNota.setForeground(new Color(255, 255, 255));
		lblIngresarNota.setBounds(23, 31, 86, 14);
		frmPromedioDeNotas.getContentPane().add(lblIngresarNota);
		
		nota1 = new JTextField();
		nota1.setBounds(128, 28, 86, 20);
		frmPromedioDeNotas.getContentPane().add(nota1);
		nota1.setColumns(10);
		
		JLabel lblIngresarNota_1 = new JLabel("Ingresar nota 2");
		lblIngresarNota_1.setForeground(new Color(255, 255, 255));
		lblIngresarNota_1.setBounds(23, 56, 86, 14);
		frmPromedioDeNotas.getContentPane().add(lblIngresarNota_1);
		
		nota2 = new JTextField();
		nota2.setColumns(10);
		nota2.setBounds(128, 53, 86, 20);
		frmPromedioDeNotas.getContentPane().add(nota2);
		
		JLabel lblIngresarNota_2 = new JLabel("Ingresar nota 3");
		lblIngresarNota_2.setForeground(new Color(255, 255, 255));
		lblIngresarNota_2.setBounds(23, 82, 86, 14);
		frmPromedioDeNotas.getContentPane().add(lblIngresarNota_2);
		
		nota3 = new JTextField();
		nota3.setColumns(10);
		nota3.setBounds(128, 79, 86, 20);
		frmPromedioDeNotas.getContentPane().add(nota3);
		
		JButton btnCalcularPromedio = new JButton("Calcular Promedio");
		btnCalcularPromedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int promedio=(Integer.parseInt(nota1.getText())+
				Integer.parseInt(nota2.getText())+
				Integer.parseInt(nota3.getText()))/3;
				System.out.println(promedio);
				promedioText.setText(""+promedio);
			}
		});
		btnCalcularPromedio.setBounds(93, 109, 154, 23);
		frmPromedioDeNotas.getContentPane().add(btnCalcularPromedio);
		
		promedioText = new JTextField();
		promedioText.setBounds(128, 143, 86, 20);
		frmPromedioDeNotas.getContentPane().add(promedioText);
		promedioText.setColumns(10);
		
		lblPromedio = new JLabel("PROMEDIO :");
		lblPromedio.setForeground(new Color(255, 255, 255));
		lblPromedio.setBounds(23, 146, 86, 14);
		frmPromedioDeNotas.getContentPane().add(lblPromedio);
	}
}
