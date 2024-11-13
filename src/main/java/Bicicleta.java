public class Bicicleta extends Vehiculo {
	private String estiloBicicleta;
	private String tipo;

	public Bicicleta(String marca, String modelo, int anio, int precio, String estiloBicicleta) {
		super (marca, modelo, anio, precio);
		this.estiloBicicleta = estiloBicicleta;
		this.tipo = "vehiculo";
	}

	public Bicicleta() {
    }

	public String getEstiloBicicleta() {
		return this.estiloBicicleta;
	}

	public void setEstiloBicicleta(String estiloBicicleta) {
		this.estiloBicicleta = estiloBicicleta;
	}

	public String getTipo() {
		return "bicicleta";
	}

	public String toString() {
		return super.toString() + ", Estilo: " + this.estiloBicicleta;
	}

}