/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_tricca;

/**
 *
 * @author anton
 */
public abstract class Arme {
    String nom = "NA";
    int ATK = 0;
    
    
    
    @Override
    public String toString() {
        return "Nom: " + nom + "\n" + "Niveau d’attaque: " + ATK;
    }
}
