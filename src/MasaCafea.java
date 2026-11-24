
public class MasaCafea extends Mobilier {

    // Atribute specifice mesei de cafea
    private double lungime;
    private double latime;
    private double inaltime;
    private String forma;
    private String tipBlat;

    // Constructor fara parametri
    public MasaCafea() {
        super();
    }

    // Constructor cu toti parametrii
    public MasaCafea(int id, String denumire, String material,
                     String culoare, double pret,
                     double lungime, double latime, double inaltime,
                     String forma, String tipBlat) {

        super(id, denumire, material, culoare, pret);

        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
        this.forma = forma;
        this.tipBlat = tipBlat;
    }

    // Constructor de copiere
    public MasaCafea(MasaCafea altaMasa) {
        super(altaMasa.id, altaMasa.denumire, altaMasa.material,
                altaMasa.culoare, altaMasa.pret);

        this.lungime = altaMasa.lungime;
        this.latime = altaMasa.latime;
        this.inaltime = altaMasa.inaltime;
        this.forma = altaMasa.forma;
        this.tipBlat = altaMasa.tipBlat;
    }

    // Implementarea metodelor din clasa parinte
    @Override
    public String obtineTip() {
        return "Masa de cafea";
    }

    @Override
    public String descriereSpecificatii() {
        return "Forma: " + forma + ", tip blat: " + tipBlat;
    }

    // Getteri si setteri
    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getTipBlat() {
        return tipBlat;
    }

    public void setTipBlat(String tipBlat) {
        this.tipBlat = tipBlat;
    }

    // Afisarea tuturor caracteristicilor
    @Override
    public String toString() {
        return super.toString() +
                ", lungime=" + lungime +
                ", latime=" + latime +
                ", inaltime=" + inaltime +
                ", forma='" + forma + '\'' +
                ", tipBlat='" + tipBlat + '\'';
    }
}
