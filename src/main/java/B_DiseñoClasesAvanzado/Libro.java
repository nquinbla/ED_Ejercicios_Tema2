package B_DiseñoClasesAvanzado;

public class Libro {
    private String title;
    Lámpara connectedLamp;

    public Libro(String title, Lámpara lamp) {
        this.title = title;
        this.connectedLamp = lamp;
    }

    public void read() {
        System.out.println("Leyendo el libro: " + this.title);
    }

    public void fall() {
        System.out.println("El libro se cae.");
        this.connectedLamp.turnOff();
    }
}