package B_DiseñoClasesAvanzado;
import B_DiseñoClasesAvanzado.Lámpara;
public class Reloj {
    private boolean alarmOn;
    private Lámpara connectedLamp;

    public Reloj(Lámpara lamp) {
        this.alarmOn = false;
        this.connectedLamp = lamp;
    }

    public void setAlarm() {
        this.alarmOn = true;
        System.out.println("The alarm is set.");
    }

    public void triggerAlarm() {
        if (this.alarmOn) {
            System.out.println("The alarm is ringing.");
            this.connectedLamp.turnOn();
        }
    }
}