public class Auto extends Vehiculo {
	private int numeroPuertas;

	public int getNumeroPuertas() {
		return this.numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public Auto(String marca, String modelo, int anio, int precio, int numeroPuertas) {
		throw new UnsupportedOperationException();
	}
}