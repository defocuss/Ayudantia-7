public class Vehiculo {
	private String marca;
	private String modelo;
	private int anio;
	private int precio;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return this.anio;
	}

	public void setAnio(int anno) {
		this.anio = anno;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}
}