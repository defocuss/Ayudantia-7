import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "tipo")
@JsonSubTypes({
		@JsonSubTypes.Type(value = Auto.class, name = "auto"),
		@JsonSubTypes.Type(value = Camion.class, name = "camion"),
		@JsonSubTypes.Type(value = Bicicleta.class, name = "bicicleta")
})

public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private int anio;
	private int precio;

	public Vehiculo(String marca, String modelo, int anio, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
	}

	public Vehiculo() {
	}

	public abstract String getTipo();

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
		return "Marca: "+ this.marca + ", Modelo: " + this.modelo + ", Anio: " + this.anio + ", Precio: " + this.precio;
	}
}