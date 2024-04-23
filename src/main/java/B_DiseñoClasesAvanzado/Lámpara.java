package B_DiseñoClasesAvanzado;

public class Lámpara {
    private boolean isOn;
    private Reloj connectedClock;

    public Lámpara(Reloj clock) {
        this.isOn = false;
        this.connectedClock = clock;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("La lámpara se enciende.");
        this.connectedClock.triggerAlarm();
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("La lámpara se apaga.");
    }
}