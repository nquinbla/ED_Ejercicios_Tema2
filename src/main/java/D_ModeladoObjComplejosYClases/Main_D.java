package D_ModeladoObjComplejosYClases;

public class Main_D {
    public static void main(String[] args) {
        // Crear un nuevo objeto Pantalla
        Pantalla pantalla = new Pantalla(1080);

        // Crear un nuevo objeto Batería
        Batería batería = new Batería(4000);

        // Crear un nuevo objeto Android que implementa la interfaz SistemaOperativo
        SistemaOperativo android = new Android();

        // Crear un nuevo objeto Móvil que tiene una Pantalla, Batería y un SistemaOperativo
        Móvil móvil = new Móvil(pantalla, batería, android);

        // Encender el móvil
        móvil.turnOn();

        // Apagar el móvil
        móvil.turnOff();
    }
}