package C_SimulaciónCompleja;

public class Lámpara {
    private boolean isOn;
    private Reloj connectedClock;

    public Lámpara(Reloj clock) {
        this.isOn = false;
        this.connectedClock = clock;
    }

    public void turnOn() throws InterruptedException {
        this.isOn = true;
        System.out.println("La lámpara se enciende.");
        Thread.sleep(1000); // Espera 1 segundo
        this.connectedClock.setAlarm();
    }

    public void turnOff() throws InterruptedException {
        this.isOn = false;
        System.out.println("La lámpara se apaga.");
        Thread.sleep(1000); // Espera 1 segundo
    }
}