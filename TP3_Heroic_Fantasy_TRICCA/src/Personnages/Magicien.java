/**
 *
 * @author anton
 */
// Dans le package Personnages

package Personnages;
import Armes.Arme;
import Armes.Baton;
import java.util.List;

public class Magicien extends Personnage {
    private boolean Confirme;  // Si le magicien est confirmé ou non

    // Constructeur pour initialiser les paramètres du magicien
    public Magicien(String nom, int PV, boolean estConfirme) {
        super(nom, PV);
        this.Confirme = estConfirme;
    }

    // Getter et Setter pour la propriété estConfirme
    public boolean isEstConfirme() {
        return Confirme;
    }

    public void setEstConfirme(boolean estConfirme) {
        this.Confirme = Confirme;
    }

    // Méthode toString pour afficher les informations du magicien
    @Override
    public String toString() {
        return super.toString() + ", Confirme: " + Confirme;
    }

    public int compterArmesPreferes() {
        int count = 0;
        for (Arme arme : super.armes) {
            if (arme instanceof Baton) {
                count++;
            }
        }
        return count;
    }
}
