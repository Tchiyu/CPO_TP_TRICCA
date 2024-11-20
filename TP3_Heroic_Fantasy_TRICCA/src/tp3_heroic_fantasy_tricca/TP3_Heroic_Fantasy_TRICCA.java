package tp3_heroic_fantasy_tricca;

import Armes.*;
import Personnages.*;

import java.util.ArrayList;
/**
 *
 * @author anton
 */

public class TP3_Heroic_Fantasy_TRICCA {

    public static void main(String[] args) {
        // Creation des armes
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        // Creation des personnages
        Magicien magicien = new Magicien("Gandalf", 100, false); // Magicien non confirmé
        Guerrier guerrier = new Guerrier("Conan", 120, true); // Guerrier à cheval

        // Ajout des armes
        magicien.ajouterArme(baton1);
        magicien.ajouterArme(epee1);
        guerrier.ajouterArme(epee1);
        guerrier.ajouterArme(baton2);

        // Équiper les personnages
        magicien.equiperArme("Chêne");
        guerrier.equiperArme("Excalibur");

        // Affichage des noms spécifiques
        System.out.println("Nom du magicien : " + magicien.getNom());
        System.out.println("Nom du guerrier : " + guerrier.getNom());

        // Affichage des compteurs
        System.out.println("Nombre de personnages: " + Personnage.nombrePersonnages);
        System.out.println("Nombre de guerriers: " + Personnage.nombreGuerriers);
        System.out.println("Nombre de magiciens: " + Personnage.nombreMagiciens);
    }
}
