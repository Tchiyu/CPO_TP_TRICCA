/**
 *
 * @author anton
 */
// Dans le package Personnages

package Personnages;

public class Magicien extends Personnage {
    private boolean confirme;

    public Magicien(String nom, int PV, boolean confirme) {
        super(nom, PV);
        this.confirme = confirme;
        nombreMagiciens++;  // Incrémente le nombre de magiciens
    }

    @Override
    public void seFatiguer() {
        System.out.println(getNom() + " se fatigue et perd 10 PV.");
    }

    @Override
    public boolean estVivant() {
        return getPV() > 0;
    }

    @Override
    public void attaquer(Personnage cible) {
        System.out.println(getNom() + " attaque " + cible.getNom());
    }

    // Spécifique au magicien
    public boolean isConfirme() {
        return confirme;
    }
}
