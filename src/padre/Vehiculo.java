package padre;

public class Vehiculo {
	protected String marca;
	protected String modelo;
	protected double veloz;
	public Vehiculo(String marca, String modelo, double veloz) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.veloz = veloz;
	}
	
	public String Mensaje() {
		return "El vehiculo es: ";
	}
}
