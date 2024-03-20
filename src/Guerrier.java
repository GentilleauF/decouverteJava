public class Guerrier extends Personnage {

    private int bonusDefense;

    public Guerrier() {
    }

    public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense) {
        super(nom, vie, attaque, defense);
        this.bonusDefense = bonusDefense;
    }

    // Getters et setters
    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }


    public void attaquer(Personnage cible) {
        if (Math.random() * 100 <= 5) {
            this.vie += bonusDefense;
        }
        cible.vie -= this.attaque - cible.defense;
    }
}