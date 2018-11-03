import java.util.ArrayList;
import java.util.List;

public class Vehicule {

    //Attributs
    protected Double prix;
    protected String nom;
    protected List<Option> options = new ArrayList<Option>();
    protected Marque nomMarque;
    protected Moteur moteur;

    //Constructeur
    public Vehicule(Marque marque) {
        this.nomMarque = marque;
    }

    public String toString() {
        for (Option opt: getOptions()) {
            
        }
        
        return "";
    }

    public void addOption(Option opt) {
        this.options.add(opt);
    }

    public Marque getMarque() {
        return this.nomMarque;
    }

    public List<Option> getOptions() {
        return this.getOptions();
    }

    public Double getPrix() {
        return this.prix;
    }

    public Moteur getMoteur() {
        return this.moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }
}
