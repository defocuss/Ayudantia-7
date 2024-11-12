public class Camion extends Vehiculo {
	private int cargaMax;

	public int getCargaMax() {
		return this.cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public Camion(String marca, String modelo, int anio, int precio, int cargaMax) {
		throw new UnsupportedOperationException();
	}
}