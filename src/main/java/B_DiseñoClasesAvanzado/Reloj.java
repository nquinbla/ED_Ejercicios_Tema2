package B_DiseñoClasesAvanzado;

public class Reloj {
    private boolean alarmOn;
    private Libro connectedBook;

    public Reloj(Libro book) {
        this.alarmOn = false;
        this.connectedBook = book;
    }

    public void setAlarm() {
        this.alarmOn = true;
        System.out.println("La alarma se pone.");
    }

    public void triggerAlarm() {
        if (this.alarmOn) {
            System.out.println("Suena la alarma.");
            this.connectedBook.fall();
        }
    }
}