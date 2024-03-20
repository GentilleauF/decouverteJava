public class Assassin extends Personnage {

    private int bonusAttaque;

    public Assassin() {
    }

    public Assassin(String nom, int vie, int attaque, int defense, int bonusAttaque) {
        super(nom, vie, attaque, defense);
        this.bonusAttaque = bonusAttaque;
    }

    // Getters et setters
    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }


    public void attaquer(Personnage cible) {
        if (Math.random() * 100 <= 5) {
            cible.vie -= (this.attaque + bonusAttaque) - cible.defense;
        } else {
            cible.vie -= this.attaque - cible.defense;
        }
    }
}

