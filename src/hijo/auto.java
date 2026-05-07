package hijo;

import padre.Vehiculo;

public class auto extends Vehiculo {
	public auto(String marca, String modelo, double veloz) {
		super(marca, modelo, veloz);
	}

	public String Mensaje() {
		return "El AUTO "+marca+" encendio";
	}
}
