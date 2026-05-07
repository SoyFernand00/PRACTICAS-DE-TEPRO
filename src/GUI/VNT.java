package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import hijo.auto;
import hijo.camion;
import hijo.moto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JTextField texttipo;
	private JButton btnNewButton;
	private JLabel lblMarca;
	private JTextField textmarca;
	private JLabel lblModelo;
	private JTextField textmodelo;
	private JLabel lblVelocidad;
	private JTextField textveloz;
	private JTextArea txtArea;

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
			lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(10, 40, 46, 14);
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 171, 381, 140);
		contentPane.add(scrollPane);
		
		txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
			String tipo=texttipo.getText().toLowerCase();
			String marca=textmarca.getText().toLowerCase();
			String mode=textmodelo.getText().toLowerCase();
			String txtVeloz = textveloz.getText().trim();
			String salida = "";
			if(tipo.isEmpty() || marca.isEmpty()||mode.isEmpty()||txtVeloz.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Ingrese datos en las casillas");
				
			}else {
				Double veloz = Double.parseDouble(txtVeloz);	
				if(!tipo.equals("auto")&&!tipo.equals("moto")&&!tipo.equals("camion")) {
				JOptionPane.showMessageDialog(null, "Ingrese bien el tipo de vehiculo");
			}else {
				switch (tipo) {
				case "auto": 
					auto auto=new auto(marca, mode, veloz);
				    salida += auto.Mensaje() +"\n";
					break;
				case "moto":
					moto moto=new moto(marca, mode, veloz);
					salida += moto.Mensaje()+ "\n";
					break;
				
				case "camion":
					camion camion=new camion(marca, mode, veloz);
					salida += camion.Mensaje()+"\n";
					break;
				}
				txtArea.append(salida);
			}
			}
		} catch (NumberFormatException e2) {

	        JOptionPane.showMessageDialog(null,"Ingrese un número válido en velocidad","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);

	    } catch (Exception e2) {

	        JOptionPane.showMessageDialog(null,"Error inesperado","ADVERTENCIA",JOptionPane.WARNING_MESSAGE
	        );
	    }
	}
}
