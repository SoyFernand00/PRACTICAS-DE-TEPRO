package hijo;

import padre.Vehiculo;

public class camion extends Vehiculo {

	public camion(String marca, String modelo, double veloz) {
		super(marca, modelo, veloz);
	}
	public String Mensaje() {
		return "El CAMION "+marca+ " encendio";
	}

}
