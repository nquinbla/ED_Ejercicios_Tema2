package E_HerenciaYRelaciones;

public abstract class Coche extends Terrestre {
    @Override
    public void mover() {
        System.out.println("El coche se está moviendo por la carretera...");
    }
    // Atributos y métodos específicos de los coches
    private int numPuertas;
    private String tipoCambio;

    public Coche(String matrícula, String marca, String modelo, int año, int numRuedas, int numPuertas, String tipoCambio) {
        super(matrícula, marca, modelo, año, numRuedas);
        this.numPuertas = numPuertas;
        this.tipoCambio = tipoCambio;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "numPuertas=" + numPuertas +
                ", tipoCambio='" + tipoCambio + '\'' +
                "} " + super.toString();
    }
}