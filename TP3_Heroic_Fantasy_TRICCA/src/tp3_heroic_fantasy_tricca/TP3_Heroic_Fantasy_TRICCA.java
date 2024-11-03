package tp3_heroic_fantasy_tricca;


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
    Baton baton1 = new Baton("Chêne", 4, 5 );
    Baton baton2 = new Baton( "Charme", 5, 6);
    
     ArrayList<Arme> armes = new ArrayList<>();
        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);
    for (int i = 0; i < armes.size(); i++) {
            Arme arme = armes.get(i); // Utilisation de get() pour accéder à l'élément
            if (arme instanceof Epee) {
                armes.finesse;
            }
            else if (arme instanceof Baton) {
                armes.age;
            }
    }
    
}
}