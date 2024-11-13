/**
 *
 * @author anton
 */
// Dans le package Personnages

package Personnages;

import Armes.Arme;
import Armes.Epee;

public class Guerrier extends Personnage {
    private boolean ACheval;  // Si le guerrier est à cheval ou non

    // Constructeur pour initialiser les paramètres du guerrier
    public Guerrier(String nom, int PV, boolean estACheval) {
        super(nom, PV);
        this.ACheval = ACheval;
    }

    // Getter et Setter pour la propriété estACheval
    public boolean EstACheval() {
        return ACheval;
    }

    public void setEstACheval(boolean estACheval) {
        this.ACheval = ACheval;
    }

    // Méthode toString pour afficher les informations du guerrier
    @Override
    public String toString() {
        return super.toString() + ", A cheval: " + ACheval;
    }
 public int compterArmesPreferes() {
        int count = 0;
        for (Arme arme : super.armes) {
            if (arme instanceof Epee) {
                count++;
            }
        }
        return count;
    }
}
