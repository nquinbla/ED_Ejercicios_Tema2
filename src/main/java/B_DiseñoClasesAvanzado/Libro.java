package B_DiseñoClasesAvanzado;

public class Libro {
    private String title;

    public Libro(String title) {
        this.title = title;
    }

    public void read() {
        System.out.println("Reading the book: " + this.title);
    }

}
