import java.io.Serializable;

public class Moteur implements Serializable {

    //Attributs
    protected TypeMoteur type;
    protected String cylindre;
    protected Double prix;

    public Moteur (TypeMoteur typeMoteur, String cylindre, Double prix) {
        this.type = typeMoteur;
        this.cylindre = cylindre;
        this.prix = prix;
    }

    public String toString() {
        return "Moteur " + this.type + " " + this.cylindre + " (" + this.getPrix() + "€)";
    }

    public Double getPrix() {
        return this.prix;
    }
}
