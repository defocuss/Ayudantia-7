import java.util.ArrayList;
import java.util.List;

public class Automotora {
	private ArrayList<Vehiculo> vehiculos;

	public Automotora() {
		this.vehiculos = new ArrayList<>();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
	}

	public void guardarVehiculos() {
		GestorDatos.guardarVehiculos(this.vehiculos, "vehiculos.json");
	}

	public void cargarVehiculos() {
		this.vehiculos = (ArrayList<Vehiculo>) GestorDatos.leerVehiculos("vehiculos.json");
	}

	public void listarJson() {
		cargarVehiculos();
		if(this.vehiculos != null) {
			for (Vehiculo vehiculo : vehiculos) {
				System.out.println(vehiculo);
			}
		}
		else {
			System.out.println("No hay vehiculos en la automotora");
		}
	}

	public void listarTodosVehiculos() {
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo);
		}
	}


}