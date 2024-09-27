/*
TP0 Ex1
2024-2025
Anton TRICCA FG2
*/

package exo1;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        System.out.print("Bonjour ");
        System.out.println(prenom);
        
    }
    
}
