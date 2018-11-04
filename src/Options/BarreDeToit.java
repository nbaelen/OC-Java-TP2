package Options;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {

    //Attributs
    private Double prix = 29.9;

    public Double getPrix() {
        return this.prix;
    }
}
