public class MainExo2 {

    public static void main(String[] args) {

        Vehicule vehicule1 = new Vehicule("Voiture", 4, 80);
        Vehicule vehicule2 = new Vehicule("Moto", 2, 60);
        Vehicule vehicule3 = new Vehicule("Camion", 6, 100);

        System.out.println("Le véhicule " + vehicule1.getNom() + " est de type " + vehicule1.detect());
        System.out.println("Le véhicule " + vehicule2.getNom() + " est de type " + vehicule2.detect());
        System.out.println("Le véhicule " + vehicule3.getNom() + " est de type " + vehicule3.detect());

        vehicule1.boost();
        vehicule2.boost();
        vehicule3.boost();

        System.out.println("Le véhicule " + vehicule1.getNom() + " possède une vitesse de : " + vehicule1.getVitesse() + " km/h");
        System.out.println("Le véhicule " + vehicule2.getNom() + " possède une vitesse de : " + vehicule2.getVitesse() + " km/h");
        System.out.println("Le véhicule " + vehicule3.getNom() + " possède une vitesse de : " + vehicule3.getVitesse() + " km/h");
    }
}