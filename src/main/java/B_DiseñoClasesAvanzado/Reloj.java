package B_DiseñoClasesAvanzado;

public class Reloj {
    private boolean alarmOn;
    private Libro connectedBook;

    public Reloj(Libro book) {
        this.alarmOn = false;
        this.connectedBook = book;
    }

    public void setAlarm() throws InterruptedException {
        this.alarmOn = true;
        System.out.println("La alarma se pone.");
        Thread.sleep(1000); // Espera 1 segundo
        this.triggerAlarm();
    }

    public void triggerAlarm() throws InterruptedException {
        if (this.alarmOn) {
            System.out.println("Suena la alarma.");
            Thread.sleep(1000); // Espera 1 segundo
            this.connectedBook.fall();
        }
    }
}