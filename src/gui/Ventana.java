package gui;
import padre.Persona;
import hijo.Docente;
import hijo.Estudiante;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblDocente;
	private JTextField textCodigoE;
	private JLabel lblNombre;
	private JTextField textNomE;
	private JLabel lblEdad;
	private JTextField textEdadE;
	private JLabel lblNota;
	private JLabel lblNota_2;
	private JTextField textNot1;
	private JTextField textNot2;
	private JLabel lblDocente_2;
	private JLabel lblDocente_1;
	private JTextField textCodigoD;
	private JLabel lblNombre_1;
	private JTextField textNomD;
	private JLabel lblEdad_1;
	private JTextField textEdadD;
	private JLabel lblHt;
	private JTextField textHT;
	private JLabel lblNota_3;
	private JTextField textTH;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("Herencia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Estudiante");
			lblNewLabel.setBounds(10, 11, 64, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblDocente = new JLabel("Codigo");
			lblDocente.setBounds(10, 36, 64, 14);
			contentPane.add(lblDocente);
		}
		{
			textCodigoE = new JTextField();
			textCodigoE.setBounds(70, 33, 86, 20);
			contentPane.add(textCodigoE);
			textCodigoE.setColumns(10);
		}
		{
			lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(173, 36, 64, 14);
			contentPane.add(lblNombre);
		}
		{
			textNomE = new JTextField();
			textNomE.setBounds(218, 33, 86, 20);
			contentPane.add(textNomE);
			textNomE.setColumns(10);
		}
		{
			lblEdad = new JLabel("Edad");
			lblEdad.setBounds(319, 36, 64, 14);
			contentPane.add(lblEdad);
		}
		{
			textEdadE = new JTextField();
			textEdadE.setColumns(10);
			textEdadE.setBounds(354, 33, 86, 20);
			contentPane.add(textEdadE);
		}
		{
			lblNota = new JLabel("Nota 1");
			lblNota.setBounds(10, 61, 64, 14);
			contentPane.add(lblNota);
		}
		{
			lblNota_2 = new JLabel("Nota 2");
			lblNota_2.setBounds(173, 61, 64, 14);
			contentPane.add(lblNota_2);
		}
		{
			textNot1 = new JTextField();
			textNot1.setColumns(10);
			textNot1.setBounds(70, 61, 86, 20);
			contentPane.add(textNot1);
		}
		{
			textNot2 = new JTextField();
			textNot2.setColumns(10);
			textNot2.setBounds(218, 61, 86, 20);
			contentPane.add(textNot2);
		}
		{
			lblDocente_2 = new JLabel("Docente");
			lblDocente_2.setBounds(10, 86, 64, 14);
			contentPane.add(lblDocente_2);
		}
		{
			lblDocente_1 = new JLabel("Codigo");
			lblDocente_1.setBounds(10, 111, 64, 14);
			contentPane.add(lblDocente_1);
		}
		{
			textCodigoD = new JTextField();
			textCodigoD.setColumns(10);
			textCodigoD.setBounds(70, 108, 86, 20);
			contentPane.add(textCodigoD);
		}
		{
			lblNombre_1 = new JLabel("Nombre");
			lblNombre_1.setBounds(173, 111, 64, 14);
			contentPane.add(lblNombre_1);
		}
		{
			textNomD = new JTextField();
			textNomD.setColumns(10);
			textNomD.setBounds(218, 108, 86, 20);
			contentPane.add(textNomD);
		}
		{
			lblEdad_1 = new JLabel("Edad");
			lblEdad_1.setBounds(319, 111, 64, 14);
			contentPane.add(lblEdad_1);
		}
		{
			textEdadD = new JTextField();
			textEdadD.setColumns(10);
			textEdadD.setBounds(354, 108, 86, 20);
			contentPane.add(textEdadD);
		}
		{
			lblHt = new JLabel("HT");
			lblHt.setBounds(10, 136, 64, 14);
			contentPane.add(lblHt);
		}
		{
			textHT = new JTextField();
			textHT.setColumns(10);
			textHT.setBounds(70, 136, 86, 20);
			contentPane.add(textHT);
		}
		{
			lblNota_3 = new JLabel("TH");
			lblNota_3.setBounds(173, 136, 64, 14);
			contentPane.add(lblNota_3);
		}
		{
			textTH = new JTextField();
			textTH.setColumns(10);
			textTH.setBounds(218, 136, 86, 20);
			contentPane.add(textTH);
		}
		{
			btnProcesar = new JButton("Procesar");
			btnProcesar.addActionListener(this);
			btnProcesar.setBounds(10, 171, 89, 23);
			contentPane.add(btnProcesar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(28, 263, 433, 187);
			contentPane.add(scrollPane);
			{
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			do_btnProcesar_actionPerformed(e);
		}
	}
	protected void do_btnProcesar_actionPerformed(ActionEvent e) {
		try {
			String codE = textCodigoE.getText().trim();
	        String nomE = textNomE.getText().trim();
	        String codD = textCodigoD.getText().trim();
	        String nomD = textNomD.getText().trim();
	        String edadEs = textEdadE.getText().trim();
	        String n1s = textNot1.getText().trim();
	        String n2s = textNot2.getText().trim();
	        String edadDs = textEdadD.getText().trim();
	        String hts = textHT.getText().trim();
	        String ths = textTH.getText().trim();
	        int edadE = Integer.parseInt(edadEs);
	        double n1 = Double.parseDouble(n1s);
	        double n2 = Double.parseDouble(n2s);
	        int edadD = Integer.parseInt(edadDs);
	        int ht = Integer.parseInt(hts);
	        double th = Double.parseDouble(ths);
	        if (edadE <= 0 || edadD <= 0) {
	            throw new Exception("La edad debe ser mayor a 0");
	        }

	        if (n1 < 0 || n1 > 20 || n2 < 0 || n2 > 20) {
	            throw new Exception("Las notas deben estar entre 0 y 20");
	        }
	        if (ht < 0 || th < 0) {
	            throw new Exception("Horas y tarifa no pueden ser negativas");
	        }
	        if (codE.isEmpty() || nomE.isEmpty() || codD.isEmpty() || nomD.isEmpty()
	                || edadEs.isEmpty() || n1s.isEmpty() || n2s.isEmpty()
	                || edadDs.isEmpty() || hts.isEmpty() || ths.isEmpty()) {

	            throw new IllegalArgumentException("No se permiten casillas vacías");
	        }
		    Estudiante es = new Estudiante(codE, nomE, edadE, n1, n2);
		    Docente d = new Docente(codD, nomD, edadD, ht, th);
		    
		    Listado(es, d);
		    JOptionPane.showMessageDialog(null,"Se ingreso los datos correctamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Ingresa datos de valor correctos", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		catch (Exception e2) {
			JOptionPane.showMessageDialog(null, e2.getMessage(), "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
		}
	}
	void Imprimir() {
		textArea.append("-------------------\n");
	}
	void Imprimir(String s) {
		textArea.append(s+"\n");
	}
	void Listado(Persona e, Persona d) {

		Imprimir(e.Datos_Personales());
		Imprimir();
		Imprimir(d.Datos_Personales());
	}
}
