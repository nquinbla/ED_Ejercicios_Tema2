package E_HerenciaYRelaciones;

public class Camion extends Terrestre{
    @Override
    public void mover() {
        System.out.println("El camión se está moviendo por la autopista...");
    }
    private int año;
    private int numRuedas;
    private int numEjes;
    private String transmisión;
    private int capacidadCarga;

    public Camion(String matrícula, String marca, String modelo, int año, int numRuedas, int numEjes, String transmisión, int capacidadCarga) {
        super(matrícula, marca, modelo, año, numRuedas);
        this.año = año;
        this.numRuedas = numRuedas;
        this.numEjes = numEjes;
        this.transmisión = transmisión;
        this.capacidadCarga = capacidadCarga;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public String getTransmisión() {
        return transmisión;
    }

    public void setTransmisión(String transmisión) {

        this.transmisión = transmisión;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camion{" +
                ", año=" + año +
                ", numRuedas=" + numRuedas +
                ", numEjes=" + numEjes +
                ", transmisión='" + transmisión + '\'' +
                ", capacidadCarga=" + capacidadCarga +
                "} " + super.toString();
    }

}
