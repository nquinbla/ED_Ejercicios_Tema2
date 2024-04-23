package C_SimulaciónCompleja;

public class Cafetera {
    private Radio connectedRadio;

    public Cafetera(Radio radio) {
        this.connectedRadio = radio;
    }

    public void makeCoffee() throws InterruptedException {
        System.out.println("La cafetera comienza a hacer café.");
        Thread.sleep(1000); // Espera 1 segundo
        this.connectedRadio.turnOn();
    }
}