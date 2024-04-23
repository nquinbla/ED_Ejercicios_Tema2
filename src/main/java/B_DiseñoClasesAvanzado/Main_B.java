package B_DiseñoClasesAvanzado;

public class Main_B {
    public static void main(String[] args) throws InterruptedException {
        // Crear un nuevo libro
        Libro book = new Libro("Don Quixote", null);

        // Crear un nuevo Reloj que está conectado al libro
        Reloj clock = new Reloj(book);

        // Crear una nueva lámpara que está conectada al Reloj
        Lámpara lamp = new Lámpara(clock);

        // Conectar el libro a la lámpara
        book.connectedLamp = lamp;

        // Encender la lámpara
        lamp.turnOn();
    }
}