public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        System.out.println(garage);

        //garage.deleteVoiture(4);
        //System.out.println(garage);

        Vehicules.Vehicule lag1 = new Vehicules.Lagouna();
        lag1.setMoteur(new Moteurs.MoteurEssence("150 Chevaux", 10256d));
        lag1.addOption(new Options.GPS());
        lag1.addOption(new Options.SiegeChauffant());
        lag1.addOption(new Options.VitreElectrique());
        garage.addVoiture(lag1);

        Vehicules.Vehicule A300B_2 = new Vehicules.A300B();
        A300B_2.setMoteur(new Moteurs.MoteurElectrique("1500 W", 1234d));
        A300B_2.addOption(new Options.Climatisation());
        A300B_2.addOption(new Options.BarreDeToit());
        A300B_2.addOption(new Options.SiegeChauffant());
        garage.addVoiture(A300B_2);

        Vehicules.Vehicule d4_1 = new Vehicules.D4();
        d4_1.setMoteur(new Moteurs.MoteurDiesel("200 Hdi", 25684.80d));
        d4_1.addOption(new Options.BarreDeToit());
        d4_1.addOption(new Options.Climatisation());
        d4_1.addOption(new Options.GPS());
        garage.addVoiture(d4_1);

        Vehicules.Vehicule lag2 = new Vehicules.Lagouna();
        lag2.setMoteur(new Moteurs.MoteurDiesel("500 Hdi", 456987d));
        garage.addVoiture(lag2);

        Vehicules.Vehicule A300B_1 = new Vehicules.A300B();
        A300B_1.setMoteur(new Moteurs.MoteurHybride("ESSENCE/Electrique", 12345.95d));
        A300B_1.addOption(new Options.VitreElectrique());
        A300B_1.addOption(new Options.BarreDeToit());
        garage.addVoiture(A300B_1);

        Vehicules.Vehicule d4_2 = new Vehicules.D4();
        d4_2.setMoteur(new Moteurs.MoteurElectrique("100 KW", 1224d));
        d4_2.addOption(new Options.SiegeChauffant());
        d4_2.addOption(new Options.BarreDeToit());
        d4_2.addOption(new Options.Climatisation());
        d4_2.addOption(new Options.GPS());
        d4_2.addOption(new Options.VitreElectrique());
        garage.addVoiture(d4_2);

        garage.deleteAllVoiture();

        System.out.println(garage);
    }

}