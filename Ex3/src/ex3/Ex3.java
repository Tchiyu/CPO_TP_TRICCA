/*
TP0 Ex3
2024-2025
Anton TRICCA FG2
*/
package ex3;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean verif;
        int choix;
        choix = 0;
        Scanner sc = new Scanner(System.in);
        verif = false;
        while (verif == false) 
        {
            verif = false;
        System.out.println("Please enter the operator:\n" +
                            "1) add\n" +
                            "2) substract\n" +
                            "3) multiply\n" +
                            "4) divide\n" +
                            "5) modulo");
        choix=sc.nextInt(); // On demande a sc de donner le prochain entier
        if (choix < 6 && choix > 0) 
                   { 
                   verif = true;
                   }
        else if (choix > 5 || choix < 1)
        {System.out.println("Choice not available");}
        } 
        int operande1; // nb1
        System.out.println("Please enter the First number");
        operande1=sc.nextInt();
        int operande2; //nb2
        System.out.println("Please enter the Second number");
        operande2=sc.nextInt();
        
        
        int result;
        result= 1000;
        
        switch (choix) {
            case 1 : result = operande1 + operande2;
            case 2 : result = operande1 - operande2;
            case 3 : result = operande1 * operande2;
            case 4 : result = operande1 / operande2;
            case 5 : result = operande1 % operande2;
        }
        System.out.println("Value is: ");
        System.out.println(result);
    }
}
