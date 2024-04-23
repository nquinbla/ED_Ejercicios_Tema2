package C_SimulaciónCompleja;

public class Main_C {
    public static void main(String[] args) throws InterruptedException {
        // Crear un nuevo objeto Radio
        Radio radio = new Radio();

        // Crear un nuevo objeto Cafetera que está conectado a la Radio
        Cafetera cafetera = new Cafetera(radio);

        // Crear un nuevo objeto Libro que está conectado a la Cafetera
        Libro book = new Libro("Don Quixote", cafetera);

        // Crear un nuevo objeto Reloj que está conectado al Libro
        Reloj clock = new Reloj(book);

        // Crear un nuevo objeto Lámpara que está conectado al Reloj
        Lámpara lamp = new Lámpara(clock);

        // Encender la Lámpara
        lamp.turnOn();
    }
}