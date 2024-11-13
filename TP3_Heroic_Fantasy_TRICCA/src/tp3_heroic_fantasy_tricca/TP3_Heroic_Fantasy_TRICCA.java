package tp3_heroic_fantasy_tricca;

import Armes.*;
import Personnages.*;

import java.util.ArrayList;
/**
 *
 * @author anton
 */
public class TP3_Heroic_Fantasy_TRICCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Epee epee1 = new Epee("Excalibur", 7, 5);
    Epee epee2 = new Epee("Durandal", 4, 7);
    Baton baton1 = new Baton("Chene", 4, 5 );
    Baton baton2 = new Baton( "Charme", 5, 6);
    
     ArrayList<Arme> armes = new ArrayList<>();
        armes.add(epee1);  
        armes.add(epee2);  
        armes.add(baton1); 
        armes.add(baton2); 

for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i).toString());
        }
    Magicien magicien1 = new Magicien("Gandalf", 65, true);
    Magicien magicien2 = new Magicien("Garcimore", 44, false);
    Guerrier guerrier1 = new Guerrier("Conan", 78, false);
    Guerrier guerrier2 = new Guerrier("Lannister", 45, true);

ArrayList<Personnage> personnages = new ArrayList<>();
        personnages.add(magicien1);
        personnages.add(magicien2);
        personnages.add(guerrier1);
        personnages.add(guerrier2);

for (Personnage personnage : personnages) {
    System.out.println(personnage.toString());  // Affiche chaque personnage via la méthode toString()
        }
    }
}