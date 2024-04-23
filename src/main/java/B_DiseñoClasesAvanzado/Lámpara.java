package B_DiseñoClasesAvanzado;

public class Lámpara {
    private boolean isOn;

    public Lámpara() {
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("The lamp is turned on.");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("The lamp is turned off.");
    }
}