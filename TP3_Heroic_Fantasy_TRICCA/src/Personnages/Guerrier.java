/**
 *
 * @author anton
 */
// Dans le package Personnages
package Personnages;

public class Guerrier extends Personnage {
    private boolean aCheval;

    public Guerrier(String nom, int PV, boolean aCheval) {
        super(nom, PV);
        this.aCheval = aCheval;
        nombreGuerriers++;  // Incrémente le nombre de guerriers
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

    // Spécifique au guerrier
    public boolean isACheval() {
        return aCheval;
    }
}
