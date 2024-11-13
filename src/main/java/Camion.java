public class Camion extends Vehiculo {

	private int cargaMax;
	private String tipo;

	public Camion(String marca, String modelo, int anio, int precio, int cargaMax) {
		super(marca, modelo, anio, precio);
		this.cargaMax = cargaMax;
		this.tipo = "vehiculo";
	}

	public Camion() {
	}

	public String getTipo() {
		return "camion";
	}

	public int getCargaMax() {
		return this.cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public String toString() {
		return super.toString() + ", Carga maxima: " + this.cargaMax;
	}
}