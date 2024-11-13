import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {

	private static final ObjectMapper mapper = new ObjectMapper();

	public static List<Vehiculo> leerVehiculos(String nombreArchivo) {
		try	{
			return mapper.readValue(new File(nombreArchivo), mapper.getTypeFactory().constructCollectionType(ArrayList.class, Vehiculo.class));
		}catch(Exception e){
			System.err.println("Error al leer los vehiculos desde " + nombreArchivo + e.getMessage());
			return null;
		}
	}

	public static void guardarVehiculos(List<Vehiculo> vehiculos, String nombreArchivo) {
		try {
			mapper.writeValue(new File(nombreArchivo),vehiculos);
			System.out.println("Vehiculos guardados en "+nombreArchivo);
		}catch(Exception e){
			System.err.println("Error al guardar vehiculos desde " + nombreArchivo + e.getMessage());
		}
	}
}