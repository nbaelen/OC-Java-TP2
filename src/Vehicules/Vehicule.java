package Vehicules;

import Moteurs.Moteur;
import Options.Option;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicule implements Serializable {

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
        String description = "+ Voiture " + getMarque()
                + " : " + this.moteur.toString() + " [";

        int i = 0;
        for (Option opt: getOptions()) {
            description += opt.getClass().getSimpleName() + " (" + opt.getPrix() + "€)";
            if (!(i++ == getOptions().size() - 1)) {
                description += ", ";
            }
        }

        description += "] d'une valeur totale de " + this.getPrix() + "€";
        
        return description;
    }

    public void addOption(Option opt) {
        this.options.add(opt);
        this.setPrix();
    }

    public Marque getMarque() {
        return this.nomMarque;
    }

    public List<Option> getOptions() {
        return this.options;
    }

    public Double getPrix() {
        return this.prix;
    }

    protected void setPrix() {
        this.prix = 0.0;
        for (Option opt: getOptions()) {
            this.prix += opt.getPrix();
        }
        this.prix += this.moteur.getPrix();
    }

    public Moteur getMoteur() {
        return this.moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
        this.setPrix();
    }
}
