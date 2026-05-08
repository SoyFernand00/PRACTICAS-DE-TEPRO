package hijo;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import padre.Persona;

public class Estudiante extends Persona{
	private double n1;
    private double n2;

    // Constructor
    public Estudiante(String codigo, String nombre, int edad,double n1, double n2) {
        super(codigo, nombre, edad);
        this.n1 = n1;
        this.n2 = n2;
    }

    // Método promedio
    public double promedio() {
        return (n1 + n2) / 2;
    }

    // Mostrar información
    public String Mensaje() {
    	return "Soy Estudiante ";
    }
    public String Datos_Personales() {
    	return Mensaje()+"\n"+super.Datos_Personales()+"\nNota 1: "+n1+"\nNota 2: "
    			+n2+"\nPromedio: "+promedio()+"\nEstado: "+decision()+"\nCorreo: "+Correo();
    }
    public String decision() {
    	if (promedio()>=12) {
    		return "Aprobado";
    	}else return "Desaprobado";
    }
}
