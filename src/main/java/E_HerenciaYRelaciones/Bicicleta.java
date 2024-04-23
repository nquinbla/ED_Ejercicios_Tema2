package E_HerenciaYRelaciones;

public class Bicicleta extends Terrestre{
    private int año;
    private int numRuedas;
    @Override
    public void mover() {
        System.out.println("La bicicleta se está moviendo por el sendero...");
    }

    public Bicicleta(String matrícula, String marca, String modelo, int año, int numRuedas, String montaña) {
        super(matrícula, marca, modelo, año, numRuedas);

        this.año = año;
        this.numRuedas = numRuedas;
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

    @Override
    public String toString() {
        return "Bicicleta{" +
                ", año=" + año +
                ", numRuedas=" + numRuedas +
                '}';
    }
}
