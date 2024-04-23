package E_HerenciaYRelaciones;

public class Camion {
    private String matrícula;
    private String marca;
    private String modelo;
    private int año;
    private int numRuedas;
    private int numEjes;
    private String transmisión;
    private int capacidadCarga;

    public Camion(String matrícula, String marca, String modelo, int año, int numRuedas, int numEjes, String transmisión, int capacidadCarga) {
        this.matrícula = matrícula;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.numRuedas = numRuedas;
        this.numEjes = numEjes;
        this.transmisión = transmisión;
        this.capacidadCarga = capacidadCarga;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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


}
