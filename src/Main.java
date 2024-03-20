public class Main {

    public static void main(String[] args) {

        Habitation habitation1 = new Habitation("Maison", 10.0, 8.0);
        Habitation habitation2 = new Habitation("Appartement", 5.0, 7.0);

        System.out.println("L'habitation " + habitation1.getNom() + " a une surface de : " + habitation1.surface() + " m²");
        System.out.println("L'habitation " + habitation2.getNom() + " a une surface de : " + habitation2.surface() + " m²");
    }
}