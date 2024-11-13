/**
 *
 * @author anton
 */
// Dans le package Personnages

package Personnages;
import Armes.*;
import java.util.ArrayList;

public abstract class Personnage {
    private String nom;
    private int PV;
    ArrayList<Arme> armes;
    private Arme armeEnMain;

    // Constructeur pour initialiser le nom et le niveau de vie
    public Personnage(String nom, int PV) {
        this.nom = nom;
        this.PV = PV;
        this.armes = new ArrayList<>();
        this.armeEnMain = null;
    }
    
public void ajouterArme(Arme arme) {
        if (armes.size() < 5) {
            armes.add(arme);
            System.out.println(arme.getNom() + " ajoutée à l'inventaire.");
        } else {
            System.out.println("L'inventaire est plein. Impossible d'ajouter l'arme.");
        }
    }

public void equiperArme(String nomArme) {
        for (Arme arme : armes) {
            if (arme.getNom().equals(nomArme)) {
                armeEnMain = arme;
                System.out.println(arme.getNom() + " est maintenant équipée.");
                return;
            }
        }
        System.out.println("Aucune arme trouvée avec le nom " + nomArme);
    }

 public Arme getArmeEnMain() {
        return armeEnMain;
    }

 public abstract int compterArmesPreferes();

    // Méthode pour obtenir le niveau de vie
    public int getPV() {
        return PV;
    }

    // Méthode pour obtenir le nom du personnage
    public String getNom() {
        return nom;
    }

    // Méthode toString pour afficher le nom et le niveau de vie
    @Override
    public String toString() {
        String armeInfo = (armeEnMain != null) ? "Arme en main: " + armeEnMain.toString() : "Pas d'arme en main";
        return "Nom: " + nom + ", PV: " + PV + ", " + armeInfo;
    }
}

