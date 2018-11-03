public class Moteur {

    //Attributs
    protected TypeMoteur type;
    protected String cylindre;
    protected Double prix;

    public Moteur (String cylindre, Double prix) {
        this.cylindre = cylindre;
        this.prix = prix;
    }

    public String toString() {
        return "";
    }

    public Double getPrix() {
        return this.prix;
    }
}
