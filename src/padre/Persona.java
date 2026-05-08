package padre;

import javax.swing.JOptionPane;

public class Persona {
	 protected String codigo;
	    protected String nombre;
	    protected int edad;


	    public Persona(String codigo, String nombre, int edad) {
	    	super();
	        this.codigo = codigo;
	        this.nombre = nombre;
	        this.edad = edad;
	    }
	    public String Mensaje() {
	    	return "Soy Persona ";
	    }
	    public double Promedio() {
	    	return 0.0;
	    }
	    public double Sueldo() {
	    	return 0.0;
	    }
	    public String Correo() {
	    	return codigo+" "+nombre+"@upn.pe";
	    }
	    public String Datos_Personales() {
	    	return "Codigo: "+codigo+"\nNombre: "+nombre+"\nEdad: "+edad;
	    }
	    public String getCodigo() {
	        return codigo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }
}
