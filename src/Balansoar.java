
public class Balansoar extends Mobilier {

    // Atribute specifice balansoarului
    private int capacitate;
    private String tipStructura;
    private String materialTapiterie;
    private boolean pliabil;
    private double greutateMaxima;

    // Constructor fara parametri
    public Balansoar() {
        super();
    }

    // Constructor cu toti parametrii
    public Balansoar(int id, String denumire, String material,
                     String culoare, double pret,
                     int capacitate, String tipStructura,
                     String materialTapiterie, boolean pliabil,
                     double greutateMaxima) {

        super(id, denumire, material, culoare, pret);

        this.capacitate = capacitate;
        this.tipStructura = tipStructura;
        this.materialTapiterie = materialTapiterie;
        this.pliabil = pliabil;
        this.greutateMaxima = greutateMaxima;
    }

    // Constructor de copiere
    public Balansoar(Balansoar altBalansoar) {
        super(altBalansoar.id, altBalansoar.denumire,
                altBalansoar.material, altBalansoar.culoare,
                altBalansoar.pret);

        this.capacitate = altBalansoar.capacitate;
        this.tipStructura = altBalansoar.tipStructura;
        this.materialTapiterie = altBalansoar.materialTapiterie;
        this.pliabil = altBalansoar.pliabil;
        this.greutateMaxima = altBalansoar.greutateMaxima;
    }

    // Implementarea metodelor din clasa parinte
    @Override
    public String obtineTip() {
        return "Balansoar";
    }

    @Override
    public String descriereSpecificatii() {
        return "Structura: " + tipStructura +
                ", tapiterie: " + materialTapiterie;
    }

    // Getteri si setteri
    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public String getTipStructura() {
        return tipStructura;
    }

    public void setTipStructura(String tipStructura) {
        this.tipStructura = tipStructura;
    }

    public String getMaterialTapiterie() {
        return materialTapiterie;
    }

    public void setMaterialTapiterie(String materialTapiterie) {
        this.materialTapiterie = materialTapiterie;
    }

    public boolean isPliabil() {
        return pliabil;
    }

    public void setPliabil(boolean pliabil) {
        this.pliabil = pliabil;
    }

    public double getGreutateMaxima() {
        return greutateMaxima;
    }

    public void setGreutateMaxima(double greutateMaxima) {
        this.greutateMaxima = greutateMaxima;
    }

    // Afisarea tuturor caracteristicilor
    @Override
    public String toString() {
        return super.toString() +
                ", capacitate=" + capacitate +
                ", tipStructura='" + tipStructura + '\'' +
                ", materialTapiterie='" + materialTapiterie + '\'' +
                ", pliabil=" + pliabil +
                ", greutateMaxima=" + greutateMaxima;
    }
}
