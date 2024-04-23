package E_HerenciaYRelaciones;

public class Terrestre extends Vehículo{
    private int numRuedas;

    public Terrestre(String matrícula, String marca, String modelo, int año, int numRuedas) {
        super(matrícula, marca, modelo, año);
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    @Override
    public String toString() {
        return "Terrestre{" +
                "numRuedas=" + numRuedas +
                "} " + super.toString();
    }
}
