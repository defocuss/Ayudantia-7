public class Bicicleta extends Vehiculo {
	private String tipo;

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Bicicleta(String marca, String modelo, int anio, int precio, String tipo) {
		throw new UnsupportedOperationException();
	}
}