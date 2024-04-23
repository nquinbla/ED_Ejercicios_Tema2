package C_SimulaciónCompleja;


public class Libro {
    private String title;
    private Cafetera connectedCafetera;

    public Libro(String title, Cafetera cafetera) {
        this.title = title;
        this.connectedCafetera = cafetera;
    }

    public void read() {
        System.out.println("Leyendo el libro: " + this.title);
    }

    public void fall() throws InterruptedException {
        System.out.println("El libro se cae.");
        Thread.sleep(1000); // Espera 1 segundo
        this.connectedCafetera.makeCoffee();
    }
}