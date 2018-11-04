import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Garage implements Serializable {

    //Attributs
    private List<Vehicule> voitures = new ArrayList<>();

    //Constructeur par défaut
    public Garage() {
        ObjectInputStream ois;
        try {
            ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(
                                    new File("garage.txt"))));

            try {
                while (true) {
                    this.voitures.add((Vehicule) ois.readObject());
                }
            } catch (EOFException e) {
                System.out.println("Le fichier garage.txt a bien été lu !");
            }

            //ois.close();
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier garage.txt n'a pas été trouvé !");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        String description = "";
        description += "***************************\n*  Garage OpenClassrooms  *\n***************************";

        for (Vehicule voit: this.voitures) {
            description += "\n(" + ((this.voitures.indexOf(voit))+1) + ") " + voit.toString();
        }

        return description;
    }

    public void addVoiture(Vehicule voit) {
        this.voitures.add(voit);
        this.saveGarage();
    }

    public void deleteVoiture(int index) {
        if (index <= this.voitures.size() && index != 0) {
            this.voitures.remove(index-1);
        }
        this.saveGarage();
    }

    public void saveGarage() {
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    new File("garage.txt"))));
            for (Vehicule vehicule: this.voitures) {
                oos.writeObject(vehicule);
            }

            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier garage.txt n'a pas été trouvé !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
