package E_HerenciaYRelaciones;

public class Main_E {
    public static void main(String[] args) {
        // Crear un nuevo objeto Sedán
        Sedán sedan = new Sedán("ABC123", "Toyota", "Camry", 2022, 4, 4, "Automático", true);

        // Crear un nuevo objeto Camion
        Camion camion = new Camion("XYZ789", "Volvo", "FH16", 2022, 6, 2, "Manual", 20000);

        // Crear un nuevo objeto Bicicleta
        Bicicleta bicicleta = new Bicicleta("Sin matrícula", "Trek", "Domane", 2022, 2, "Montaña");

        // Mostrar el movimiento de cada vehículo
        mostrarMovimiento(sedan);
        mostrarMovimiento(camion);
        mostrarMovimiento(bicicleta);
    }

    public static void mostrarMovimiento(Vehículo vehiculo) {
        vehiculo.mover();
    }
}