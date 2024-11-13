/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author anton
 */
// Classe Epee héritant de Arme
public class Epee extends Arme {
    private int finesse; // Paramètre propre à l'épée

    public Epee(String nom, int ATK, int finesse) {
        super(nom, ATK); // Initialisation des paramètres de la classe parent
        if (finesse < 100) {
            this.finesse = finesse;
        } else {
            throw new IllegalArgumentException("La finesse doit être < 100");
        }
    }

    public int getFinesse() {
        return finesse;
    }
    
    // Méthode toString pour afficher les informations de l'épée
    @Override
    public String toString() {
        return super.toString() + ", Finesse: " + finesse;
    }
}
