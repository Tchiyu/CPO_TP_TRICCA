/**
 *
 * @author anton
 */
// Dans le package Personnages
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

public abstract class Personnage {
    private String nom;
    private int PV;
    ArrayList<Arme> armes;
    private Arme armeEnMain;

    // Compteurs pour suivre le nombre de personnages, guerriers et magiciens
    public static int nombrePersonnages = 0;
    public static int nombreGuerriers = 0;
    public static int nombreMagiciens = 0;

    // Constructeur pour initialiser le nom et le niveau de vie
    public Personnage(String nom, int PV) {
        this.nom = nom;
        this.PV = PV;
        this.armes = new ArrayList<>();
        this.armeEnMain = null;

        // Incrémentation des compteurs
        nombrePersonnages++;
    }

    public String getNom() {
        return nom;  // méthode de base qui renvoie le nom du personnage
    }

    public int getPV() {
        return PV;
    }

    public ArrayList<Arme> getArmes() {
        return armes;
    }

    public void ajouterArme(Arme arme) {
        if (armes.size() < 5) {
            armes.add(arme);
        } else {
            System.out.println("Inventaire plein !");
        }
    }

    public void equiperArme(String nomArme) {
        for (Arme arme : armes) {
            if (arme.getNom().equals(nomArme)) {
                armeEnMain = arme;  // Equipement de l'arme
                System.out.println(nom + " a équipé l'arme : " + arme.getNom());
                return;  // Arme trouvée et équipée
            }
        }
        System.out.println("Aucune arme trouvée avec le nom : " + nomArme);
    }

    // Méthode toString pour afficher les informations du personnage
    @Override
    public String toString() {
        String armeInfo = (armeEnMain != null) ? "Arme en main: " + armeEnMain.toString() : "Pas d'arme en main";
        return "Nom: " + nom + ", PV: " + PV + ", " + armeInfo;
    }
    
    // Méthodes abstraites que chaque sous-classe doit implémenter
    public abstract void seFatiguer();
    public abstract boolean estVivant();
    public abstract void attaquer(Personnage cible);
}
