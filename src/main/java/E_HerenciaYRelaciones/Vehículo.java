package E_HerenciaYRelaciones;

public class Vehículo extends Movible{
    private String matrícula;
    private String marca;
    private String modelo;
    private int año;

    public Vehículo(String matrícula, String marca, String modelo, int año) {
        this.matrícula = matrícula;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
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

    @Override
    public String toString() {
        return "Vehículo{" +
                "matrícula='" + matrícula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                '}';
    }
}
