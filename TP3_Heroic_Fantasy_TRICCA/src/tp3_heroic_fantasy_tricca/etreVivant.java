package tp3_heroic_fantasy_tricca;

/**
 *
 * @author anton
 */
public interface etreVivant {
    void seFatiguer();           // Méthode pour fatiguer un personnage
    boolean estVivant();         // Méthode pour vérifier si le personnage est encore vivant
    void estAttaque(int points); // Méthode pour appliquer une attaque et diminuer les points de vie
}

