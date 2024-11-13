/**
 *
 * @author anton
 */

package Armes;

// Classe Baton héritant de Arme
public class Baton extends Arme {
    private int age; // Paramètre propre au bâton

    // Constructeur pour initialiser les paramètres du bâton
    public Baton(String nom, int ATK, int age) {
        super(nom, ATK); // Initialisation des paramètres de la classe parent
        if (age < 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("L'âge doit être < 100");
        }
    }

    public int getAge() {
        return age;
    }
    
    // Méthode toString pour afficher les informations du bâton
    @Override
    public String toString() {
        return super.toString() + ", Age: " + age;
    }
}
