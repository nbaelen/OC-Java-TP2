package Options;

import java.io.Serializable;

public class Climatisation implements Option, Serializable {

    //Attributs
    private Double prix = 347.3;

    public Double getPrix() {
        return this.prix;
    }
}
