package hijo;

import padre.Vehiculo;

public class moto extends Vehiculo {
	public moto(String marca, String modelo, double veloz) {
		super(marca, modelo, veloz);
	}

	public String Mensaje() {
		return "La MOTO "+marca+ " encendio";
	}
}
