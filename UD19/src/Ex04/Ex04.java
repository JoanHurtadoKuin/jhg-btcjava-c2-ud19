package Ex04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex04 extends JFrame {

	private JPanel contentPane;
	private JTextField operador1TF;
	private JTextField operador2TF;
	private JTextField resultadoTF;
	private double operador1;
	private double operador2;
	private double resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex04 frame = new Ex04();
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
	public Ex04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		operador1TF = new JTextField();
		operador1TF.setBounds(10, 11, 97, 31);
		contentPane.add(operador1TF);
		operador1TF.setColumns(10);

		operador2TF = new JTextField();
		operador2TF.setBounds(157, 11, 97, 31);
		contentPane.add(operador2TF);
		operador2TF.setColumns(10);

		resultadoTF = new JTextField();
		resultadoTF.setEditable(false);
		resultadoTF.setBounds(300, 11, 97, 31);
		contentPane.add(resultadoTF);
		resultadoTF.setColumns(10);
		
		JLabel operadorLb = new JLabel("");
		operadorLb.setBounds(124, 19, 46, 14);
		contentPane.add(operadorLb);

		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operadorLb.setText("+");
				resultadoTF.setText(calcular('+') + "");
			}
		});
		btnNewButton.setBounds(10, 102, 97, 37);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operadorLb.setText("-");
				resultadoTF.setText(calcular('-') + "");
			}
		});
		btnNewButton_1.setBounds(134, 102, 97, 37);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("*");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operadorLb.setText("*");
				resultadoTF.setText(calcular('*') + "");
			}
		});
		btnNewButton_1_1.setBounds(10, 167, 97, 37);
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("/");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operadorLb.setText("/");
				resultadoTF.setText(calcular('/') + "");
			}
		});
		btnNewButton_1_2.setBounds(134, 167, 97, 37);
		contentPane.add(btnNewButton_1_2);

		JButton btnNewButton_1_2_1 = new JButton("Salir");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
		btnNewButton_1_2_1.setBounds(313, 167, 97, 37);
		contentPane.add(btnNewButton_1_2_1);
		
	
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setBounds(270, 19, 46, 14);
		contentPane.add(lblNewLabel);
	}

	public double calcular(char operador) {

		try {
			operador1 = Double.valueOf(operador1TF.getText());
			operador2 = Double.valueOf(operador2TF.getText());
			
			switch (operador) {
			case '+':
				return this.operador1 + this.operador2;

			case '-':
				return this.operador1 - this.operador2;

			case '*':
				return this.operador1 * this.operador2;

			case '/':
				return this.operador1 / this.operador2;

			default:
				return 0;

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR EN LOS VALORES INTRODUCIDOS");
		}

		return 0;
	}
}
