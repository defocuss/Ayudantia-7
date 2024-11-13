public class Auto extends Vehiculo {
	private int numeroPuertas;
	private String tipo;


	public Auto(String marca, String modelo, int anio, int precio, int numeroPuertas) {
		super(marca, modelo, anio, precio);
		this.numeroPuertas = numeroPuertas;
		this.tipo = "vehiculo";
	}

	public Auto() {
	}

	public int getNumeroPuertas() {
		return this.numeroPuertas;
	}

	public String getTipo() {
		return "auto";
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public String toString() {
		return super.toString() + ", Numero de puertas: " + this.numeroPuertas;
	}
}