package Ex03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Ex03 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex03 frame = new Ex03();
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
	public Ex03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elige un sistema operativo");
		lblNewLabel.setBounds(10, 27, 138, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(10, 48, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(10, 74, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(10, 100, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Especialidad");
		lblNewLabel_1.setBounds(213, 27, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programaci\u00F3n");
		chckbxNewCheckBox.setBounds(212, 48, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Dise\u00F1o gr\u00E1fico");
		chckbxNewCheckBox_1.setBounds(212, 74, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administraci\u00F3n");
		chckbxNewCheckBox_2.setBounds(212, 100, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(1);
		slider.setValue(10);
		slider.setPaintLabels(true);
		slider.setMaximum(10);
		slider.setBounds(10, 173, 200, 40);
		contentPane.add(slider);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas");
		lblNewLabel_2.setBounds(10, 143, 109, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sistemaOperativo;
				String especialidad = "";
				int horasDedicadas;
				
				if(rdbtnNewRadioButton.isSelected()) {
					sistemaOperativo = "Windows";
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					sistemaOperativo = "Linux";
				}else {
					sistemaOperativo = "Mac";
				}
												
				if(chckbxNewCheckBox.isSelected()) {
					especialidad += "\n -Programación";				
					}
				
				if(chckbxNewCheckBox_1.isSelected()) {
					especialidad += "\n -Diseño gráfico";
				}
				if(chckbxNewCheckBox_2.isSelected()) {
					especialidad += " \n -Administración";
				}
				
				horasDedicadas = slider.getValue();	
				
				JOptionPane.showMessageDialog(null, "Sistema Operativo: " + sistemaOperativo + "\n"
						+ "Especialidad: " + especialidad + "\n Horas dedicadas: " + horasDedicadas + " horas");
			}
		});
		btnNewButton.setBounds(280, 193, 89, 23);
		contentPane.add(btnNewButton);
		

	}
}
