package Armes;

/**
 *
 * @author anton
 */

public abstract class Arme {
    private String nom = "NA";
    private int ATK = 0;
    
public Arme(String nom, int ATK) {
    if (ATK <= 100) {
        this.nom = nom;
        this.ATK = ATK;
    } else {
        throw new IllegalArgumentException("Le niveau d'attaque doit être <= 100");
    } 
} 
public int getATK() {
        return ATK;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + "\n" + "Niveau dattaque: " + ATK;
    }
}
