package Options;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable {

    //Attributs
    private Double prix = 212.35;

    public Double getPrix() {
        return this.prix;
    }
}
