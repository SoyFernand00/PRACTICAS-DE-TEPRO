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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVeloz() {
		return veloz;
	}

	public void setVeloz(double veloz) {
		this.veloz = veloz;
	}
	
}
