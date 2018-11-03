import java.util.ArrayList;
import java.util.List;

public class Garage {

    //Attributs
    private List<Vehicule> voitures = new ArrayList<Vehicule>();

    public String toString() {

        return "";
    }

    public void addVoiture(Vehicule voit) {
        this.voitures.add(voit);
    }
}
