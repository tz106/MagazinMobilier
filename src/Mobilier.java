
public abstract class Mobilier {

    protected int id;
    protected String denumire;
    protected String material;
    protected String culoare;
    protected double pret;

    public Mobilier() {
    }

    public Mobilier(int id, String denumire, String material,
                    String culoare, double pret) {
        this.id = id;
        this.denumire = denumire;
        this.material = material;
        this.culoare = culoare;
        this.pret = pret;
    }

    public abstract String obtineTip();

    public abstract String descriereSpecificatii();

}

