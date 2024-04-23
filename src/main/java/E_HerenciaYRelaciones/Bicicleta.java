package E_HerenciaYRelaciones;

public class Bicicleta extends Terrestre{
    private String matrícula;
    private String marca;
    private String modelo;
    private int año;
    private int numRuedas;

    public Bicicleta(String matrícula, String marca, String modelo, int año, int numRuedas, String montaña) {
        super(matrícula, marca, modelo, año, numRuedas);
        this.matrícula = matrícula;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.numRuedas = numRuedas;
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

    @Override
    public String toString() {
        return "Bicicleta{" +
                "matrícula='" + matrícula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", numRuedas=" + numRuedas +
                '}';
    }
}
