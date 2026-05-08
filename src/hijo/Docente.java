package hijo;

import padre.Persona;

public class Docente extends Persona{
	private int ht;   
    private double th;

    // Constructor
    public Docente(String codigo, String nombre, int edad,
                   int ht, double th) {
        super(codigo, nombre, edad);
        this.ht = ht;
        this.th = th;
    }

    // Método sueldo
    public double sueldo() {
        return ht * th;
    }
    public String Mensaje() {
    	return "Soy Docente ";
    }
    public String Datos_Personales() {
    	return Mensaje()+"\n"+super.Datos_Personales()+"\nHT: "+ht+"\nTH: "+th+"\nSueldo: "
    +sueldo()+"\nCorreo: "+Correo()+"\nBonificacion: "+bonificacion()+"\nSueldo neto: "+SueldoNe();
    }
    public double bonificacion() {
    	if(sueldo()>=1000) {
    		return (sueldo()*0.1);
    	}else {
    		return (sueldo()*0.05);
    	}
    }
    public double SueldoNe() {
    	return sueldo()+bonificacion();
    }
}
