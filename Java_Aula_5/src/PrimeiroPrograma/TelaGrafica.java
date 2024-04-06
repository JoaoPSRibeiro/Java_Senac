package PrimeiroPrograma;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;

import java.awt.BorderLayout;

import java.awt.Font;

import javax.swing.JTextField;

import javax.swing.JButton;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import java.awt.Color;

import java.awt.SystemColor;

import javax.swing.JTextArea;

import javax.swing.GroupLayout;

import javax.swing.GroupLayout.Alignment;

import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JComboBox;

import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;

public class TelaGrafica {

	private JFrame frame;

	private JTextField txtPrimeiroNumero;

	private JTextField txtSegundoNumero;

	private JTextField textResultado;

	private JTextField txtOperacao;

	/**
	 * 
	 * Launch the application.
	 * 
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					TelaGrafica window = new TelaGrafica();

					window.frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	/**
	 * 
	 * Create the application.
	 * 
	 */

	public TelaGrafica() {

		initialize();

	}

	/**
	 * 
	 * Initialize the contents of the frame.
	 * 
	 */

	private void initialize() {

		frame = new JFrame();

		frame.setBounds(100, 100, 612, 427);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnCalcular = new JButton("Calcular");

		btnCalcular.setBackground(new Color(255, 255, 255));

		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 25));

		btnCalcular.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {

					double num1 = Double.parseDouble(txtPrimeiroNumero.getText());
					double num2 = Double.parseDouble(txtSegundoNumero.getText());
					String operacao = txtOperacao.getText();
					double resultado = 0;
					switch (operacao) {
					case "1":
						resultado = num1 + num2;
						break;
					case "2":
						resultado = num1 - num2;
						break;
					case "3":
						resultado = num1 * num2;
						break;
					case "4":
						if (num2 != 0) {
							resultado = num1 / num2;
						} else {
							JOptionPane.showMessageDialog(frame, "Não é possível dividir por zero.");
							return;
						}
						break;
					default:
						JOptionPane.showMessageDialog(frame, "Operação Inválida");
						return;	
					}		
					textResultado.setText(String.valueOf(resultado));
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Por favor, insira números válidos.");
				}
			}

		});

		txtPrimeiroNumero = new JTextField();

		txtPrimeiroNumero.setColumns(10);

		txtSegundoNumero = new JTextField();

		txtSegundoNumero.setColumns(10);

		JLabel lblNewLabel = new JLabel("Primeiro Numero:");

		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblNewLabel_1 = new JLabel("Segundo Numero:");

		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		textResultado = new JTextField();

		textResultado.setEditable(false);

		textResultado.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Resultado:");

		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblNewLabel_3 = new JLabel("Operação");

		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtOperacao = new JTextField();

		txtOperacao.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtOperacao.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("1-Somar / 2-Subtrair / 3-Multiplicar / 4-Dividir");

		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());

		groupLayout.setHorizontalGroup(

				groupLayout.createParallelGroup(Alignment.LEADING)

						.addGroup(groupLayout.createSequentialGroup()

								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)

										.addGroup(groupLayout.createSequentialGroup()

												.addGap(10)

												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)

														.addComponent(lblNewLabel)

														.addGroup(groupLayout.createSequentialGroup()

																.addPreferredGap(ComponentPlacement.RELATED)

																.addComponent(lblNewLabel_3))

														.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 185,
																GroupLayout.PREFERRED_SIZE)))

										.addGroup(groupLayout.createSequentialGroup()

												.addContainerGap()

												.addComponent(lblNewLabel_2)))

								.addGap(18)

								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)

										.addGroup(groupLayout.createSequentialGroup()

												.addComponent(txtOperacao, GroupLayout.PREFERRED_SIZE, 115,
														GroupLayout.PREFERRED_SIZE)

												.addPreferredGap(ComponentPlacement.UNRELATED)

												.addComponent(lblNewLabel_4)

												.addContainerGap())

										.addGroup(groupLayout.createSequentialGroup()

												.addComponent(textResultado, GroupLayout.DEFAULT_SIZE, 611,
														Short.MAX_VALUE)

												.addGap(120))

										.addGroup(groupLayout.createSequentialGroup()

												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)

														.addComponent(txtSegundoNumero, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)

														.addComponent(txtPrimeiroNumero, Alignment.LEADING)

														.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 256,
																GroupLayout.PREFERRED_SIZE))

												.addContainerGap(347, Short.MAX_VALUE))))

		);

		groupLayout.setVerticalGroup(

				groupLayout.createParallelGroup(Alignment.LEADING)

						.addGroup(groupLayout.createSequentialGroup()

								.addGap(39)

								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)

										.addComponent(lblNewLabel)

										.addComponent(txtPrimeiroNumero, GroupLayout.PREFERRED_SIZE, 38,
												GroupLayout.PREFERRED_SIZE))

								.addGap(38)

								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)

										.addComponent(lblNewLabel_1)

										.addComponent(txtSegundoNumero, GroupLayout.PREFERRED_SIZE, 38,
												GroupLayout.PREFERRED_SIZE))

								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)

										.addGroup(groupLayout.createSequentialGroup()

												.addGap(33)

												.addComponent(lblNewLabel_3)

												.addGap(34)

												.addComponent(btnCalcular))

										.addGroup(groupLayout.createSequentialGroup()

												.addGap(37)

												.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)

														.addComponent(txtOperacao, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)

														.addComponent(lblNewLabel_4))))

								.addGap(33)

								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)

										.addComponent(lblNewLabel_2)

										.addComponent(textResultado, GroupLayout.PREFERRED_SIZE, 49,
												GroupLayout.PREFERRED_SIZE))

								.addGap(39))

		);

		frame.getContentPane().setLayout(groupLayout);

	}

}