package projetoimc;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nome_field;
	private JTextField peso_field;
	private JTextField altura_field;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() { //LAYOUT
		setTitle ("Calculador de IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("About");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Desenvolvido por Tiago Carleial");
			}
		});
		btnNewButton.setBounds(0, 0, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel nome_label = new JLabel("Digite seu nome");
		nome_label.setBounds(29, 45, 126, 21);
		contentPane.add(nome_label);
			
		nome_field = new JTextField();
		nome_field.setBounds(29, 65, 126, 29);
		contentPane.add(nome_field);
		nome_field.setColumns(10);
		
		JLabel peso_label = new JLabel("Digite seu peso");
		peso_label.setBounds(29, 104, 126, 29);
		contentPane.add(peso_label);
		
		peso_field = new JTextField();
		peso_field.setBounds(29, 125, 126, 29);
		contentPane.add(peso_field);
		peso_field.setColumns(10);
		
		JLabel altura_label = new JLabel("Digite sua altura");
		altura_label.setBounds(29, 164, 126, 29);
		contentPane.add(altura_label);
		
		altura_field = new JTextField();
		altura_field.setBounds(29, 186, 126, 29);
		contentPane.add(altura_field);
		altura_field.setColumns(10);
		
		
	
		
		
		
		JButton calculo = new JButton("CALCULAR IMC");
		calculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double peso = Double.parseDouble(peso_field.getText())	; // transform the String text imputed peso_field on Double value
				Double altura = Double.parseDouble(altura_field.getText())	; // transform the String text imputed altura_field on Double value
				Double result = peso/(altura*altura); // make the calculation
				double rounded = Math.round(result*10)/10.0;
				
				
				
				// show dialog after press calcular imc
				JOptionPane.showMessageDialog(null, nome_field.getText()+  ", " + "Seu IMC = " + rounded +
						 "\r\nIMC - \r	CLASSIFICAÇÃO \r OBESIDADE \r   (GRAU)\r\n" + 
						"MENOR QUE 18,5	       \r MAGREZA	  \r                   0\r\n" + 
						"ENTRE 18,5 E 24,9	      \r NORMAL	      \r                 0\r\n" + 
						"ENTRE 25,0 E 29,9	      \r SOBREPESO	  \r              I\r\n" + 
						"ENTRE 30,0 E 39,9	      \r OBESIDADE	  \r                II\r\n" + 
						"MAIOR QUE 40,0	         \r OBESIDADE GRAVE\r    III" , "Resultado", JOptionPane.PLAIN_MESSAGE);
					
				
			}
		});
		calculo.setBounds(227, 112, 150, 39);
		contentPane.add(calculo);
	}
}
