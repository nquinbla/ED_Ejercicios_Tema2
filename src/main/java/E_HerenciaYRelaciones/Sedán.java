package E_HerenciaYRelaciones;

public class Sedán extends Coche {
    @Override
    public void mover() {
        System.out.println("El sedán se está moviendo suavemente por la carretera...");
    }

    // Atributos y métodos específicos de los sedanes
    private boolean maleteroGrande;

    public Sedán(String matrícula, String marca, String modelo, int año, int numRuedas, int numPuertas, String tipoCambio, boolean maleteroGrande) {
        super(matrícula, marca, modelo, año, numRuedas, numPuertas, tipoCambio);
        this.maleteroGrande = maleteroGrande;
    }

    public boolean isMaleteroGrande() {
        return maleteroGrande;
    }

    public void setMaleteroGrande(boolean maleteroGrande) {
        this.maleteroGrande = maleteroGrande;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "maleteroGrande=" + maleteroGrande +
                "} " + super.toString();
    }
}