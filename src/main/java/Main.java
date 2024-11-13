import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Automotora automotora = new Automotora();
        automotora.agregarVehiculo(new Auto("Toyota", "Yaris", 2019, 1000000, 4));
        automotora.agregarVehiculo(new Camion("Volkswagen", "Constellation", 2021, 65000000, 10));
        automotora.agregarVehiculo(new Auto("Toyota", "Corolla", 2020, 1500000, 4));
        automotora.agregarVehiculo(new Bicicleta("Bici", "BMX", 2021, 50000, "Ruta"));

        automotora.guardarVehiculos();

        System.out.println("-------------------------");

        System.out.println("Vehiculos en la automotora:");
        automotora.listarTodosVehiculos();


        System.out.println("-------------------------");
        automotora.listarJson();
    }

    private static List<Vehiculo> inicializarVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Toyota", "Yaris", 2019, 1000000, 4));
        vehiculos.add(new Camion("Volkswagen", "Constellation", 2021, 65000000, 10));
        return vehiculos;
    }
}