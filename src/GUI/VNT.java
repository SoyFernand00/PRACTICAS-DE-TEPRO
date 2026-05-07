package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VNT extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JTextField texttipo;
	private JButton btnNewButton;
	private JLabel lblMarca;
	private JTextField textmarca;
	private JTextArea textArea_1;
	private JLabel lblModelo;
	private JTextField textmodelo;
	private JLabel lblVelocidad;
	private JTextField textveloz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VNT frame = new VNT();
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
	public VNT() {
		setTitle("REGISTRO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Tipo");
			lblNewLabel.setBounds(22, 11, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 156, 402, 155);
			contentPane.add(scrollPane);
			{
				textArea_1 = new JTextArea();
				scrollPane.setViewportView(textArea_1);
			}
		}
		{
			texttipo = new JTextField();
			texttipo.setBounds(49, 8, 86, 20);
			contentPane.add(texttipo);
			texttipo.setColumns(10);
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(22, 122, 89, 23);
			contentPane.add(btnNewButton);
		}
		{
			lblMarca = new JLabel("Marca");
			lblMarca.setBounds(145, 11, 46, 14);
			contentPane.add(lblMarca);
		}
		{
			textmarca = new JTextField();
			textmarca.setColumns(10);
			textmarca.setBounds(184, 8, 86, 20);
			contentPane.add(textmarca);
		}
		{
			textArea = new JTextArea();
			textArea.setBounds(22, 166, 400, 145);
			contentPane.add(textArea);
		}
		{
			lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(22, 40, 46, 14);
			contentPane.add(lblModelo);
		}
		{
			textmodelo = new JTextField();
			textmodelo.setColumns(10);
			textmodelo.setBounds(59, 37, 86, 20);
			contentPane.add(textmodelo);
		}
		{
			lblVelocidad = new JLabel("Velocidad");
			lblVelocidad.setBounds(155, 40, 46, 14);
			contentPane.add(lblVelocidad);
		}
		{
			textveloz = new JTextField();
			textveloz.setColumns(10);
			textveloz.setBounds(201, 37, 86, 20);
			contentPane.add(textveloz);
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		String tipo=texttipo.getText();
		String marca=textmarca.getText();
		String mode=textmodelo.getText();
		Double veloz=Double.parseDouble(textveloz.getText());
		
		
	}
}
