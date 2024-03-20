
public class Main3 {

    public static void main(String[] args) {
        Personnage joueur1 = new Guerrier("Arthur", 120, 15, 10, 15);
        Personnage joueur2 = new Assassin("Lancelot", 120, 12, 8, 10);
        Partie partie = new Partie(joueur1, joueur2, 10);

        String resultat = partie.lancerPartie();
        System.out.println(resultat);

    }
}
